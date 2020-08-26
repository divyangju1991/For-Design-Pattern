package subject;

import java.util.Arrays;

public class BubbleSortingImprovementMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1, 7, 6, 4, 5, 2, 3};
		
		new BubbleSortingImprovement().sort(a);
		
		System.out.println(Arrays.toString(a));
		
		int b[] = {1,2,3,7,6,5};
		new BubbleSortingImprovement().sort(b);
		
		System.out.println(Arrays.toString(b));
		
	}

}
