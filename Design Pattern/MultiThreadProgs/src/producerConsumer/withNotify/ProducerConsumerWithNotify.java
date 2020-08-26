package producerConsumer.withNotify;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerWithNotify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		List<Integer> sharedQueue = new ArrayList<Integer>();

		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread producerThread = new Thread(producer, "producer thread");
		Thread consumerThread = new Thread(consumer, "consumer thread");
		
		consumerThread.start();
		Thread.sleep(100);
		
		producerThread.start();
	}

}
