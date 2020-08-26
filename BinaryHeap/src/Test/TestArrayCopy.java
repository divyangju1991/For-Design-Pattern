package Test;

import java.util.Arrays;

public class TestArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {2, 5, 18, 6, 8};
		int[] array2 = new int[10];
		int[] array3 = new int[10];
		
		System.arraycopy(array, 0, array2, 0, array.length);
		
		System.out.println("array 1 => "+ Arrays.toString(array));
		
		System.out.println("array 2 => "+ Arrays.toString(array2));
		
		int index=0;
		for(int i:array){
			array3[index] = i;
			index++;
		}
		
		System.out.println("array 3 => "+Arrays.toString(array3));
	}

}
