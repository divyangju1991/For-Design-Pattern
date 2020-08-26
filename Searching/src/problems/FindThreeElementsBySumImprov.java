package problems;

import subject.HeapSort;

public class FindThreeElementsBySumImprov {

	public boolean findThreeElementsBySum(int a[], int sum){
		
		new HeapSort().heapSort(a);
		int n = a.length;
		
		for(int k=0;k<n;k++){
			
			for(int i=k+1, j=n-1; i<j;){
				
				if(a[i] + a[j] + a[k] == sum){
					System.out.println("i = "+ a[i] + ", j= "+ a[j] + ", k = "+ a[k]);
					return true;
				} else if(a[i] + a[j] + a[k] < sum){
					i = i+1;
				} else{
					j = j-1;
				}
			}
		}
		
		return false;
	}
}
