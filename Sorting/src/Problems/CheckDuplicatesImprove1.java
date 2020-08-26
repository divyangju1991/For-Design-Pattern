package Problems;

import subject.HeapSort;

public class CheckDuplicatesImprove1 {

	public boolean isDuplicatesFoundInArray(int a[], int n){
		
		new HeapSort().heapSort(a);//BinaryHeap
		
		for(int i=0; i<n-1; i++){
			
			if(a[i] == a[i+1]){
				return true;
			}
		}
		
		return false;
	}
}
