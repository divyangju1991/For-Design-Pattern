package problems;

public class SearchWithPivotImprov2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Input array should be like first increment and stopped at point start again
				//First Part : 11,45,55,67,89
				//Second Part : 1,5,8,9
				int a[] = {11,45,55,67,89,1,5,8,9};
				
				SearchWithPivotImprov2 searchWithoutRecursive = new SearchWithPivotImprov2();
				boolean found = searchWithoutRecursive.search(a, 8);
				
				System.out.println("Binary Search = "+ found);
	}

}