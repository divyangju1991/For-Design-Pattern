package semaphore.producerconsumer;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
	
	private Semaphore consumerSemaphore;
	
	private Semaphore producerSemaphore;
	
	Consumer(Semaphore consumerSemaphore, Semaphore producerSemaphore){
		this.consumerSemaphore = consumerSemaphore;
		this.producerSemaphore = producerSemaphore;
	}

	@Override
	public void run() {
		
			try {
				for(int i=1;i<=5;i++){
					consumerSemaphore.acquire();
					System.out.println("consumed : "+i);
					producerSemaphore.release();
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
