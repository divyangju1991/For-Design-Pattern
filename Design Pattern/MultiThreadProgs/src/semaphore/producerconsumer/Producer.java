package semaphore.producerconsumer;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
	
	private Semaphore producerSemaphore;
	
	private Semaphore consumerSemaphore;
	
	Producer(Semaphore producerSemaphore, Semaphore consumerSemaphore){
		this.producerSemaphore = producerSemaphore;
		this.consumerSemaphore = consumerSemaphore;
	}

	@Override
	public void run() {

			try {
				
				for(int i=1;i<=5;i++){
					producerSemaphore.acquire();
					System.out.println("Produced : "+i);
					consumerSemaphore.release();
				}
				
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
