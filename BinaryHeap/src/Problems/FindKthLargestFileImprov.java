package Problems;

import java.util.Arrays;

import subject.BinaryHeap;
import subject.BuildHeap;

public class FindKthLargestFileImprov {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryHeap hOrig = new BinaryHeap(10, BinaryHeap.MIN_HEAP);
		int[] a = {10, 9, 8, 7, 6, 5, 34, 4, 3, 2, 1};
			
		new BuildHeap().buildHeap(hOrig, a, a.length);
		
		BinaryHeap hAux = new BinaryHeap(10, BinaryHeap.MIN_HEAP);

		System.out.println("Min heap : " +Arrays.toString(hOrig.array));
		
		System.out.println("Minimum : " + hOrig.getMaximum());
		
		System.out.println(" findKthLargestFile for 3rd index : "+ new FindKthLargestFileImprov().findKthLargestFile(hOrig, hAux, 3));

		System.out.println("After found hOrig Min heap : " +Arrays.toString(hOrig.array));
		
		System.out.println("After found hAux Min heap : " +Arrays.toString(hAux.array));
		
		System.out.println(" findKthLargestFile for 5th index : "+ new FindKthLargestFileImprov().findKthLargestFile(hOrig, hAux, 5));
		
		System.out.println("After found hOrig Min heap : " +Arrays.toString(hOrig.array));
		
		System.out.println("After found hAux Min heap : " +Arrays.toString(hAux.array));
		
	}

	public int findKthLargestFile(BinaryHeap hOrig, BinaryHeap hAux, int k){
		
		int heapElement;
		int count = 0;
		
		//hOrig.insert(heapElement);
		
		while(true){
			
			heapElement = hOrig.deleteMin();
			hAux.insert(heapElement);
			
			if(++count == k){
				return heapElement;
			} 
		}
	}
}
