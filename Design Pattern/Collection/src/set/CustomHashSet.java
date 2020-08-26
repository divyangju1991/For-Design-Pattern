package set;

import java.util.Map;

import map.HashMap;

public class CustomHashSet<E> {

	private Map<E, Object> customHashMap;
	
	public CustomHashSet(){
		customHashMap = new HashMap<E, Object>();
	}
	
	public void add(E e){
		customHashMap.put(e, null);
	}
	
	public boolean remove(E obj){
		return (boolean) customHashMap.remove(obj);
	}
	
}
