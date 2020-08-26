package Problems;

public class RemoveDuplicates {

	public int removeDuplicates(int[] a){
		int len = a.length;
		int i = 0;
		
		if(len <= 1)
			return len;
		
		for(int j=1; j<len;j++){
			if(a[j] != a[i])
				a[++i] = a[j];
		}
		
		printArray(a, i+1);
		
		return i + 1;
	}
	
	public void printArray(int[] a, int len){
		System.out.println("Array => ");
		for(int i=0; i<len; i++){
			System.out.print(a[i] + ", ");
		}
		System.out.println();
	}
}
