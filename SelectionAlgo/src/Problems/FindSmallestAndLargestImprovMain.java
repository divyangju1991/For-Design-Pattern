package Problems;

public class FindSmallestAndLargestImprovMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//even pair compulsory
		int[] a = {8,3,7,1,2,10};
		int[] b = {2,6,7,2,11,1};
		int[] c = {2,3,9,5,4,0};
		int[] d = {3,13,4,7,6,1};
		
		System.out.println(new FindSmallestAndLargestImprov().findSmallestAAndLargest(a));
		System.out.println(new FindSmallestAndLargestImprov().findSmallestAAndLargest(b));
		System.out.println(new FindSmallestAndLargestImprov().findSmallestAAndLargest(c));
		System.out.println(new FindSmallestAndLargestImprov().findSmallestAAndLargest(d));
	}

}
