package subject;

public class SelectionSort {

	
	public void sort(int a[]){
		
		int i,j, tmp, min;
		
		for(i=0; i<a.length-1; i++){
			
			min = i;
			for(j = i+1; j< a.length; j++){
				
				if(a[j]< a[min]){
					min = j;
				}
			}
			
			tmp = a[min];
			a[min] = a[i];
			a[i] = tmp;
			
		}
	}
}
