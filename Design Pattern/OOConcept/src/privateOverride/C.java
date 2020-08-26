package privateOverride;

public class C {

	/*
	public String getName(){
		return "C";
	}*/
	
	private String privateTest(){
		return "C";
	}
	
	protected String protectedTest(){
		return "C";
	}
	
	public String publicProtectedTest(){
		return "C";
	}
}
