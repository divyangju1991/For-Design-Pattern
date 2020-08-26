package problems;

import java.util.HashMap;

public class FailedCheckDuplicatesImprove6 {

	public boolean isDuplicateFound(int a[]){
		
		boolean visited[] = new boolean[a.length+1];
		
		for(int i=0; i<a.length; i++){
			
			if(visited[a[i]]){
				return true;
			} else {
				visited[a[i]] = true;
			}
		}
		
		return false;
	}
}
