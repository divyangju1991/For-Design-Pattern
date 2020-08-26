package problems;

public class SearchWithPivotImprov2 {

	public boolean search(int a[], int data){
		
		int left = 0;
		int right = a.length - 1;
		
		while(left <= right){
			
			int mid = left + (right - left)/2;
			
			if(a[mid] == data)
				return true;
			
			if(a[left] < a[mid]){
				
				if(a[left] <= data && data < a[mid])
					right = mid -1;
				else
					left = mid + 1;
			} else if(a[left] > a[mid]) {
				if(a[mid] < data && data <= a[right])
					left = mid + 1;
				else 
					right = mid -1;
			} else {
				left++;
			}
		}
		
		return false;
	}
}
