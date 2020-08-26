package subject;

import java.util.Arrays;

public class CounterSorting {

	public int[] counterSort(int a[], int k, int n){
		
		int i,j;
		int[] b = new int[n]; 
		int c[] = new int[k+1];
		
		System.out.println(Arrays.toString(c));
		
		//adding value as index and storing by incremental 
		for(j=0;j<n;j++){
			c[a[j]] = c[a[j]] +1;
		}
		System.out.println(Arrays.toString(c));
		
		//update value with adding previous value
		for(i=1;i<=k;i++){
			c[i] = c[i] + c[i-1];
		}
		System.out.println(Arrays.toString(c));
		
		//reverse array
		for(j=n-1;j>=0;j--){
		    b[c[a[j]]-1] = a[j];
			c[a[j]] = c[a[j]] - 1;
			System.out.println(Arrays.toString(b));
		}
		System.out.println(Arrays.toString(c));
		return b;
	}
}
