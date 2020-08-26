package immutable;

import java.util.HashMap;

public final class Immutable {

	private final Integer id;
	
	private final String name;
	
	private final HashMap<Integer, String> map;
	
	public Immutable(Integer id, String name, HashMap map){
		this.id = id;
		this.name = name;
		
		//assign all variables with new keyword
		this.map = new HashMap<Integer, String>(map);
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public HashMap getMap() {
		//HashMap is mutable class
		return (HashMap<Integer, String>) map.clone();
	}
	
	
}
