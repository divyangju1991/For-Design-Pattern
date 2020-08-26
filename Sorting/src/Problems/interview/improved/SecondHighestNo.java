package Problems.interview.improved;

public class SecondHighestNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {10,5,7,4,9,1,3};
		
		int[] arr2 = {10,1,2,7,4,8,1,3};
		
		SecondHighestNo obj = new SecondHighestNo();
		
		System.out.println(obj.getSecondHighest(arr1));
		System.out.println(obj.getSecondHighest(arr2));
	}

	public int getSecondHighest(int[] a){
		
		int first = 0;
		int second = 0;
		int n = a.length; 
		
		for(int i=0;i<n;i++){
			
			if(a[i] > first){
				second = first;
				first = a[i];
			}  else if (a[i] > second && a[i] != first) {
				second = a[i]; 
			}
                
		}
	
		return second;
	}
}
