package problems;

import problems.CheckDuplicates;

public class CheckDuplicatesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,8,7,3,2};
		int b[] = {3,8,7,1,2};
		int c[] = {3,8,7,6,2,8};
		int d[] = {3,8,7,3,1,2,1};

		System.out.println(new CheckDuplicates().isDuplicateFound(a));
		System.out.println(new CheckDuplicates().isDuplicateFound(b));
		System.out.println(new CheckDuplicates().isDuplicateFound(c));
		System.out.println(new CheckDuplicates().isDuplicateFound(d));
	}

}
