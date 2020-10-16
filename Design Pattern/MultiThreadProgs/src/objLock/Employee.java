package objLock;

import java.time.LocalTime;

public class Employee {

	public synchronized void work(){
		System.out.println("start : "+Thread.currentThread().getName()+" : "+LocalTime.now());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end : "+Thread.currentThread().getName()+" : "+LocalTime.now());
	}
}
