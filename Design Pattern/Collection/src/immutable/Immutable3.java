package immutable;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class Immutable3 {

	private final Integer id;
	
	private final String name;
	
	private final List<String> list;
	
	
	public Immutable3(Integer id, String name, String[] string){
		this.id = id;
		this.name = name;
		this.list = Collections.unmodifiableList(string); //Arrays.asList(string);
		
		//assign all variables with new keyword
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public List<String> getList() {
		return list;
	}

	
}
