package Problems;

import java.util.Arrays;

import subject.BinaryHeap;
import subject.BuildHeap;

public class DeleteithInHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryHeap heap = new BinaryHeap(10, BinaryHeap.MAX_HEAP);
		
		int a[] = {10, 8, 7, 6, 5, 34, 4, 3, 2, 1};
		
		new BuildHeap().buildHeap(heap, a, a.length);
		
		System.out.println("Build Heap : " + Arrays.toString(heap.array));
		
		System.out.println("Minimun : " +heap.getMaximum());

		System.out.println("DeleteithInHeap : "+new DeleteithInHeap().delete(heap, 3));
		
		System.out.println("After deleted array : " + Arrays.toString(heap.array));
	}
	
	public int delete(BinaryHeap h, int i){
		
		int key;
		
		if(h.array.length < i){
			System.out.println("Wrong position");
			return Integer.MIN_VALUE;
		}
		
		key = h.array[i];
		h.array[i] = h.array[h.count-1];
		
		System.out.println("h.count == "+h.count);
		h.count--;
		h.percolateDown(i);
		
		return key;
	}

}
