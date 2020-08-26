package semaphore.producerconsumer;

import java.util.concurrent.Semaphore;

public class ProducerConsumerSemaphore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Semaphore producerSemaphore = new Semaphore(1);
		Semaphore consumerSemaphore = new Semaphore(0);
		
		new Thread(new Producer(producerSemaphore, consumerSemaphore)).start();
		
		new Thread(new Consumer(consumerSemaphore, producerSemaphore)).start();
	}

}
