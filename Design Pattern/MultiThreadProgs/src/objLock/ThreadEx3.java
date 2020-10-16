package objLock;

public class ThreadEx3 {

	public static void main(String args[]){
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		Thread t1 = new Thread(e1::work);
		t1.start();
		
		Thread t2 = new Thread(e2::work);
		t2.start();
		
	}
}
