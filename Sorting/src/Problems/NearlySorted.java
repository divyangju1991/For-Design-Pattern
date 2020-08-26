package Problems;

import java.util.Iterator;
import java.util.PriorityQueue;

public class NearlySorted {

	public void kSort(int a[], int n, int k){
		
		//Min Heap
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for(int i=0; i<k+1; i++){
			pq.add(a[i]);
		}
		
		int index=0;
		
		for(int i = k+1; i<n; i++){
			a[index++] = pq.peek();
			pq.poll();
			pq.add(a[i]);
		}
		
		Iterator<Integer> itr = pq.iterator();
		
		while(itr.hasNext()){
			a[index++] = pq.peek();
			pq.poll();
		}
	}
	
	
}
