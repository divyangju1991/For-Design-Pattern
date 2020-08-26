package problems;

public class FindFirstDuplicateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,8,7,3,2};
		int b[] = {3,8,7,1,2};
		int c[] = {3,8,7,6,2,2,2,8};
		int d[] = {3,8,7,3,1,2,1};
		int x[] = {1,2,3,4};
		
		System.out.println(new FindFirstDuplicate().findFirstDuplicate(a));
		System.out.println(new FindFirstDuplicate().findFirstDuplicate(b));
		System.out.println(new FindFirstDuplicate().findFirstDuplicate(c));
		System.out.println(new FindFirstDuplicate().findFirstDuplicate(d));
		System.out.println(new FindFirstDuplicate().findFirstDuplicate(x));
		
	}

}
