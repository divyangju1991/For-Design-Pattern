package problems;

import java.util.HashMap;

public class FindFirstDuplicateImproved {

	public int findFirstDuplicate(int a[]){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int findFirstElement = -1; 
		
		for(int i=a.length-1; i>=0;i--){
			
			if(map.containsKey(a[i])){
				findFirstElement = a[i];
			} else {
				map.put(a[i], i);
			}
			
		}
		
		return findFirstElement;
	}
}
