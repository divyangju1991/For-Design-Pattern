package problems;

public class FindSumClosestZero {

	public int findSumClosestZero(int a[]){
		int i,j,sum, min_sum, min_i=0, min_j=0;
		min_sum = a[0]+a[1];
		for(i=0; i<a.length;i++){
			
			for(j=i+1;j<a.length;j++){
				
				sum = a[i] + a[j];
				
				if(Math.abs(min_sum) > Math.abs(sum)){
					min_sum = sum;
					min_i = i;
					min_j = j;
				}
			}
		}
		
		System.out.println("i : "+a[min_i] +", j = "+a[min_j] +", sum = "+min_sum ); 
		
		return min_sum;
		
	}
}
