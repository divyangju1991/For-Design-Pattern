package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.Stack;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is a world";
		char[] chArr = str.toCharArray();
		reverseWord(chArr, chArr.length);
		System.out.print("Reverseword : ");
		for(char ch :chArr){
			System.out.print(ch);
		}
	}

	public static void reverseWord(char[] str, int n){
		
		if(str == null){
			return;
		}
		
		int start = 0;
		for(int end=0; end<n; end++){
			
			if(str[end] == ' '){
				reverse(str, start, end-1);
				start = end+1;
			}
		}
		reverse(str, start, n-1);
		reverse(str, 0, n-1);
	}
	
	public static void reverse(char[] str, int low, int high){
		
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
