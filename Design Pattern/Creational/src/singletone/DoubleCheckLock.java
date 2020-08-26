package singletone;

public class DoubleCheckLock {

	private DoubleCheckLock(){
		
	}
	
	private volatile static DoubleCheckLock instance;
	
	public static DoubleCheckLock getInstance(){
		
		if(instance == null){
			
			synchronized (DoubleCheckLock.class) {
				
				if(instance == null)
					return new DoubleCheckLock();
			}
		}
		
		return instance;
	}
}
