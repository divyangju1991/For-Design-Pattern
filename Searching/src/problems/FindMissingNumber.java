package problems;

public class FindMissingNumber {

	
	public int findMissingNumber(int a[]){
		
		int found = 0;
		
		for(int i=1;i<=a.length;i++){
			
           found = 0;			
			
			for(int j=0;j<a.length;j++){
				
				if(a[j] == i){
					found = 1;
				}
				
			}
			
			if(found == 0){
				return i;
			}
		}
		
		return -1;
	}
}
