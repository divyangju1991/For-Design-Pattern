package problems;

public class FindThreeElementsBySum {

	public boolean findTwoElementsBySum(int a[], int sum){
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				for(int k=j+1;k<a.length;k++){
					
					if(a[i]+ a[j] + a[k] == sum){
						System.out.println("i = "+a[i]+", j="+a[j]+", k="+a[k]);
						return true;
					}
				}
			}
		}
		
		return false;
	}
}
