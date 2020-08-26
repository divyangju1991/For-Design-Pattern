

public class RemoveAdjacentDuplicates {

	public int removeAdjacentDuplicates(int[] a){
		
		int stkPtr = -1;
		int i = 0;
		
		while(i<a.length){
			
			if(stkPtr == -1 || a[stkPtr] != a[i]){
				stkPtr++;
				a[stkPtr] = a[i];
				i++;
			} else {
				
				while(i<a.length && a[stkPtr] == a[i])
					i++;
				
				stkPtr--;
			}
		}
		
		return stkPtr;
	}
}
