package immutable;

import java.util.Arrays;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class Employee {

	private final String name;
	
	private List<String> names1; 
	
	
	public Employee(String name, List<String> list){
		this.name = name;
		
		
		//String[] namesArr = list.toArray(new String[list.size()]);

		//Not worked because It give option to set
		//List<String> names = Arrays.asList(namesArr);
		this.names1 = ImmutableList.copyOf(list);
	}

	public String getName() {
		return name;
	}

	public List<String> getNames() {
		return names1;
	}
	
}
