package problems;

public class FindRepetatedNoOddTimes {

	public int findRepeatedNoOddTimes(int a[]){
		
		int x = a[0];
		
		for(int i=0;i<a.length-1;i++){
			x = x ^ a[i+1];
		}
		
		return x;
	}
}
