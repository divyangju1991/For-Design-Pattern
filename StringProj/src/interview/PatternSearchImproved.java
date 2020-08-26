package interview;

import java.util.ArrayList;

public class PatternSearchImproved {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(patternSearch("ABCABCD", "ABCD"));
		System.out.println(patternSearch("AAAAAAA", "AAA"));
		//Improvement works only distinct pattern
	}

	public static ArrayList<Integer> patternSearch(String text, String pattern){
		
		int patternSearchedIndex = -1;
				
		int n = text.length();
		int m = pattern.length();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<=n-m;){
			
			int j=0;
			for(;j<m;j++){
				
				if(pattern.charAt(j) != text.charAt(i+j))
					break;
			}
			
			if(j == m)
				list.add(i);
			
			if(j == 0)
				i++;
			else
				i = i+j;
		}
		
		return list;
	}
}
