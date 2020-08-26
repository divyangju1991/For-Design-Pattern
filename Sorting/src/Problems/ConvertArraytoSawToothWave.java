package Problems;

public class ConvertArraytoSawToothWave {

	public void converttoSawToothWave(int a[]){
		
		for(int i=1; i<a.length; i+=2){
			
			if(i+1 < a.length)
				swap(a, i, i+1);
			
		}
	}
	
	private void swap(int a[], int low, int high){
		int tmp = a[low];
		a[low] = a[high];
		a[high] = tmp;
	}
}