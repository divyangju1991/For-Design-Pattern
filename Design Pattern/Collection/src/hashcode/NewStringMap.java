package hashcode;

import java.util.HashMap;
import java.util.Map;

public class NewStringMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<String, String>();
		map.put(new String("Divu"), "1");
		map.put(new String("Divu"), "2");
		
		System.out.println("Size : " +map.size());
		
		System.out.println(map.get(new String("Divu")));
		
		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(new Integer(1), "1");
		map2.put(new Integer(1), "2");
		
		System.out.println("map2 Size : "+map2.size());
		
		System.out.println(map2.get(new Integer(1)));
	}

}