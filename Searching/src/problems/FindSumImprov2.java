package problems;

import java.util.HashMap;

public class FindSumImprov2 {
	

	public int[] findSum(int a[], int k){
		
		if(a.length < 2){
			return null;
		}
		
		int[] res = new int[2];
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<a.length; i++){
			
			if(map.containsKey(a[i])){
				res[0] = map.get(a[i]) + 1;
				res[1] = i + 1;
				return res;
			} else {
				map.put(k - a[i], i);
			}
		}
		
		return null;
	}
}
