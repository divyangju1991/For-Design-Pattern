package problems;

import java.util.Arrays;

import subject.HeapSort;

public class SearchFromMidkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,3,7,4,9,6,5};//1,3,4,5,6,7,9
		new HeapSort().heapSort(a);
		System.out.println(Arrays.toString(a));
		
		System.out.println(new SearchFromMidk().search(a));
		
		int b[] = {1,-3,-7,-4,9,6,5};
		new HeapSort().heapSort(b);
		System.out.println(Arrays.toString(b));
		System.out.println(new SearchFromMidk().search(b));
		
	}

}
