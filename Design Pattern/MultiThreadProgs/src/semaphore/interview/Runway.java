package semaphore.interview;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Runway {

	  Semaphore semaphore = new Semaphore(4);

	  public void landThePlane() {

	    try {
	        semaphore.acquire();
	        // code to land the plane
	        System.out.println("The plane is landing");
	        Thread.sleep(3000); // just to show you in the console that the next 4 
	                            // threads will be executed afterwards - not imp 
	        semaphore.release();

	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	  
	  public void takeOffPlane() {

		    try {
		        semaphore.acquire();
		        // code to land the plane
		        System.out.println("The plane is takeOff");
		        Thread.sleep(3000); // just to show you in the console that the next 4 
		                  
		        // threads will be executed afterwards - not imp 
		        semaphore.release();

		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}

	public static void main(String[] args) {

	    Runway runway = new Runway();
	    ExecutorService executorService = Executors.newFixedThreadPool(10);
	    for (int i = 0; i < 10; i=i+2) {
	        executorService.execute(() -> runway.landThePlane());
	        executorService.execute(() -> runway.takeOffPlane());
	    }
	}
	}