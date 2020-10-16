package map.equalsAndHashCode;

import java.util.HashMap;

public class EmployeeHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee2 emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(144).setEmpName("Divyang");
		
		HashMap map = new HashMap();
		map.put(emp.getEmpId(), emp);
		
		emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(144).setEmpName("Komal");
		map.put(emp.getEmpId(), emp);
		
		emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(143).setEmpName("Divyang2");
		map.put(emp.getEmpId(), emp);
		
		emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(140).setEmpName("Divyang3");
		map.put(emp.getEmpId(), emp);
		
		System.out.println("Emp " + map.get(144).toString());
		
		
        emp.setEmpAdd("64 DEv").setEmpId(144).setEmpName("Divyang");
		
		map = new HashMap();
		map.put(emp, emp.getEmpId());
		
		emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(144).setEmpName("Komal");
		map.put(emp, emp.getEmpId());
		
		emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(143).setEmpName("Divyang2");
		map.put(emp, emp.getEmpId());
		
		emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(140).setEmpName("Divyang3");
		map.put(emp, emp.getEmpId());
		
		emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(144).setEmpName("Komal");
		map.put(emp, 001);
		
		emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(144).setEmpName("Komal");
		System.out.println("Emp " + map.get(emp));
		
		emp = new Employee2();
		emp.setEmpAdd("64 DEv").setEmpId(144).setEmpName("Divyang");
		System.out.println("Emp " + map.get(emp));
		
		System.out.println("map " + map);
	}

}
