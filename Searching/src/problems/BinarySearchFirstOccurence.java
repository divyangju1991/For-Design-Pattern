package problems;

public class BinarySearchFirstOccurence {

	public int binarySearchFirstOccurence(int a[], int low, int high, int data){
		
		if(high >= low){
			
			int mid = low +  ((high - low)/2);
			
			if((low == mid && a[mid] == data) || (a[mid] == data && a[mid-1] < data) ){
				return mid;
			} else if(a[mid] >= data){
				return binarySearchFirstOccurence(a, low, mid-1, data);
			} else {
				return binarySearchFirstOccurence(a, mid +1, high, data);
			}
		}
		
		return -1;
	}
}
