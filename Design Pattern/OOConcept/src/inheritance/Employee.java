package inheritance;

class SuperEmployee {
	
	public void work(){
		System.out.println("Super Work");
		test();
	}
	
	public void test(){
		System.out.println("Super Test");
	}
}


public class Employee extends SuperEmployee {
	
	public void work(){
		System.out.println("Sub Work");
		test();
	}
	
	public void test(){
		super.work();
		System.out.println("Sub Test");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperEmployee e = new Employee();
		e.test();
	}

}
