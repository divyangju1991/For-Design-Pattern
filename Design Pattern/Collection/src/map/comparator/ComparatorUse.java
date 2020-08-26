package map.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Zivyang");
		Employee emp2 = new Employee(1, "Zivyang");
		Employee emp3 = new Employee(2, "Kamlesh");
		Employee emp4 = new Employee(3, "Komal");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp4);
		list.add(emp2);
		list.add(emp3);
		list.add(emp);
		
		System.out.println("list : "+list.toString());
		
		Collections.sort(list, new ComparatorById());
		
		System.out.println("list : "+list.toString());
		
		Collections.sort(list, new ComparatorByName());
		
		System.out.println("list : "+list.toString());
	}

}
