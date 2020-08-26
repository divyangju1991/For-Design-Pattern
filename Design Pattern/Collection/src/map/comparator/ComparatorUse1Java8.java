package map.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorUse1Java8 {

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
		
		Comparator<Employee> sortById = (e1, e2) -> e1.getId().compareTo(e2.getId());
		
		Comparator<Employee> sortByName = (e1, e2) -> e1.getName().compareTo(e2.getName());
		
		System.out.println("list : "+list.toString());
		
		Collections.sort(list, sortById);
		
		System.out.println("list : "+list.toString());
		
		Collections.sort(list, sortByName);
		
		System.out.println("list : "+list.toString());
	}

}
