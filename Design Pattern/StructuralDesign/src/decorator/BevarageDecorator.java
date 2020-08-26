package decorator;

interface Bevarage{
	int getCost();
	String getDescription();
}

class Milk implements Bevarage {

	private Bevarage bevarage;
	
	Milk(Bevarage bevarage){
		this.bevarage = bevarage;
	}
	
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return this.bevarage.getCost()+10;
	}

	@Override
	public String getDescription() {
		return this.bevarage.getDescription()+" Milk";
	}
	
}

class Sugar implements Bevarage{

	Bevarage bevarage;
	
	Sugar(Bevarage bevarage){
		this.bevarage = bevarage;
	}
	
	@Override
	public int getCost() {
		return this.bevarage.getCost()+3;
	}

	@Override
	public String getDescription() {
		return this.bevarage.getDescription()+" Sugar";
	}
	
}

class CommonBevarage implements Bevarage {
	
	Bevarage bevarage;
	
	public CommonBevarage(Bevarage bevarage) {
		this.bevarage = bevarage;
	}
	
	CommonBevarage(){
		
	}

	@Override
	public int getCost() {
		return 3;
	}

	@Override
	public String getDescription() {
		return " common";
	}
	
}

public class BevarageDecorator {

	public static void main(String[] args) {

		Bevarage b = new Sugar(new Sugar(new Milk(new CommonBevarage())));
		System.out.println("cost : " + b.getCost());
		System.out.println("Desc : "+b.getDescription());
	}

}
