package useSleep;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class ThreadSleepUsingMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		System.out.println("curr Time"+dtf.format(LocalDateTime.now()));
		waitThreadInSec();
		System.out.println("curr Time"+dtf.format(LocalDateTime.now()));
		System.out.println("curr Time"+dtf.format(LocalDateTime.now()));
	}
	
	private static void waitThreadInSec(){
		
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
