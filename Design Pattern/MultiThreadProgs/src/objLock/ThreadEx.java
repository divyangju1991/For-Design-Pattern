package objLock;

public class ThreadEx {

	public static void main(String args[]){

		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		Runnable r = e1::work;
		Runnable r2 = e2::work;
		
		Thread t1 = new Thread(r);
		t1.start();
		
		Thread t2 = new Thread(r2);
		t2.start();
		
	}
}
