package string;

import java.util.Arrays;

public class ReverseStringIterator {
	
	public static void reverseString(char[] ch, int low, int high){
		
		while(low<high){
			swap(ch, low, high);
			low++;
			high--;
		}
	}
	
	public static void swap(char[] ch, int low, int high){
		char tmp = ch[low];
		ch[low] = ch[high];
		ch[high] = tmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Divyang";
		char[] name = str.toCharArray();
		
		reverseString(name, 0, name.length-1);
		System.out.println(Arrays.toString(name));
	}

}
