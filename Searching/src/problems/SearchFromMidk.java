package problems;

/**
 * 1<=k<=n
 * 
 * @author baps
 *
 */
public class SearchFromMidk {

	public int search(int a[]){
		int mid, first=0, last = a.length-1;
		
		while(first <= last){
			
			if(first == last){
				return a[first];
			} else if(first == last-1){
				return Math.max(a[first], a[last]);
			} else {
				mid = first + ((last-first)/2);
				
				if(a[mid-1]<a[mid] && a[mid]>a[mid+1]){
					return a[mid];
				} else if(a[mid-1]<a[mid] && a[mid] < a[mid+1]){
					return a[mid+1];
				} else if(a[mid-1] > a[mid] && a[mid] > a[mid+1]) {
					return a[mid-1];
				}
			}
		}
		
		return Integer.MIN_VALUE;
	}
}
