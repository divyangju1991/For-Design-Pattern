package Problems.interview.improved;

public class SortedMerge {

	 static int NA =-1; 
	    static void sortedMerge(int a[], int b[], int n, int m)  
	    { 
	        int i = n - 1; 
	        int j = m - 1; 
	          
	        int lastIndex = n + m - 1; 
	          
	        // Merge a and b, starting  
	        // from last element in each  
	        while (j >= 0)  
	        { 
	          
	            /* End of a is greater than end of b */
	            if (i >= 0 && a[i] > b[j])  
	            { 
	                // Copy Element 
	                a[lastIndex] = a[i];  
	                i--; 
	            } else 
	            {   
	                // Copy Element 
	                a[lastIndex] = b[j];  
	                j--; 
	            } 
	            // Move indices 
	            lastIndex--;  
	        } 
	    } 
	      
	    // Helper function to print the array  
	    static void printArray(int arr[], int n)  
	    { 
	        System.out.println ( "Array A after merging B in sorted order : " ) ; 
	        for (int i = 0; i < n; i++) 
	            System.out.print(arr[i] +" "); 
	    } 
	      
	    // Driver code 
	    public static void main (String[] args)  
	    { 
	        int a[] = {10, 12, 13, 14, 18, NA, NA, NA, NA, NA}; 
	        int n = 5; 
	        int size_a = 10; 
	        int b[] = {16, 17, 19, 20, 22}; 
	        int m = 5; 
	        sortedMerge(a, b, n, m); 
	        printArray(a, size_a); 
	    } 
}
