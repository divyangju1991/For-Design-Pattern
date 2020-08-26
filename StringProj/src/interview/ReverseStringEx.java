package interview;

import java.util.Arrays;

public class ReverseStringEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a world";
		char[] str = s.toCharArray();

		reverseString(str, 0, str.length-1);
		
		System.out.print("Reverse String : ");
		for(char ch : str)
			System.out.print(ch);
	}

	public static void reverseString(char[] str, int low, int high){
		
		while(low<=high){
			swap(str, low, high);
			low++;
			high--;
		}
	}
	
	public static void swap(char[] str, int low, int high){
		char tmp = str[low];
		str[low] = str[high];
		str[high] = tmp;
	}
}
