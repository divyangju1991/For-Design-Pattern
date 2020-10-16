package inheritance;

class SuperEmployee2 {
	
	public void work(){
		System.out.println("Super Work");
		work();
	}
	
	public void test(){
		System.out.println("Super Test");
	}
}


public class Employee2 extends SuperEmployee2 {
	
	public void work(){
		System.out.println("Sub Work");
	}
	
	public void test(){
		super.work();
		System.out.println("Sub Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperEmployee2 e = new Employee2();
		e.test();
	}

}
