package problems;

public class PivotBinarySearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		
		System.out.println(new PivotBinarySearch().search(a, a.length, 5));
		
		System.out.println(""+new SearchImproved().search(a, 0, a.length-1, 20));
		
		System.out.println(""+new SearchImproved().search(a, 0, a.length-1, 3));
	}

}
