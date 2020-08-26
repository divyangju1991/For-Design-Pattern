package problems;

import subject.HeapSort;

public class FindSumImprov {
	

	public boolean findSum(int a[], int k){
		
		new HeapSort().heapSort(a);
		int tmp = 0;
		
		for(int i=0,j=a.length-1;i<j;){
			
			tmp = a[i] + a[j];
			
			if(tmp == k){
				System.out.println(" a[i] :"+a[i]+", a[j]"+a[j]);
				return true;
			}
			
			if(tmp < k){
			    i = i+1;	
			} else {
				j = j-1;
			}
		}
		return false;
	}
}
