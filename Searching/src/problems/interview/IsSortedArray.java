import java.util.Arrays;

public class IsSortedArray {

	public static boolean isSortedArray(int[] A, int n){
		
		if(n==1) {
			return true;
		}
		
		return (A[n-1] < A[n-2])? false:isSortedArray(A, n-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1};
		
		System.out.println(Arrays.toString(a)+ " = "+isSortedArray(a, a.length));
	  
		a = new int[]{2,3,5};
		
		System.out.println(Arrays.toString(a)+ " = "+isSortedArray(a, a.length));
		
		a = new int[]{2,3,5,1};
		
		System.out.println(Arrays.toString(a)+ " = "+isSortedArray(a, a.length));
		
        a = new int[]{5,3,2};
		
		System.out.println(Arrays.toString(a)+ " = "+isSortedArray(a, a.length));
		
	}
	

}
