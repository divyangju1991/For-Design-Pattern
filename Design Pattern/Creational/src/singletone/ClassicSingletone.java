package singletone;

public class ClassicSingletone {

	private static ClassicSingletone instance;
	
	private ClassicSingletone(){
		
	}
	
	public static ClassicSingletone getInstance(){
		
		if(instance == null)
			return new ClassicSingletone();
		else
			return instance;
	}
}
