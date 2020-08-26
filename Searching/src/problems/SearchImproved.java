package problems;

public class SearchImproved {

	public int search(int a[], int left, int right, int data){
		
		if(left > right){
			return -1;
		}
		
		int mid = left + ((right - left)/2);
		
		if(a[mid] == data){
			return mid;
		} else if(a[left] <= a[mid]){
			
			if(data >= a[left] && data < a[mid]) {
				return search(a, left, mid-1, data);
			} else {
				return search(a, mid+1, right, data);
			}
		} else {
			
			if(data > a[mid] && data <= a[right]){
				return search(a, mid+1, right, data);
			} else {
				return search(a, left, mid-1, data);
			}
		}
		
	}
}
