package map.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ComparatorUse4Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(1, "Zivyang");
		Employee emp2 = new Employee(1, "Zivyang");
		Employee emp3 = new Employee(2, "Kamlesh");
		Employee emp4 = new Employee(3, "Komal");
		
		
		Comparator<Map.Entry<Employee, Integer>> sortById = (e1, e2) -> e1.getValue().compareTo(e2.getValue());
		
		Comparator<Map.Entry<Employee, Integer>> sortByName = (e1, e2) -> e1.getKey().getName().compareTo(e2.getKey().getName());
		
		Map<Employee, Integer> map = new HashMap<Employee, Integer>(); 
		map.put(emp4, emp4.getId());
		map.put(emp2, emp2.getId());
		map.put(emp3, emp3.getId());
		map.put(emp, emp.getId());
		
		
		
		System.out.println("map : "+map.toString());
		
		List<Entry<Employee, Integer>> entrySet = new ArrayList<Map.Entry<Employee,Integer>>(map.entrySet());
		Collections.sort(entrySet, sortById);
		System.out.print("\nAfter sorting by value(ascending): ");
        for(Map.Entry<Employee, Integer> entry:entrySet)
         System.out.print(entry.getKey()+"="+entry.getValue()+"  ");
		
		map = new HashMap<Employee, Integer>(); 
		map.put(emp4, emp4.getId());
		map.put(emp2, emp2.getId());
		map.put(emp3, emp3.getId());
		map.put(emp, emp.getId());
		entrySet = new ArrayList<Map.Entry<Employee,Integer>>(map.entrySet());
		Collections.sort(entrySet, sortByName);
		System.out.print("\nAfter sorting by value(ascending): ");
        for(Map.Entry<Employee, Integer> entry:entrySet)
         System.out.print(entry.getKey()+"="+entry.getValue()+"  ");
	}
}
