package problems;

import java.util.HashMap;

public class FindMissingNumberImproved4 {

	
	public int findMissingNumber(int a[]){
		
		int i, x = a[0], y = 1, n =a.length;
		
		for(i=1;i<n;i++){
			x = x ^ a[i];
		}
		
		for(i=2;i<=n+1;i++){
			y = y ^ i;
		}
		
		return x ^ y;
	}
}
