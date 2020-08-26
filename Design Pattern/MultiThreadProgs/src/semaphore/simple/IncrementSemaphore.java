package semaphore.simple;

import java.util.concurrent.Semaphore;

public class IncrementSemaphore implements Runnable {
	
	Semaphore semaphore;
	
	IncrementSemaphore(Semaphore semaphore){
		this.semaphore = semaphore;
	}

	@Override
	public void run() {
		
		try {
			System.out.println(Thread.currentThread().getName()+" has got permit");
			semaphore.acquire();
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+" "+SemaphoreEx.sharedVariable++);
			}
			
			semaphore.release();
			System.out.println(Thread.currentThread().getName()+" has got released");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
