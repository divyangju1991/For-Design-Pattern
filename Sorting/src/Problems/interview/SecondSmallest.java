package sort;

public class SecondSmallest {

	public static int secondSmallest(int[] a){
		
		int n = a.length;
		int second = Integer.MAX_VALUE;
		int first = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++){
			
			if(a[i] < first){
				 second = first;
				 first = a[i];
			} else if(a[i] < second && a[i] != first) {
				second = a[i];
			}
		}
		
		return second;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3,4,5};
		int[] b = {11,16,8,2,1};
		int[] c = {5,8,6,1,2,3};
		
		System.out.println(secondSmallest(a));
		System.out.println(secondSmallest(b));
		System.out.println(secondSmallest(c));
		
	}

}
