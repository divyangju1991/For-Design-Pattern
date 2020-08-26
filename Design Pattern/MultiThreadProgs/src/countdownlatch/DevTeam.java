package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class DevTeam extends Thread{

	private CountDownLatch countDownLatch;

	public DevTeam(CountDownLatch countDownLatch, String name) {
		super(name);
		this.countDownLatch = countDownLatch;
	}
	
	@Override
	public void run(){
		System.out.println("Task assigned to Develope Team"+Thread.currentThread().getName());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Task finished by Developed team"+Thread.currentThread().getName());
		
		countDownLatch.countDown();
		
	}
}
