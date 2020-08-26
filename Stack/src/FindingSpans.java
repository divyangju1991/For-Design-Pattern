import java.util.Arrays;
import java.util.EmptyStackException;

public class FindingSpans {
	
	public int[] findingSpans(int[] a){
		
		int[] spans = new int[a.length];
		int span = -1;
		int j =-1;
		
		for(int i=0; i<a.length; i++){
			
			span = 1;
			j = i -1;
			
			while(j>=0 && a[j]<=a[j+1]){
				span++;
				j--;
			}
			
			spans[i] = span;
		}
		
		return spans;
	}
}