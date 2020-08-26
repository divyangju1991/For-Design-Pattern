package map.concurrent;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("K1", "ABC");
		map.put("K2", "XYZ");
		map.put("K3", "123");
		
		System.out.println("map "+map.toString());
		
		map.putIfAbsent("K1", "234");
		
		System.out.println("map "+map.toString());
		
		map.putIfAbsent("K6", "789");
		
		System.out.println("map "+ map.toString());
	}

}
