package Problems;

public class CheckDuplicates {

	public boolean isDuplicatesFoundInArray(int a[], int n) {
		
		for(int i=0; i<n; i++){
			
			for(int j=i+1; j<n; j++){
				
				if(a[i] == a[j]){
					return true;
				}
			}
		}
		
		return false;
	}
}
