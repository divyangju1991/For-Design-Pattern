package problems;

import subject.HeapSort;

public class FindMissingNumberImproved {

	
	public int findMissingNumber(int a[]){
		
		new HeapSort().heapSort(a);
		
		for(int i=0, incremental = 1; i<a.length; i++, incremental++){
			
			if(!(incremental == a[i])){
				return incremental;
			}
		}
		return -1;
	}
}
