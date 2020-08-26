

public class RemoveAdjacentDuplicatesMain {
	
	public static void main(String[] args){
		
		RemoveAdjacentDuplicates removeAdjacentDuplicates = new RemoveAdjacentDuplicates();
		
		int[] a = {1,5,6,8,8,8,0,1,1,0,6,5};
		int index = removeAdjacentDuplicates.removeAdjacentDuplicates(a);
		
		for(int i=0; i<=index; i++){
			System.out.print(" "+a[i]);
		}
		
		System.out.println();
		System.out.println();
		
		int[] b = {1,5,6,8,1,0,6,5};
		index = removeAdjacentDuplicates.removeAdjacentDuplicates(b);
		
		for(int i=0; i<=index; i++){
			System.out.print(" "+b[i]);
		}
		System.out.println();
		System.out.println();
		
		int[] c = {1,5,6,8,8,8,6};
		index = removeAdjacentDuplicates.removeAdjacentDuplicates(c);
		
		for(int i=0; i<=index; i++){
			System.out.print(" "+c[i]);
		}
	}
	
}
