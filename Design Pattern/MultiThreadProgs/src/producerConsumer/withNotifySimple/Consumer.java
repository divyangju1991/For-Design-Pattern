package producerConsumer.withNotifySimple;

public class Consumer extends Thread{

	Producer producer;
	
	Consumer(Producer obj){
		producer = obj;
	}
	
	public void run(){
		
		synchronized (this.producer) {
			
			System.out.println("Consumer waiting for production to get over.");
			
			try {
				this.producer.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			int productSize = this.producer.sharedQueue.size();
			
			for(int i=0;i<productSize;i++){
				System.out.println("Consumed : "+this.producer.sharedQueue.remove(0)+" ");
			}
		}
	}
}
