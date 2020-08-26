package subject;

public class BubbleSortingImprovement {
	
	public void sort(int a[]){
		
		int temp, out, i, swapped;
		
		swapped = 1;
		for(out = a.length -1; out >=0 && swapped == 1; out--){
			
			swapped = 0;
			for(i=0; i<= out-1; i++) {
				
				if(a[i] > a[i+1]){
					
					temp = a[i];
					a[i] = a[i+1];
					a[i+1] = temp;
					swapped = 1;
				}
			}
		}
	}
}
