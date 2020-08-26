package map.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee(1, "Divyang");
		Employee emp2 = new Employee(1, "Divyang");
		Employee emp3 = new Employee(2, "Kamlesh");
		Employee emp4 = new Employee(3, "Komal");
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp4);
		list.add(emp2);
		list.add(emp3);
		list.add(emp);
		
		System.out.println("list : "+list.toString());
		
		Collections.sort(list);
		
		System.out.println("list : "+list.toString());
	}

}
