package singletone;

public class EagerSingletone {

	private EagerSingletone(){
		
	}
	
	private static EagerSingletone instance = new EagerSingletone();
	
	public static EagerSingletone getInstance(){
		return instance;
	}
}
