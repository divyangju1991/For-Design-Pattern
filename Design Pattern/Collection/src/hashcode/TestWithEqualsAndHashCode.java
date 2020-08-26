package hashcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestWithEqualsAndHashCode {

	
	public static void main(String[] args){
		
		Employee e1 =new Employee(1, "Divyang");
		Employee e2 =new Employee(1, "Divyang");
		
		Map<Employee, Object> map = new HashMap<Employee, Object>();
		map.put(e1, "1");
		map.put(e2, "2");
		
		System.out.println(map);
		
		System.out.println(map.get(new Employee(1, "Divyang")));
		System.out.println(map.get(new Employee(1, "Divyang")));
	}
	
}
