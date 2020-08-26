package problems;

public class FindFirstDuplicate {

	public int findFirstDuplicate(int a[]){
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i] == a[j]){
					return a[i];
				}
			}
		}
		
		return -1;
	}
}
