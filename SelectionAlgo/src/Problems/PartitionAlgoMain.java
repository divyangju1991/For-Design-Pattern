package Problems;

import java.util.Arrays;

public class PartitionAlgoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {11, 3, 5, 9, 1, 13, 15};
		int b[] = {1, 2, 3, 4, 5, 6, 7, 9};
		int c[] = {9, 8, 7, 6, 5, 3, 2, 1};
		int d[] = {9, 1, 7, 6, 5, 3, 2, 8};
		
		System.out.println(new PartitionAlgo().partition(a, 0, a.length-1));
		System.out.println(Arrays.toString(a));
		
		System.out.println(new PartitionAlgo().partition(b, 0, b.length-1));
		System.out.println(Arrays.toString(b));
		
		System.out.println(new PartitionAlgo().partition(c, 0, c.length-1));
		System.out.println(Arrays.toString(c));
		
		System.out.println(new PartitionAlgo().partition(d, 0, d.length-1));
		System.out.println(Arrays.toString(d));
		
	}

}
