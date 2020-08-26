package problems;

import subject.HeapSort;

public class MaxRepetationNumberImproved {

	
	public int maxRepetationNumber(int a[]){
		
		int counter = 0;
		int max = 0;
		int maxRepeatedNo = a[0];
		
		new HeapSort().heapSort(a);
		
		for(int i=0; i<a.length-1; i++){
			
			if(a[i] == a[i+1]){
				counter++;
			} else {
				counter=0;
			}
			
			if(counter>max){
				max = counter;
				maxRepeatedNo = a[i];
			}
		}
		
		return maxRepeatedNo;
	}
}
