package Problems;

import subject.HeapSort;

public class WhoWinElectionImprove1 {

	public int checkWhoWinTheElection(int a[]){
		
		int candidate = a[0], maxCounter = 0, n=a.length, counter=0;
		
		new HeapSort().heapSort(a);
		
		for(int i=0; i<n-1; i++){
			
			if(a[i] == a[i+1]){
				++counter;
			} else {
				counter = 1;
			}
			
			if(counter > maxCounter){
				maxCounter = counter;
				candidate = a[i];
			}
		}
		
		return candidate;
	}
}
