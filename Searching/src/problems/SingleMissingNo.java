package problems;

public class SingleMissingNo {

	public int singleMissingNo(int a[]){
		
		int missingNo = a[0];
		
		for(int i=1; i<a.length; i++){
			missingNo ^= a[i];
		}
		
		return missingNo;
	}
}
