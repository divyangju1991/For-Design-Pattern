package problems;

import java.util.HashMap;
import java.util.Map.Entry;

public class MaxRepetationNumberImproved3 {

	
	public int maxRepetationNumber(int a[]){
		
		int i=0, max=0, maxIndex=0, n = a.length, tmpMaxValue=0;
		
		for(i=0;i<n;i++){
			a[a[i]%n] += n;
		}
		
			for(i=0; i<n; i++){
			
			if(a[i]/n >= max && a[i] > tmpMaxValue){
				tmpMaxValue = a[i];
				max = a[i]/n;
				maxIndex = i;
			}
		}
		
		return maxIndex;
	}
}
