package subject;

import java.util.Arrays;

public class RadixSorting {

	public int getMax(int a[]){
		
		int max = a[0];
		
		for(int i=0;i<a.length;i++){
			
			if(a[i]>max){
				max = a[i];
			}
		}
		
		return max;
	}
	
	public int[] counterSort(int a[], int n, int exp){
		
		int output[] = new int[n];
		
		int i;
		
		int count[] = new int[10];
		
		Arrays.fill(count, 0);
		
		//Store count of occurrences in count[] 
		for(i=0;i<n;i++){
			count[(a[i]/exp)%10]++;
		}
		
		//Change count[i] so that count[i] new contains
		//actual position of this digit in output[]
		for(i=1;i<10;i++){
			count[i] += count[i-1];
		}
		
		//build output array
		for(i=n-1;i>=0;i--){
			output[count[(a[i]/exp)%10] -1] = a[i];
			count[(a[i]/exp)%10]--;
		}
		
		for(i=0;i<n;i++){
			a[i] = output[i];
		}
		
		return a;
	}
	
	public int[] radixSort(int a[], int n){
		
		int m = getMax(a);
		int output[] = null;
		
		for(int exp =1; m/exp > 0; exp *= 10){
			output = counterSort(a, n, exp);
		}
		
		return output;
	}
}
