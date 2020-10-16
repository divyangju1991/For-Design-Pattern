package classLock;

public class ThreadEx3 {

	public static void main(String args[]){
		
		
		Thread t1 = new Thread(Employee::work);
		t1.start();
		
		Thread t2 = new Thread(Employee::work);
		t2.start();
		
	}
}
