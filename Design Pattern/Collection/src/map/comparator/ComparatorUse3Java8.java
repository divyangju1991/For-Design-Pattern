package map.comparator;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class ComparatorUse3Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Zivyang");
		Employee emp2 = new Employee(1, "Zivyang");
		Employee emp3 = new Employee(2, "Kamlesh");
		Employee emp4 = new Employee(3, "Komal");
		
		
		Comparator<Employee> sortById = (e1, e2) -> e1.getId().compareTo(e2.getId());
		
		Comparator<Employee> sortByName = (e1, e2) -> e1.getName().compareTo(e2.getName());
		
		Map<Employee, Integer> map = new TreeMap<Employee, Integer>(sortById); 
		map.put(emp4, emp4.getId());
		map.put(emp2, emp2.getId());
		map.put(emp3, emp3.getId());
		map.put(emp, emp.getId());
		
		System.out.println("map : "+map.toString());
		
		System.out.println("map : "+map.toString());
		
		map = new TreeMap<Employee, Integer>(sortByName); 
		map.put(emp4, emp4.getId());
		map.put(emp2, emp2.getId());
		map.put(emp3, emp3.getId());
		map.put(emp, emp.getId());
		System.out.println("map : "+map.toString());
		
		Comparator<Map.Entry<Employee, Integer>> sortByName2 = (e1, e2) -> e1.getKey().getName().compareTo(e2.getKey().getName());
		
		Comparator<Map.Entry<Employee, Integer>>  sortById2 = (e1, e2) -> e1.getValue().compareTo(e2.getValue());
		
		map = new TreeMap<Employee, Integer>(sortById2); 
		map.put(emp4, emp4.getId());
		map.put(emp2, emp2.getId());
		map.put(emp3, emp3.getId());
		map.put(emp, emp.getId());
		
		System.out.println("map : "+map.toString());
		
		System.out.println("map : "+map.toString());
		
		map = new TreeMap<Employee, Integer>(sortByName2); 
		map.put(emp4, emp4.getId());
		map.put(emp2, emp2.getId());
		map.put(emp3, emp3.getId());
		map.put(emp, emp.getId());
		System.out.println("map : "+map.toString());
	}

}
