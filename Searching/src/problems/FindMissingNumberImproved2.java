package problems;

import java.util.HashMap;

public class FindMissingNumberImproved2 {

	
	public int findMissingNumber(int a[]){
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i=0;i<a.length;i++){
			
				map.put(a[i], 1);
				
		}
		
		for(int i=1;i<a.length+1;i++){
			
			if(!map.containsKey(i)){
				return i;
			}
		}
		
		return -1;
	}
}
