package interview;

import java.util.HashMap;
import java.util.Map;

public class CharacterCountHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println(""+new CharacterCountHashMap().getCharacterCount("This is it").toString());
	}

	public Map<Character, Integer> getCharacterCount(String str){
		
		str = str.replace(" ", "");
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		
		for(char c: ch){
			if(map.containsKey(c)){
				map.put(c, (map.get(c)+1));
			} else {
				map.put(c, 1);
			}
		}
		
		return map;
	}
			
			
}
