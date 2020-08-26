package subject;

public class IntertionSort {

	
	public void sort(int a[]){
		
		for(int i=1; i<= a.length-1; i++){
			
			int j = i-1;
			int key = a[i];
			while(j>0 && a[j]>key){
				a[j+1] = a[j];
				j--;
			}
			
			a[j+1] = key;
		}
	}
}
