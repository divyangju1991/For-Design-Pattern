package Test;

import java.util.Arrays;

public class TestLoop {

	static int[] array = {7, 8, 6, 2, 9};
	static int count = 0;
	int[] array2 = new int[array.length];
	static int[] array3 = {18, 14, 11, 4, 19};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//new TestLoop().insert(18);
		//new TestLoop().insert(4);
		TestLoop test = new TestLoop();
		
		for(int i : array){
			test.insert(i);
		}
		
		for(int i : array3){
			test.insert(i);
		}
	}
	
	
	public void insert(int data) {
		
		boolean isFull = (count == array2.length);
		
		if(isFull){
			
			int[] old_array = new int[array2.length];
			System.arraycopy(array2, 0, old_array, 0, array2.length);
			
			array2 = new int[array.length * 2];
			System.arraycopy(old_array, 0, array2, 0, old_array.length);
			
			old_array = null;
		}
				
		int i = count;
		while(i > 0 && (data > array2[(i-1)/2])){
			
			System.out.println("Before i : "+i);
			System.out.println("Before (i-1)/2 : "+(i-1)/2);
			System.out.println("data : " + array2[i]);
			System.out.println("data : " + array2[(i-1)/2]);
			
			array2[i] = array2[(i-1)/2];
			
			i = (i-1)/2;
			
			System.out.println("i : "+i);
			System.out.println(Arrays.toString(array2));
		}
		
		array2[i] = data;
		
		System.out.println("Inserted data : "+ array2[i]);
		System.out.println(Arrays.toString(array2));
		
		count++;
	}

}
