package producerConsumer.withNotifySimple;

public class ProducerConsumerWithNotify {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Producer producer = new Producer();
		Consumer consumer = new Consumer(producer);
		
		Thread producerThread = new Thread(producer, "producer thread");
		Thread consumerThread = new Thread(consumer, "consumer thread");
		
		consumerThread.start();
		Thread.sleep(100);
		
		producerThread.start();
	}

}
