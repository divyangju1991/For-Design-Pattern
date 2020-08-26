package Problems;

import java.util.Arrays;

public class NearlySortedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = { 2, 6, 3, 12, 56, 8 }; 
        int n = arr.length;
        int k = (n+1)/2; 
        
        NearlySorted nearlySorted = new NearlySorted();
        nearlySorted.kSort(arr, n, k); 
        System.out.println("Following is sorted array"); 
        System.out.println(Arrays.toString(arr));
        
        int a[] = {1, 17, 6, 14, 5, 2, 3};
        n = a.length;
        k = (n+1)/2;
        nearlySorted.kSort(a, n, k); 
        System.out.println("Following is sorted array"); 
        System.out.println(Arrays.toString(a));
        
	}

}
