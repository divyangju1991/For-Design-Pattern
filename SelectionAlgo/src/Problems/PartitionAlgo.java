package Problems;

public class PartitionAlgo {

	public int partition(int a[], int start, int end){
		
		int pivot = a[start];
		int pivotPosition = start++;
		
		while(start<=end){
			
			while((start<=end) && a[start] < pivot){
				start++;
			}
			
			while((end>=start) && (a[end]>=pivot)){
				end--;
			}
			
			if(start > end){
				swap(a, pivotPosition, end);
			} else {
				swap(a, start, end);
			}
		}
		
		return end;
	}
	
	public void swap(int a[], int start, int end){
		
		int tmp = a[start];
		a[start] = a[end];
		a[end] = tmp; 
	}
}
