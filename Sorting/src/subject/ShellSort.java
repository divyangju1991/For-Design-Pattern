package subject;

public class ShellSort {

	public void sort(int[] a){
		
		int i, j, h, v;
		
		for(h=1;h>0;h=h/3){
			
			for(i=h+1;i<a.length;i+=1){
				v = a[i];
				j = i;
				
				while(j>h && a[j-h] > v){
					a[j] = a[j-h];
					j -= h;
				}
				
				a[j] = v;
			}
		}
	}
}
