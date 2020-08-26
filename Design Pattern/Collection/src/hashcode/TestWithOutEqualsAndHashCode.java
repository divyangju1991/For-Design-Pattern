package hashcode;

import java.util.Arrays;

import java.util.Map;

import map.HashMap;

public class TestWithOutEqualsAndHashCode {

public static void main(String[] args){
		
		EmployeeWithOutEquals e1 =new EmployeeWithOutEquals(1, "Divyang");
		EmployeeWithOutEquals e2 =new EmployeeWithOutEquals(1, "Divyang");
		EmployeeWithOutEquals e6 =new EmployeeWithOutEquals(1, "Divyang");
		
		HashMap<EmployeeWithOutEquals, Object> map = new HashMap<EmployeeWithOutEquals, Object>(2);
		map.put(e1, "1");
		map.put(e2, "2");
		map.put(e6, "3");
		
		System.out.println(map);
		System.out.println(Arrays.asList(map));
		System.out.println(new EmployeeWithOutEquals(1, "Divyang"));
		System.out.println(new EmployeeWithOutEquals(1, "Divyang"));
		System.out.println(map.get(new EmployeeWithOutEquals(1, "Divyang")));
		System.out.println(map.get(new EmployeeWithOutEquals(1, "Divyang")));
		System.out.println(map.get(new EmployeeWithOutEquals(1, "Divyang")));
		
		EmployeeWithOutHashCode e3 =new EmployeeWithOutHashCode(1, "Divyang");
		EmployeeWithOutHashCode e4 =new EmployeeWithOutHashCode(1, "Divyang");
		EmployeeWithOutHashCode e5 =new EmployeeWithOutHashCode(1, "Divyang");
		
		HashMap<EmployeeWithOutHashCode, Object> map2 = new HashMap<EmployeeWithOutHashCode, Object>(2);
		map2.put(e3, "11");
		map2.put(e4, "12");
		map2.put(e5, "13");
		
		System.out.println(map2);
		System.out.println(map2.size());
		
		System.out.println(map2.get(new EmployeeWithOutHashCode(1, "Divyang")));
		System.out.println(map2.get(new EmployeeWithOutHashCode(1, "Divyang")));
		System.out.println(map2.get(new EmployeeWithOutHashCode(1, "Divyang")));
		System.out.println(map2.get(new EmployeeWithOutHashCode(1, "Divyang")));
		System.out.println(map2.get(new EmployeeWithOutHashCode(1, "Divyang")));
		
	}

}
