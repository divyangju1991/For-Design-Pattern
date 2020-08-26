package subject;

public class BubbleSorting {

	
	public void sort(int a[]){
		
		int temp;
		
		for(int out = a.length -1; out >=0 ; out--){
			
			for(int i=0; i<= out-1; i++) {
				
				if(a[i] > a[i+1]){
					
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
				}
			}
		}
	}
}
