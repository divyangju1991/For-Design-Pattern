package Problems;

import java.util.Arrays;

public class RemoveDuplicatesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
		
		int a[] = {3,8,7,3,2};
		int b[] = {3,8,7,3,2,7,2,3,8,8,8,8,8};
		int c[] = {3,8,7,3,2,3,8,7,3,2,3,8,7,3,2,7,7,7,1,7,1,7,1,7};
		int d[] = {2,2,2,2,2,2,2,3,8,7,3,2,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
		
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		Arrays.sort(d);
		
		removeDuplicates.removeDuplicates(a);
		removeDuplicates.removeDuplicates(b);
		removeDuplicates.removeDuplicates(c);
		removeDuplicates.removeDuplicates(d);
		
	}

}
