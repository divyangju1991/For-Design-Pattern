package subject;

import java.util.Arrays;

public class BucketSortingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 17, 6, 14, 5, 2, 3};
		
		new BucketSorting().sort(a, 20);
		
		System.out.println(Arrays.toString(a));
	}

}
