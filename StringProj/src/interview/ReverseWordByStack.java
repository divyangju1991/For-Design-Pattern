package interview;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Stack;

public class ReverseWordByStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWord("This is a world"));
	}

	public static String reverseWord(String str){
		
		if(str == null){
			return "";
		}
		
		String[] arr = str.split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=arr.length-1; i>=0; i--){
			sb.append(arr[i]).append(" ");
		}
		
		return sb.toString();
	}
}
