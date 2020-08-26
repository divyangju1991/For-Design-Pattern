package Problems;

import java.util.Arrays;

import subject.HeapSort;

public class SumTwoArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,3};
		int b[] = {4,5};
		
		SumTwoArrayElement sumTwoArrayElement = new SumTwoArrayElement();
		
		System.out.println("5 found : " + sumTwoArrayElement.find(a,b, a.length, 5));
		System.out.println("1 found : " + sumTwoArrayElement.find(a,b, a.length, 1));
		System.out.println("2 found : " + sumTwoArrayElement.find(a,b, a.length, 2));
		System.out.println("6 found : " + sumTwoArrayElement.find(a,b, a.length, 6));
		System.out.println("8 found : " + sumTwoArrayElement.find(a,b, a.length, 8));
		System.out.println("7 found : " + sumTwoArrayElement.find(a,b, a.length, 7));
	}

	public boolean find(int a[], int b[], int n, int k){
		
		int i, c;
		HeapSort hSort = new HeapSort();
		hSort.heapSort(a);
		
		for(i=0; i<n; i++){
			c = k - b[i];
			
			if(Arrays.binarySearch(a, c) >= 0)
				return true;
		}
		
		return false;
	}
}
