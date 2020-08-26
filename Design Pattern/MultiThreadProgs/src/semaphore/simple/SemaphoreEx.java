package semaphore.simple;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {

	public static int sharedVariable = 0;
	public static void main(String[] args) {

		Semaphore semaphore = new Semaphore(1);
		IncrementSemaphore iSemaphore = new IncrementSemaphore(semaphore);
		new Thread(iSemaphore, "incrementThread").start();
		
		DecrementSemaphore dSemaphore = new DecrementSemaphore(semaphore);
		new Thread(dSemaphore, "decrementThread").start();
		
	}

}
