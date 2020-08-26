package subject;

import java.util.Arrays;

public class QuickSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {170, 45, 75, 90, 802, 24, 2, 66};
		
		int n = a.length;
		
		int b[] = {17, 4, 75, 9, 802, 2, 12, 66};
		int n2 = b.length;
		
		new QuickSort().quickSort(a, 0, a.length-1);
		
		System.out.println(Arrays.toString(a));
		
		new QuickSort().quickSort(b, 0, b.length-1);
		System.out.println(Arrays.toString(b));
		
	}

}
