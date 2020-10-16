package groupingBy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e1 = new Employee("Rajkot", "R1");
		Employee e2 = new Employee("Rajkot", "R2");
		Employee e3 = new Employee("Rajkot", "R3");
		Employee e4 = new Employee("Rajkot", "R4");
		
		Employee e5 = new Employee("Ahmedabad", "A1");
		Employee e6 = new Employee("Ahmedabad", "A2");
		Employee e7 = new Employee("Ahmedabad", "A3");
		Employee e8 = new Employee("Ahmedabad", "A4");
		
		Employee e9 = new Employee("Mumbai", "M1");
		Employee e10 = new Employee("Mumbai", "M2");
		
		Employee e11 = new Employee("Hydrabad", "H1");
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e3);
		list.add(e4);
		list.add(e8);
		list.add(e5);
		list.add(e10);
		list.add(e1);
		list.add(e2);
		list.add(e6);
		list.add(e7);
		list.add(e9);
		list.add(e11);
		
		System.out.println(list.stream().collect(Collectors.groupingBy(Employee::getCity)));
		
		Map<String, List<Employee>> map = list.stream().collect(Collectors.groupingBy(Employee::getCity));
		
		System.out.println("======map=======");
		
		System.out.println(map);
	}

}
