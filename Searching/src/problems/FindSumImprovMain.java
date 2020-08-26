package problems;

public class FindSumImprovMain {

	public static void main(String args[]){
	
		int a[] = {1,2,3,6,7};
		
		System.out.println(new FindSumImprov().findSum(a, 5));
		System.out.println(new FindSumImprov().findSum(a, 3));
		System.out.println(new FindSumImprov().findSum(a, 2));
		System.out.println(new FindSumImprov().findSum(a, 9));
	}
}
