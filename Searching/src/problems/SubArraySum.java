package map;

import java.util.*; 

class SubArraySum { 
  
    public static int subArraySum(int[] arr, int n, int sum) { 
        //cur_sum to keep track of cummulative sum till that point 
        int cur_sum = 0; 
        int start = 0; 
        int end = -1; 
        HashMap<Integer, Integer> hashMap = new HashMap<>(); 
        int count = 0;
  
        for (int i = 0; i < n; i++) { 
            cur_sum = cur_sum + arr[i]; 
            //check whether cur_sum - sum = 0, if 0 it means 
            //the sub array is starting from index 0- so stop 
            if (cur_sum - sum == 0) { 
                start = 0; 
                end = i; 
                //break;
                count++;
                System.out.println("("+start+", "+ end +")");
            } 
            //if hashMap already has the value, means we already  
            // have subarray with the sum - so stop 
            else if (hashMap.containsKey(cur_sum - sum)) { 
                start = hashMap.get(cur_sum - sum) + 1; 
                end = i; 
                //break;
                count++;
                System.out.println("("+start+", "+ end +")");
            } 
            //if value is not present then add to hashmap 
            hashMap.put(cur_sum, i); 
  
        } 
        
        System.out.println(hashMap);
        // if end is -1 : means we have reached end without the sum 
        if (end == -1) { 
            System.out.println("No subarray with given sum exists"); 
            return 0;
        } else { 
            System.out.println("Sum found between indexes " 
                            + start + " to " + end); 
            return count;
        } 
  
    } 
  
    // Driver code 
    public static void main(String[] args) { 
        int[] arr = {10, 2, -2, -20, 10}; 
        int n = arr.length; 
        int sum = 12; 
        System.out.println("count : " +subArraySum(arr, n, sum)); 
        
        int[] arr2 = {10, 2, 11, 1, -2, -20, 10}; 
        n = arr2.length; 
        System.out.println("count : " + subArraySum(arr2, n, sum)); 
        
        int[] arr3 = {10, 2, 10, -20, 10}; 
        n = arr3.length; 
        System.out.println("count : " + subArraySum(arr3, n, sum)); 
  
    } 
} 