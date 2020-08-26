package exceptionHandling;


public class ExceptionHandling {

	public static void main(String[] args){
		
		Thread.UncaughtExceptionHandler ex = (t, e) -> {
			System.out.println("Thread Name => "+ t.getName());
			System.out.println("ex => "+ e.getMessage());
		};
		
		Thread.setDefaultUncaughtExceptionHandler(ex);
		
		Runnable r = ExceptionHandling::run;
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t2.start();
		
		
		System.out.println("main method thread ended");
	}
	
	public static void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++){
			
			if(i>5){
				throw new RuntimeException("Custom Exception");
			}
			
		}
	}
}
