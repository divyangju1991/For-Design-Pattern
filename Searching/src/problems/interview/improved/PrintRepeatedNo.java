package problems.interview.improved;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.IntPredicate;

public class PrintRepeatedNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {99, 6, 99, 99, 1, 7, 6, 7};
		PrintRepeatedNo obj = new PrintRepeatedNo();
		obj.printRepeatedNo(arr);
	}

	public void printRepeatedNo(int[] arr){
		
		OptionalInt max = Arrays.stream(arr).max();
		
		int count[] = new int[max.getAsInt()+1];
		
		IntPredicate p = n -> (n == 1);
		
		for(int i=0; i<arr.length; i++){
			
			if(p.test(count[arr[i]])){
				System.out.println("Repeated No : "+ arr[i]);
				count[arr[i]]++;
			} else {
				count[arr[i]]++;
			}
		}
	}
}
