package subject;

public class BucketSorting {

	public void sort(int[] a, int bucketLength){
		
		int i, j, k;
		int bucket[] = new int[bucketLength];
		
		for(i=0; i<a.length; i++)
			++bucket[a[i]];
		
		for(i=0, j=0; j<bucketLength;j++)
			for(k=bucket[j]; k>0; --k)
				a[i++] = j;
	}
}
