package interview;

import java.util.ArrayList;
import java.util.List;

public class KMPPatternSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(patternSearch("ABCABCD", "ABCD"));
		System.out.println(patternSearch("AAAAAAA", "AAA"));
		System.out.println(patternSearch("ACDABABCD", "BABC"));
		//Improvement works only distinct pattern
	}

	public static List<Integer> patternSearch(String txt, String pattern){
		
		int n =txt.length();
		int m = pattern.length();
		int[] lps = new int[n];
		fillLPS(pattern, lps);
		int i=0;
		int j=0;
		List<Integer> list = new ArrayList<Integer>();
		
		while(i<n){
			
			if(pattern.charAt(j) == txt.charAt(i)){
				i++;
				j++;
			}
			
			if(j == m){
				list.add(i-j);
				j = lps[j-1];
			} else if(i<n && pattern.charAt(j) != txt.charAt(i)){
				
				if(j == 0){
					i++;
				} else {
					j = lps[j-1];
				}
			} 
		}
		
		return list;
	}
	
public static int[] fillLPS(String txt, int[] lps){
		
		int i=1;
		int n =txt.length();
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
