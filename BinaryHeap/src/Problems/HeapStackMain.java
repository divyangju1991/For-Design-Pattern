package Problems;

import subject.BinaryHeap;
import subject.BuildHeap;

public class HeapStackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryHeap h = new BinaryHeap(10, BinaryHeap.MIN_HEAP);
		
		int[] a = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		new BuildHeap().buildHeap(h, a, a.length);
		
		HeapStack s = new HeapStack(h);
		
		System.out.println(s.toString());
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
