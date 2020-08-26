package producerConsumer.withoutNotify;

public class Consumer extends Thread {

	Producer producer;
	
	Consumer(Producer obj){
		producer = obj;
	}
	
	public void run(){
		
		while(this.producer.productionInProgress){
			System.out.println("Consumer is wait till production is complete");
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		int productionSize = this.producer.list.size();
		for(int i=0;i<productionSize;i++){
			System.out.println("Consumed product "+this.producer.list.remove(0));
		}
	}
	
}
