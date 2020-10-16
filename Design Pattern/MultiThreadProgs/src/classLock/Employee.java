package classLock;

import java.time.LocalTime;

public class Employee {

	public static synchronized void work(){
		System.out.println("start : "+Thread.currentThread().getName()+" : "+LocalTime.now());
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end : "+Thread.currentThread().getName()+" : "+LocalTime.now());
	}
}
