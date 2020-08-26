package problems;

import java.util.Arrays;

public class FindSumImprovMain2 {

	public static void main(String args[]){
	
		int a[] = {1,2,3,6,7};
		int b[] = {1,2,3,4,5,6};
		
		System.out.println(Arrays.toString(new FindSumImprov2().findSum(a, 5)));
		System.out.println(Arrays.toString(new FindSumImprov2().findSum(a, 3)));
		System.out.println(Arrays.toString(new FindSumImprov2().findSum(a, 2)));
		System.out.println(Arrays.toString(new FindSumImprov2().findSum(a, 9)));
		
		System.out.println("===========================================");
		
		System.out.println(Arrays.toString(new FindSumImprov2().findSum(b, 5)));
		System.out.println(Arrays.toString(new FindSumImprov2().findSum(b, 3)));
		System.out.println(Arrays.toString(new FindSumImprov2().findSum(b, 7)));
		System.out.println(Arrays.toString(new FindSumImprov2().findSum(b, 9)));
		System.out.println(Arrays.toString(new FindSumImprov2().findSum(b, 11)));
	}
}
