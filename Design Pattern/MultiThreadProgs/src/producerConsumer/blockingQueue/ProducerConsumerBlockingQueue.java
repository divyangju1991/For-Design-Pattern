package producerConsumer.blockingQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerBlockingQueue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		BlockingQueue<Integer> sharedQueue = new LinkedBlockingQueue<Integer>();

		Producer producer = new Producer(sharedQueue);
		Consumer consumer = new Consumer(sharedQueue);
		
		Thread producerThread = new Thread(producer, "producer thread");
		Thread consumerThread = new Thread(consumer, "consumer thread");
		
		producerThread.start();
		consumerThread.start();
		
	}

}
