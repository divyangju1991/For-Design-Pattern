package Problems.interview;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {99, 6, 99, 99, 1, 7, 6, 7};
		FindDuplicate obj = new FindDuplicate();
		obj.findDuplicate(arr, arr.length);
	}

	private void findDuplicate(int arr[], int n){
		
		for(int i=0; i<n; i++){
			arr[arr[i] % n] += n;
		}
		
		for(int i=0; i<n; i++){
			
			if(arr[i] >= n*2){
				System.out.println(i + "");
				System.out.println(arr[i] + "");
				//System.out.println((arr[i] - n) + "");
			}
		}
	}
}
