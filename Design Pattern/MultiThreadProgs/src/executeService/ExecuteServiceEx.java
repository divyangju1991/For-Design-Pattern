package executeService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteServiceEx {
	
	private static int nThreads = 2;
	
	private static int nTasks = 10;

	public static void main(String[] args) {

		ExecutorService executor = Executors.newFixedThreadPool(nThreads);
		System.out.println("Executors created 2 hreads");
		
		System.out.println("2 Threads in executor will be used for executong 10 tasks"+
							"So, at a time only 2 task will be executed");
		
		for(int i=1; i<= nTasks; i++){
			Runnable task = new MyRunnable(i);
			executor.execute(task);
		}
		
		executor.shutdown();
	}

}
