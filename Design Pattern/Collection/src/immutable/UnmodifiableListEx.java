package immutable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class UnmodifiableListEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l = new ArrayList();
		l.add("Divyang");
		l.add("Kam1");
		l.add("Kam2");
		
		Employee2 e1 = new Employee2("Divu", l);
		System.out.println(e1.getNames());
		
		l.add("Smith");
		
		System.out.println(e1.getNames());
		
		System.out.println(l.toString());
		
		//java.lang.UnsupportedOperationException
		//e1.getNames().add("Smith");
		
		//java.lang.UnsupportedOperationException by google-collections-1.0.jar  
		//e1.getNames().set(1, "Smith");
		
		System.out.println(e1.getNames());
		
		////java.lang.UnsupportedOperationException
		//e1.getNames().add("Smith");
		
		//java.lang.UnsupportedOperationException
		e1.getNames().set(1, "Kam144");
		
		System.out.println(e1.getNames());
	}

}

class Employee2 {

	private final String name;
	
	private List<String> names1; 
	
	
	public Employee2(String name, List<String> list){
		this.name = name;
		
		
		//String[] namesArr = list.toArray(new String[list.size()]);

		//Not worked because It give option to set
		//List<String> names = Arrays.asList(namesArr);
		this.names1 = Collections.unmodifiableList(list);
	}

	public String getName() {
		return name;
	}

	public List<String> getNames() {
		return names1;
	}
	
}