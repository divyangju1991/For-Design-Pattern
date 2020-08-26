package immutable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public final class Immutable2 {

	private final Integer id;
	
	private final String name;
	
	private final List<String> list;
	
	
	public Immutable2(Integer id, String name, String[] string){
		this.id = id;
		this.name = name;
		this.list = Arrays.asList(string);
		
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
