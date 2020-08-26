package Problems;

public class ConvertArraytoSawToothWaveLinearTime {

	public void converttoSawToothWave(int a[]){
		
		for(int i=0; i<a.length; i+=2){
			
			if(i>0 && a[i] < a[i-1])
				swap(a, i-1, i);
			
			if(i<a.length-1 && a[i] < a[i+1])
				swap(a, i, i+1);
			
		}
	}
	
	private void swap(int a[], int low, int high){
		int tmp = a[low];
		a[low] = a[high];
		a[high] = tmp;
	}
	
}
