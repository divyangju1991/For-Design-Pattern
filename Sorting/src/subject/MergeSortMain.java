package subject;

public class MergeSortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {12, 11, 13, 5, 6, 7}; 
		
		MergeSort mergeSort = new MergeSort();
		  
        System.out.println("Given Array"); 
        mergeSort.printArray(arr); 
  
        mergeSort.sort(arr, 0, arr.length-1); 
  
        System.out.println("\nSorted array"); 
        mergeSort.printArray(arr); 
	}

}
