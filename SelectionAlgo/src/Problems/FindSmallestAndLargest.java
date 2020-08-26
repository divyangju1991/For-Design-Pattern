package Problems;

public class FindSmallestAndLargest {

	public SmallestAndLargestBean findSmallestAndLargest(int a[]){
		
		int small = a[0];
		int large = a[0];
		
		for(int i=0; i<a.length; i++){
			
			if(a[i] > large){
				large = a[i];
			}
			
			if(a[i] < small){
				small = a[i];
			}
		}
		
		SmallestAndLargestBean smallestAndLargestBean = new SmallestAndLargestBean();
		smallestAndLargestBean.setLarge(large);
		smallestAndLargestBean.setSmall(small);
		
		return smallestAndLargestBean;
	}
	
}
