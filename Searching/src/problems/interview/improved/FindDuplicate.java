package problems.interview.improved;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

//o(n) and o(1) extra space
//numbers or input must be : o to n-1 
public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] arr = {99, 6, 99, 99, 1, 7, 6, 7};
		int[] arr = {9,3,2,9,4,5,6,7,1,0};
		FindDuplicate obj = new FindDuplicate();
		
		obj.findDuplicate(arr, arr.length);
	}

	private void findDuplicate(int arr[], int n){
		
		for(int i=0; i<n; i++){
			arr[arr[i] % n] += n;
		}
		
		BiPredicate<Integer, Integer> p = (v,l) -> (v >= l*2); 
		
		for(int i=0; i<n; i++){
			
			if(p.test(arr[i], n)){
				System.out.println(i + "");
				//System.out.println(arr[i] + "");
				//System.out.println((arr[i] - n) + "");
			}
		}
	}
}
