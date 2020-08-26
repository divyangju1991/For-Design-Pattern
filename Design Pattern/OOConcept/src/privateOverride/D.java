package privateOverride;

public class D extends C {

	private String getName(){
		return "C";
	}
	
	public String privateTest(){
		return "C";
	}
	
	public String protectedTest(){
		return "C";
	}
	
	protected String publicProtectedTest(){
		return "C";
	}
}
