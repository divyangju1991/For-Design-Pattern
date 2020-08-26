package map.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorUse2Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Zivyang");
		Employee emp2 = new Employee(1, "Zivyang");
		Employee emp3 = new Employee(2, "Kamlesh");
		Employee emp4 = new Employee(3, "Komal");
		
		
		Comparator<Employee> sortById = (e1, e2) -> e1.getId().compareTo(e2.getId());
		
		Comparator<Employee> sortByName = (e1, e2) -> e1.getName().compareTo(e2.getName());
		
		Set<Employee> set = new TreeSet<Employee>(sortById); 
		set.add(emp4);
		set.add(emp2);
		set.add(emp3);
		set.add(emp);
		
		System.out.println("list : "+set.toString());
		
		System.out.println("set : "+set.toString());
		
		set = new TreeSet<>(sortByName); 
		set.add(emp4);
		set.add(emp2);
		set.add(emp3);
		set.add(emp);
		System.out.println("set : "+set.toString());
	}

}
