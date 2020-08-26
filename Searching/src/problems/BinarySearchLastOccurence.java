package problems;

public class BinarySearchLastOccurence {

	public int binarySearchLastOccurence(int a[], int low, int high, int data){
		
		if(high >= low){
			
			int mid = low +  ((high - low)/2);
			
			if((high == mid && a[mid] == data) || (a[mid] == data && a[mid+1] > data) ){
				return mid;
			} else if(a[mid] <= data){
				return binarySearchLastOccurence(a, mid+1, high, data);
			} else {
				return binarySearchLastOccurence(a, low, mid-1, data);
			}
		}
		
		return -1;
	}
}
