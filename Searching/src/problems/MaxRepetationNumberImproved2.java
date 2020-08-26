package problems;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaxRepetationNumberImproved2 {

	
	public int maxRepetationNumber(int a[]){
		
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++){
		
			if(map.containsKey(a[i])){
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
			
		}
		
		int maxRepeatedNo = a[0];
		int frequency = 0;
		
		for(Entry<Integer, Integer> entry : map.entrySet()){
			
			if(entry.getValue() > frequency){
				frequency = entry.getValue();
				maxRepeatedNo = entry.getKey();
			}
		}
		
		return maxRepeatedNo;
	}
}
