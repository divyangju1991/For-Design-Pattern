package Problems;

import subject.QuickSort;

public class MaxOccuranceMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,8,7,3,2};
		int b[] = {3,8,7,3,2,7,2,3,8,8,8,8,8};
		int c[] = {3,8,7,3,2,3,8,7,3,2,3,8,7,3,2,7,7,7,1,7,1,7,1,7};
		int d[] = {2,2,2,2,2,2,2,3,8,7,3,2,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
		
		new MaxOccuranceMain().findMaxOccurance(a);
		new MaxOccuranceMain().findMaxOccurance(b);
		new MaxOccuranceMain().findMaxOccurance(c);
		new MaxOccuranceMain().findMaxOccurance(d);
	}

	public void findMaxOccurance(int a[]){
		
		QuickSort quickSort = new QuickSort();
		quickSort.quickSort(a, 0, a.length - 1);
		
		int number = a[0];
		int count = 1;
		int maxCount=0;
		
		for(int i=1; i<a.length; i++){
			
			if(a[i] == a[i-1]){
				count++;
				
				if(count >= maxCount) {
					number = a[i];
					maxCount = count;
				}
					
			} else {
				count = 1;
			}
		}
		
		System.out.println("Max repeated number : "+number + ", count : "+(maxCount));
	}
}
