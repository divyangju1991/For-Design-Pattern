package problems;

import subject.HeapSort;

public class CheckDuplicatesImprove1 {

	public boolean isDuplicateFound(int a[]){
		
		new HeapSort().heapSort(a);
		
		for(int i=0; i<a.length-1; i++){
			
			if(a[i] == a[i+1]){
				return true;
			}
		}
		
		return false;
	}
}
