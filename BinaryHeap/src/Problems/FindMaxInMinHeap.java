package Problems;

import java.util.Arrays;

import subject.BinaryHeap;
import subject.BuildHeap;

public class FindMaxInMinHeap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryHeap h = new BinaryHeap(10, BinaryHeap.MIN_HEAP);
		int[] a = {10, 9, 8, 7, 6, 5, 34, 4, 3, 2, 1};
			
		new BuildHeap().buildHeap(h, a, a.length);

		System.out.println("Min heap : " +Arrays.toString(h.array));
		
		System.out.println("Minimum : " + h.getMaximum());
		
		System.out.println("FindMaxInMinHeap : "+new FindMaxInMinHeap().findMaxInMinHeap(h));
	}
	
	public int findMaxInMinHeap(BinaryHeap heap){
		int max = -1;
		
		for(int i = (heap.count+1)/2;i<heap.count;i++){
			
			if(heap.array[i] > max)
				max = heap.array[i];
		}
		
		return max;
	}

}
