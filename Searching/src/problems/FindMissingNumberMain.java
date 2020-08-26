package problems;

public class FindMissingNumberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {5,2,1,4};
		int[] b = {5,2,1,3,8,7,6};
		int[] c = {1,2,4,5,6,3,8};
		int[] d = {1,2,3,4,5,7,8};
		
		System.out.println(new FindMissingNumber().findMissingNumber(a));
		System.out.println(new FindMissingNumber().findMissingNumber(b));
		System.out.println(new FindMissingNumber().findMissingNumber(c));
		System.out.println(new FindMissingNumber().findMissingNumber(d));
				
	}

}
