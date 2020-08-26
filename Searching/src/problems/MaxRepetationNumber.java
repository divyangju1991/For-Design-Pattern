package problems;

public class MaxRepetationNumber {

	
	public int maxRepetationNumber(int a[]){
		
		int counter = 0;
		int max = a[0];
		
		for(int i=0; i<a.length; i++){
			
			counter=0;
			for(int j=i+1; j<a.length; j++){
				
				if(a[i] == a[j]){
					++counter;
				}
			}
			
			if(counter > max){
				max = a[i];
			}
		}
		
		return max;
	}
}
