package semaphore.simple;

import java.util.concurrent.Semaphore;

public class DecrementSemaphore implements Runnable {

	Semaphore semaphore;
	
	DecrementSemaphore(Semaphore semaphore){
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		
		try {
			semaphore.acquire();
			
			for(int i=0;i<5;i++){
				System.out.println("DecrementThread "+SemaphoreEx.sharedVariable--);
			}
			
			semaphore.release();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
