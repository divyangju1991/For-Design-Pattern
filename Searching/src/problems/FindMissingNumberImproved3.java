package problems;

import java.util.HashMap;

public class FindMissingNumberImproved3 {

	
	public int findMissingNumber(int a[]){
		
		int n = a.length+1;
		int sum = (n * (n+1))/2;
		int missingNo = -1;
		int tmpSum = sum;
		
		for(int i=0; i<a.length; i++){
			tmpSum -= a[i]; 
		}
		
		missingNo = tmpSum;
		
		return missingNo;
	}
}
