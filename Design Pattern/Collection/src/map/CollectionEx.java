package map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionEx {

	HashMap map = new HashMap();
	
	public static void main(String args[]) {
		
		CollectionEx ce = new CollectionEx();
		
		System.out.println(ce.addInMap("1", Stream.of("a", "b", "c")
				  .collect(Collectors.toCollection(HashSet::new))));
		
		System.out.println(ce.addInMap("2", Stream.of("d", "e", "c")
				  .collect(Collectors.toCollection(HashSet::new))));
		
		System.out.println(ce.addInMap("1", Stream.of("b", "d", "c")
				  .collect(Collectors.toCollection(HashSet::new))));
	}
	
	public boolean addInMap(String key, Set value) {
		Set set = new HashSet();
		
		if(!map.containsKey(key)) {
			set = (Set) map.get(key);
			map.put(key, value);
			return true;
		}
		
		return false;
	}
	
}
