package subject;

import java.util.Arrays;

public class RadixSortingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {170, 45, 75, 90, 802, 24, 2, 66};
		
		int n = a.length;
		
		int b[] = {17, 4, 75, 9, 802, 2, 12, 66};
		int n2 = b.length;
		
		System.out.println(Arrays.toString(new RadixSorting().radixSort(a, n)));
		System.out.println(Arrays.toString(new RadixSorting().radixSort(b, n2)));
		
	}

}
