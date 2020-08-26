package schedularThreadPool;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import threadpool.Task;

public class SchedularThreadPoolEx {

	public static void main(String args[]){
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
		Runnable task1 = () -> { System.out.println("Demo Task 1");
								System.out.println("Task 1 curr Time => "+dtf.format(LocalDateTime.now()));
								try {
									TimeUnit.SECONDS.sleep(50);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("Demo Task 1  ended time => "+dtf.format(LocalDateTime.now()));
								};
		Runnable task2 = () -> { System.out.println("Demo Task 2");
								System.out.println("Task 2 curr Time => "+dtf.format(LocalDateTime.now()));
								try {
									TimeUnit.SECONDS.sleep(10);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("Demo Task 2  ended time => "+dtf.format(LocalDateTime.now()));
								};
		Runnable task3 = () -> { System.out.println("Demo Task 3");
								System.out.println("Task 3 curr Time => "+dtf.format(LocalDateTime.now()));
								try {
									TimeUnit.SECONDS.sleep(2);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("Demo Task 3 ended time => "+dtf.format(LocalDateTime.now()));
								};
		Runnable task4 = () -> { System.out.println("Demo Task 4");
								System.out.println("Task 4 curr Time => "+dtf.format(LocalDateTime.now()));
								try {
									TimeUnit.SECONDS.sleep(2);
								} catch (InterruptedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
								System.out.println("Demo Task 4 ended time => "+dtf.format(LocalDateTime.now()));
								};
		
		System.out.println("curr Time => "+dtf.format(LocalDateTime.now()));
		
		executor.schedule(task1, 5 , TimeUnit.SECONDS);
		System.out.println("curr Time => "+dtf.format(LocalDateTime.now()));
		
		executor.schedule(task2, 5 , TimeUnit.SECONDS);
		System.out.println("curr Time => "+dtf.format(LocalDateTime.now()));
		
		executor.schedule(task3, 5 , TimeUnit.SECONDS);
		System.out.println("curr Time => "+dtf.format(LocalDateTime.now()));
		
		executor.schedule(task4, 5 , TimeUnit.SECONDS);
		System.out.println("curr Time => "+dtf.format(LocalDateTime.now()));
		
	}
}

