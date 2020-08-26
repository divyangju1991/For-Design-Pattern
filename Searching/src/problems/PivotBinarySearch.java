package problems;

public class PivotBinarySearch {

	public int findPivot(int a[], int start, int finish){
		
		if(finish - start == 0){
			return start;
		} else if(start == finish-1){
			
			if(a[start] >= a[finish]){
				return start;
			}else {
				return finish;
			}
			
		} else {
			int mid = start + ((finish-start)/2);
			if(start <= finish){
				return findPivot(a, start, mid);
			} else {
				return findPivot(a, mid, finish);
			}
		}
	}
	
	public int search(int a[], int n, int x){
		
		int pivot = findPivot(a, 0, n-1);
		
		if(x == a[pivot]){
			return pivot;
		} else if(a[pivot] < x){
			return binarySearch(a, 0, pivot-1, x);
		} else {
			return binarySearch(a, pivot+1, n-1, x);
		}
		
	}
	
	public int binarySearch(int a[], int low, int high, int x){
		
		if(high>=low){
			int mid = low + ((high-low)/2);
			
			if(x == a[mid]){
				return mid;
			} else if(x < a[mid]){
				return binarySearch(a, low, mid-1, x);
			} else {
				return binarySearch(a, mid + 1, high, x);
			}
		}
		
		return -1;
	}
}
