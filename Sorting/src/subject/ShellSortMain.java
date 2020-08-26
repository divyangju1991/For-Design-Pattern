package subject;

import java.util.Arrays;

public class ShellSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1, 7, 6, 4, 5, 2, 3};
		
		new ShellSort().sort(a);
		
		System.out.println(Arrays.toString(a));
	}

}
