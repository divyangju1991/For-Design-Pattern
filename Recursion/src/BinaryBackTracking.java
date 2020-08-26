import java.util.Arrays;

public class BinaryBackTracking {

	public static void Binary(int n, int[] a, StringBuilder sb){
		if(n < 1){
			sb.append(Arrays.toString(a)+ " & ");
			//System.out.println("loacal "+s);
			System.out.println("final Array initialize "+ Arrays.toString(a));
		} else{
			a[n-1] = 0;
			System.out.println("a[n-1] = 0 for n = "+n+" & a="+ Arrays.toString(a));
			Binary(n-1, a, sb);
			
			System.out.println();
			a[n-1] = 1;
			System.out.println("a[n-1] = 1 for n = "+n+" & a="+ Arrays.toString(a));
			Binary(n-1, a, sb);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 4;
		int[] a = new int[n];
		StringBuilder sb= new StringBuilder();
		
		Binary(n, a, sb);
		
		System.out.println("s : "+sb);
		
		String[] sArray = sb.toString().split(" & ");
		
		System.out.println("Permutations : "+sArray.length);
		
		for(String str : sArray){
			System.out.println(str);
		}
	}

}
