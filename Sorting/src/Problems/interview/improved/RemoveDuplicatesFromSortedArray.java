package Problems.interview.improved;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;

public class RemoveDuplicatesFromSortedArray {

	public int removeDuplicates(int[] nums) {
	   if(nums.length == 0) return 0;
	   int i=0;
	   
	   BiPredicate<Integer, Integer> p = (v1,v2) -> v1 != v2;
	   for(int j=1; j<nums.length; j++){
		   
		   if(p.test(nums[i], nums[j])){
			   nums[++i] = nums[j];
		   }
	   }
	   
	   return i+1;
	}
	
	public static void main(String args[]){
		
		int[] nums = {10,10,11,11,11,11,12,12,12,12,12,12};
		RemoveDuplicatesFromSortedArray arrObj = new RemoveDuplicatesFromSortedArray();
		System.out.println(arrObj.removeDuplicates(nums)+" "+Arrays.toString(nums));
	}
}
