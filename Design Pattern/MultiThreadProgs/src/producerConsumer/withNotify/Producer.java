package producerConsumer.withNotify;

import java.util.List;

public class Producer implements Runnable{
	
	List<Integer> sharedQueue;
	public final static int MAX_SIZE = 2;
	
	Producer(List<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}

	@Override
	public void run() {
		for(int i=1;i<=10;i++){
			try {
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void produce(int i) throws InterruptedException{
		
		synchronized (sharedQueue) {
			if(sharedQueue.size() == MAX_SIZE){
				System.out.println("Queue is full, Producer Thread is waiting for "+
			                       "Consumer Thread to consume, sharedQueue size = "+MAX_SIZE);
				try {
					sharedQueue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		synchronized (sharedQueue) {
			sharedQueue.add(i);
			System.out.println("Produced "+i);
			Thread.sleep((long) Math.random() * 1000);
			sharedQueue.notify();
		}
	}
	

}
