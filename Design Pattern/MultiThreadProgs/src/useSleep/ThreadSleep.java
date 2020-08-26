package useSleep;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

public class ThreadSleep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		System.out.println("curr Time"+dtf.format(LocalDateTime.now()));
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("curr Time"+dtf.format(LocalDateTime.now()));
	}

}
