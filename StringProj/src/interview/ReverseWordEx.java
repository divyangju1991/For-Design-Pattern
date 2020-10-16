package string;

import java.util.Arrays;

public class ReverseWordEx {
	
	
	
	public static String reverseWordFromSentence(String str){
		
		int end = -1;
		char[] ch = str.toCharArray();
		int len = ch.length;
		int start = 0;
		
		System.out.println(Arrays.toString(ch));
		
		for(int i=0; i<len;i++){
			
			if(ch[i] == ' '){
				start = end+1;
				end = i;
				reverseString(ch, start, end-1);
				System.out.println(Arrays.toString(ch));
			}
		}
		System.out.println(Arrays.toString(ch));
		
		reverseString(ch, end+1, ch.length-1);
		
		reverseString(ch, 0, ch.length-1);
		return Arrays.toString(ch);
		
	}
	
	public static void reverseString(char[] str, int low, int high){
		
		while(low<high){
			char tmp = str[low];
			str[low] = str[high];
			str[high] = tmp;
			++low;
			--high;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stubl
		System.out.println(reverseWordFromSentence("My name is Divyang"));
	}

}
