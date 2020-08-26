package problems;

public class LinearSearch {

	public int linearSearch(int a[], int data){
		
		int count = 0;
		
		for(int i=0; i<a.length; i++){
			
			if(a[i] == data){
				++count;
			}
		}
		
		return count;
	}
}
