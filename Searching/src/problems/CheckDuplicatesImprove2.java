package problems;

import java.util.HashMap;

public class CheckDuplicatesImprove2 {

	public boolean isDuplicateFound(int a[]){
		
		HashMap map = new HashMap();
		
		for(int i=0; i<a.length; i++){
			
			if(map.get(a[i]) == null) {
				map.put(a[i], i);
			} else {
				return true;
			}
		}
		
		return false;
	}
}
