package Problems;

public class FindSmallestAndLargestImprov {

	public SmallestAndLargestBean findSmallestAAndLargest(int a[]) {
		
		int large = a[0], small = a[0];
		
		for(int i=0;i<a.length-1;i=i+2){
			
			if(a[i]<a[i+1]){
				
				if(a[i]<small){
					small = a[i];
				} 
				
				if(a[i+1]>large) {
					large = a[i+1];
				}
			} else {
				
				if(a[i+1]<small){
					small = a[i+1];
				} 
				if(a[i]>large){
					large = a[i];
				}
			}
		}
		
		SmallestAndLargestBean smallestAndLargestBean = new SmallestAndLargestBean();
		smallestAndLargestBean.setLarge(large);
		smallestAndLargestBean.setSmall(small);
		
		return smallestAndLargestBean;
	}
}
