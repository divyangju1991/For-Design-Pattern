package producerConsumer.withoutNotify;

import java.util.ArrayList;
import java.util.List;

public class Producer implements Runnable {

	boolean productionInProgress;
	List<Integer> list;
	
	Producer(){
		list = new ArrayList<Integer>();
		productionInProgress = true;
	}

	@Override
	public void run() {
		
		for(int i=1; i<=10; i++){
			list.add(i);
			System.out.println("Producer is still producing, produced "+ i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("Production is over, Consumer can consume");
		
		productionInProgress = false;
	}
	
}
