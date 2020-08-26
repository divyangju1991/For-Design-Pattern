package problems;

import subject.HeapSort;

public class FindSumClosestZeroImproved {

	public int findSumClosestZero(int a[]){
		int i=0,sum, positiveClosest = Integer.MAX_VALUE, negativeClosest = Integer.MIN_VALUE, n=a.length, j=n-1;
		
		new HeapSort().heapSort(a);
		
		while(i<j){
			
			sum = a[i] + a[j];
			
			if(sum > 0){
				if(sum < positiveClosest){
					positiveClosest = sum;
				}
				j--;
			}else if (sum < 0){
				if(sum > negativeClosest){
					negativeClosest = sum;
				}
				i++;
			}else {
				System.out.println("i : "+a[i] +", j = "+a[j] +", sum = "+sum );
			}
		}
		
		return (Math.abs(negativeClosest)> positiveClosest)?negativeClosest: positiveClosest;
		
	}
}
