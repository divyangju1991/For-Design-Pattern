package objLock;

public class ThreadEx2 {

	public static void main(String args[]){

		Employee e1 = new Employee();
		
		Runnable r = e1::work;
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r);
		t2.start();
		
	}
}
