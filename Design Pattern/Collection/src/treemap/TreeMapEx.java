package treemap;

import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<String, Integer> t = new TreeMap<String, Integer>();
		
		t.put("C", 3);
		t.put("A", 1);
		t.put("B", 2);
		t.put("A", 4);
		t.put("A", 9);
		
		System.out.println(t);
		
		System.out.println(t.size());
	}

}