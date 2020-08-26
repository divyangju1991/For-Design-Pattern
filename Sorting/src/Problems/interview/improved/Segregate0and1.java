package Problems.interview.improved;

import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Segregate0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,1,1,0,0,0};
		
		Segregate0and1 sort = new Segregate0and1();
		sort.segregate0and1(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}

	public void segregate0and1(int arr[], int n){
		
		IntPredicate p = num -> (num == 0);
		int j = -1;
		
		for(int i=0; i<n; i++){
			
			if(p.test(arr[i])){
				j++;
				swap(arr, i, j);
			}
		}
	}

	private void swap(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}
