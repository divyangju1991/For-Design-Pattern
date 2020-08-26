package problems;

import java.util.HashMap;

public class FailedCheckDuplicatesImprove3 {

	public String isDuplicateFound(int arr[]){
		
//		for(int i=0; i<a.length; i++){
//			
//			if(a[ Math.abs(a[i])] >= 0){
//				a[ Math.abs(a[i])] = - a[ Math.abs(a[i])];
//			} else {
//				return true;
//			}
//		}
//		
//		return false;
		
		int i;   
        System.out.println("The repeating elements are : "); 
        StringBuilder sb = new StringBuilder();
        
        for (i = 0; i < arr.length; i++) 
        { 
            if (arr[ Math.abs(arr[i])] >= 0) 
                arr[ Math.abs(arr[i])] = -arr[ Math.abs(arr[i])]; 
            else
            	sb.append(Math.abs(arr[i]) + " "); 
        }       
  
        return sb.toString();
       // return false;
	}
}
