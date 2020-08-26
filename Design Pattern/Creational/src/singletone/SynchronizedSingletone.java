package singletone;

public class SynchronizedSingletone {

	private SynchronizedSingletone(){
		
	}
	
	private static SynchronizedSingletone instance;
	
	public static synchronized SynchronizedSingletone getInstance(){
		
		if(instance == null)
			return new SynchronizedSingletone();
		else 
			return instance;
	}
}
