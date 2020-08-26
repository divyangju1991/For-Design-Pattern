package interview;

import java.util.Arrays;

public class LPSArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Arrays.toString(lps("ACDABABCD")));
	}
	
	public static int[] lps(String txt){
		
		int i=1;
		int n =txt.length();
		int[] lps = new int[n];
		lps[0] = 0;
		int len = 0;
		
		while(i<n){
			
			if(txt.charAt(i) == txt.charAt(len)){
				lps[i] = ++len;
				i++;
			} else if(len == 0){
				lps[i] = 0;
				i++;
			} else {
				lps[i] = lps[len-1];
				i++;
			}
		}
		
		return lps;
	}

}
