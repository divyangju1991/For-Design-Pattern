package arrayOperation;

import java.util.HashMap;
import java.util.Map;

public class FindSumPairs {
	
	
	public static int findSumPairs(int[] a, int k){
		
		if(a == null){
			return 0;
		}
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int len = a.length;
		int sum = 0;
		int counter = 0;
		int num = 0;
		
		for(int i=0; i<len; i++){
			
			if(k >= 0){
				num = Math.abs(a[i]);
			} else {
				num = a[i];
			}

			sum = sum + num;
			
			if(sum-k ==0){
				++counter;
			} else if(map.containsKey(sum-k)){
				++counter;
			} else {
				map.put(sum, i);
			}
		}
		
		return counter;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {7, 3, 2, 8, 10, 0};
		int[] b = {-2, -2, 2, 2, 0, -4};
		
		System.out.println(findSumPairs(a, 10));
		System.out.println(findSumPairs(b, -4));
	}

}
