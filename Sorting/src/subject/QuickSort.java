package subject;

public class QuickSort {

	public void quickSort(int[] a, int low, int high){
		
		int pivot;
		
		if(high > low){
			pivot = partition(a, low, high);
			quickSort(a, low, pivot -1);
			quickSort(a, pivot + 1, high);
		}
	}
	
	private int partition(int[] a, int low, int high){
		int left, right, pivot_item = a[high];
		left = low-1;
		right = low;
		
		while(right < high){
			
			// If current element is smaller than the pivot
			if(a[right] < pivot_item) {
				++left;
				swap(a, left, right);
			}
			
			++right;
		}

		// swap arr[i+1] and arr[high] (or pivot)
		swap(a, left+1, high);
		
		return left+1;
	}
	
	private void swap(int[] a, int left, int right){
		int tmp = a[left];
		a[left] = a[right];
		a[right] = tmp;
	}
}
