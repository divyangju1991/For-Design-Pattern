package problems;

public class BinarySearchWithPivot {

	public int findPivot(int[] a, int start, int finish){
		
		int mid = start;
		
		if(start == finish)
			return start;
		
		else if(start == finish -1) {
			
			if(a[start] >= a[finish])
				return start;
			else 
				return finish;
		} else {
			
			mid = start + (finish-start)/2;
			
			if(a[start] >= a[mid])
				return findPivot(a, start, mid);
			else
				return findPivot(a, mid, finish);
		}
			
	}
	
	public int search(int a[], int n, int x){
		
		int pivot = findPivot(a, 0, n-1);
		
		if(a[pivot] == x)
			return pivot;
		
		if(a[pivot] <= x)
			return binarySearch(a, 0, pivot-1, x);
		else
			return binarySearch(a, pivot+1, n-1, x);
	}
	
	public int binarySearch(int a[], int low, int high, int x){
		
		if(high >= low){
			int mid = low + (high - low)/2;
			
			if(x == a[mid])
				return mid;
			
			if(x > a[mid])
				return binarySearch(a, (mid+1), high, x);
			else
				return binarySearch(a, low, (mid-1), x);
		}
		
		return -1;
	}
}
