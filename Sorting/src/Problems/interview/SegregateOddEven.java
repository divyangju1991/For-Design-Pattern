package Problems.interview;

import java.util.Arrays;

public class SegregateOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Output : [10, 12, 24, 0, 3, 5, 7, 9]
		int[] arr = {10, 3, 5, 7, 12, 24, 0, 9};
		SegregateOddEven  segregateOddEven = new SegregateOddEven();
		segregateOddEven.rearrangeEvenAndOdd(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}

	public void rearrangeEvenAndOdd(int arr[], int n){
		
		int j = -1;
		
		for(int i=0; i<n; i++){
			
			if(arr[i] % 2 == 0){
				j++;
				swap(arr, i, j);
			}
			
		}
	}
	
	private void swap(int[] arr, int i, int j){
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}
}