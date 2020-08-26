package Problems.interview.improved;

public class SecondLowesttNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1 = {10,5,7,4,9,1,3};
		
		int[] arr2 = {10,1,2,7,4,8,1,3};
		
		SecondLowesttNo obj = new SecondLowesttNo();
		
		System.out.println(obj.getSecondLowest(arr1));
		System.out.println(obj.getSecondLowest(arr2));
	}

	public int getSecondLowest(int[] a){
		
		int first = Integer.MAX_VALUE;
		int second = Integer.MAX_VALUE;
		int n = a.length; 
		
		for(int i=0;i<n;i++){
			
			if(a[i] < first){
				second = first;
				first = a[i];
			}  else if (a[i] < second && a[i] != first) {
				second = a[i]; 
			}
                
		}
	
		return second;
	}
}
