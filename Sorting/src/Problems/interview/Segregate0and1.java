package Problems.interview;

import java.util.Arrays;

public class Segregate0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,0,1,1,1,0,0,0};
		
		Segregate0and1 sort = new Segregate0and1();
		sort.segregate0and1(arr, arr.length);
		
		System.out.println(Arrays.toString(arr));
	}

	public void segregate0and1(int arr[], int n){
		
		int count = 0;
		
		for(int i=0; i<n; i++){
			
			if(arr[i] == 0){
				count++;
			}
		}
		
		for(int i=0; i<count; i++){
			arr[i] = 0;
		}
		
		for(int i=count; i<n; i++){
			arr[i] = 1;
		}
		
	}
}
