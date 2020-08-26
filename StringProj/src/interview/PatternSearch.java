package interview;

import java.util.ArrayList;

public class PatternSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(patternSearch("ABCABCD", "ABCD"));
		System.out.println(patternSearch("AAAAAAA", "AAA"));
	}

	public static ArrayList<Integer> patternSearch(String text, String pattern){
		
		int patternSearchedIndex = -1;
				
		int n = text.length();
		int m = pattern.length();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0; i<=n-m;i++){
			
			int j=0;
			for(;j<m;j++){
				
				if(pattern.charAt(j) != text.charAt(i+j))
					break;
			}
			
			if(j == m)
				list.add(i);
		}
		
		return list;
	}
}
