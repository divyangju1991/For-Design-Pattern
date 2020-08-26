package subject;

import java.util.Arrays;

public class HeapSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeapSort hSort = new HeapSort();
		
		int a[] = {170, 45, 75, 90, 802, 24, 2, 66};
		
		int b[] = {17, 4, 75, 9, 802, 2, 12, 66};
		
		int c[] = {12, 11, 13, 5, 6, 7};
		
		System.out.println(Arrays.toString(hSort.heapSort(c)));
		
		System.out.println(Arrays.toString(hSort.heapSort(b)));
		
		System.out.println(Arrays.toString(hSort.heapSort(a)));
		
	}

}
