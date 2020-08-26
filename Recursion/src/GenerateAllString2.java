
public class GenerateAllString2 {
	
	public static void printAllKLengthRec(char[] set1, String prefix, int n, int k) {
		
		if(k == 0) {
			System.out.println(prefix);
			return;
		}
		
		for(int i=0; i<n; i++) {
			
			printAllKLengthRec(set1, (prefix +set1[i]), n, k-1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.out.println("First My Test"); 
		    char[] set1 = {'a', 'b'}; 
		    int k = 3; 
		    printAllKLengthRec(set1, "", set1.length, k); 
		      
		    System.out.println("\nSecond My Test"); 
		    char[] set2 = {'a', 'b', 'c', 'd'}; 
		    k = 2; 
		    printAllKLengthRec(set2, "", set2.length, k);  
	}
}
