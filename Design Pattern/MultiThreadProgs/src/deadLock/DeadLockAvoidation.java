package deadLock;

class A2 implements Runnable {

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

class B2 extends Thread{
	
	public void run(){
		
		synchronized(String.class){
			
			System.out.println(Thread.currentThread().getName()+" has acquired lock on Object.class"+
								"and waiting to acquire lock in String class");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			synchronized (Object.class) {
				System.out.println(Thread.currentThread().getName()+" has acquired lock on String class");
			}
		}
		
		System.out.println(Thread.currentThread().getName()+" has ended");
	}
		
}

public class DeadLockAvoidation {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new A2(), "Thread 1");
		Thread t2 = new Thread(new B2(), "Thread 2");
		
		t1.start();
		t2.start();
	}

}
