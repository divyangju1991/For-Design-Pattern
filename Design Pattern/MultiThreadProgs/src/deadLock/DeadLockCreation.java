package deadLock;

class A implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (String.class) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread().getName() +" has acquire lock on String class"+
								" and waiting to acquire lock on object class");
			
			synchronized (Object.class) {
				
				System.out.println(Thread.currentThread().getName()+""+
									"has acquired lock on Object class");
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" has ended");
	}
	
}

class B extends Thread{
	
	public void run(){
		
		synchronized(Object.class){
			
			System.out.println(Thread.currentThread().getName()+" has acquired lock on Object.class"+
								"and waiting to acquire lock in String class");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (String.class) {
				System.out.println(Thread.currentThread().getName()+" has acquired lock on String class");
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" has ended");
	}
		
}

public class DeadLockCreation {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new A(), "Thread 1");
		Thread t2 = new Thread(new B(), "Thread 2");
		
		t1.start();
		t2.start();
	}

}
