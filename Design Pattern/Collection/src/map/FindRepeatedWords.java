package map;

import java.util.ArrayList;
import java.util.TreeMap;

public class FindRepeatedWords {

	public void findRepeatedWords(String strParagraph){
		
		if(strParagraph != null && strParagraph.isEmpty()) {
			
			String strWords[] = strParagraph.split(" ");
			TreeMap duplicateWords = new TreeMap();
			ArrayList wordsList = new ArrayList();
			int nRepeated = 0;
			
			for(String strWord : strWords) {
				
				if(duplicateWords.get(strWord) != null) {
					
				}
				
			}
		}
		
	}
}
