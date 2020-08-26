package producerConsumer.withNotifySimple;

import java.util.ArrayList;

public class Producer implements Runnable {
	
	ArrayList<Integer> sharedQueue;

	Producer(){
		sharedQueue = new ArrayList<Integer>();
	}
	
	@Override
	public void run() {
		
		synchronized(this){
			
			for(int i=1;i<=10;i++){
				sharedQueue.add(i);
				System.out.println("Producer is still producing, produced "+i);
				
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
				
			}
			
			System.out.println("Production is over, Consumer can consumer");
			this.notify();
		}
	}

}
