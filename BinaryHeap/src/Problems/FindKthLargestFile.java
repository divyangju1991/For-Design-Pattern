package Problems;

import java.util.Arrays;

import subject.BinaryHeap;
import subject.BuildHeap;

public class FindKthLargestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryHeap h = new BinaryHeap(10, BinaryHeap.MIN_HEAP);
		int[] a = {10, 9, 8, 7, 6, 5, 34, 4, 3, 2, 1};
			
		new BuildHeap().buildHeap(h, a, a.length);

		System.out.println("Min heap : " +Arrays.toString(h.array));
		
		System.out.println("Minimum : " + h.getMaximum());

		System.out.println(" findKthLargestFile for 3rd index : "+ new FindKthLargestFile().findKthLargestFile(h, 3));
		
		System.out.println("After found Min heap : " +Arrays.toString(h.array));
	}

	public int findKthLargestFile(BinaryHeap h, int k){
		
		for(int i=0; i<k-1; i++){
			h.deleteMin();
		}
		
		return h.deleteMin();
	}
}
