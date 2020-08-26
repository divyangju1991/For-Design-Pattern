package subject;

public class BuildHeap {

	public void buildHeap(BinaryHeap h, int[] a, int n){
		
		if(h == null)
			return;
		
		while(n > h.capacity)
			h.resizeHeap();
		
		for(int i =0; i<n; i++)
			h.array[i] = a[i];
		
		h.count = n;
		
		if(h.heap_type == BinaryHeap.MAX_HEAP){
			for(int i=n/2- 1; i>=0; i--)
				h.percolateDown(i);
			
		} else {
			for(int i=(n-1)/2; i>=0; i--)
				h.percolateUp(i);
		}
			
	}
	
}