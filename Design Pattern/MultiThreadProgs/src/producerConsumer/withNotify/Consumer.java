package producerConsumer.withNotify;

import java.util.List;

public class Consumer implements Runnable {

	List<Integer> sharedQueue;
	Consumer(List<Integer> sharedQueue){
		this.sharedQueue = sharedQueue;
	}
	
	public void run(){
		while(true){
			try {
				consume();
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private void consume() throws InterruptedException{
		
		synchronized (sharedQueue) {
			
			while(sharedQueue.isEmpty()){
				System.out.println("SharedQueue is Empty, consumerThread is waiting for " +
			                       "producerThread to produce");
				sharedQueue.wait();
			}
		}
		
		synchronized (sharedQueue) {
			Thread.sleep((long) Math.random() * 2000);
			System.out.println("Consumed "+sharedQueue.remove(0));
			sharedQueue.notify();
		}
	}
}
