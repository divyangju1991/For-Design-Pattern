package subject;

import java.util.Arrays;

public class CounterSortingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {3,6,9,1,2,4,5};
		int b[] = {2,9,1,7,3,5,8};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(new CounterSorting().counterSort(a, 9, a.length)));
		
		System.out.println();
		System.out.println("============ b Array ================");
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(new CounterSorting().counterSort(b, 9, a.length)));
		
	}

}
