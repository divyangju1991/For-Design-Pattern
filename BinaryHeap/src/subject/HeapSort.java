package subject;

import java.util.Arrays;

public class HeapSort {

	//TO DO Method
	public int[] heapSort(int a[]){
		
		//Temp Purpose
		//Arrays.sort(a);
		int n = a.length;
		
		BinaryHeap h = new BinaryHeap(n, BinaryHeap.MAX_HEAP);
		int i, tmp;
		
		new BuildHeap().buildHeap(h, a, n);
		
		int old_count = h.count;
		
		for(i=n-1; i>0;i--){
			tmp = h.array[0];
			h.array[0] = h.array[i];
			h.array[i] = tmp;
			h.count = i;
			h.percolateDown(0);
		}
		
		h.count = old_count;
		
		return h.array;
	}
}
