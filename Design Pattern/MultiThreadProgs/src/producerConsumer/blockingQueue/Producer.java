package producerConsumer.blockingQueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

	private final BlockingQueue<Integer> sharedQueue;
	
	public Producer(BlockingQueue<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {

		for(int i=1;i<=10;i++){
			
			try {
				sharedQueue.put(i);
				System.out.println("Produced : "+i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
}
