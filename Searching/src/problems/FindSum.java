package problems;

public class FindSum {

	public boolean findSum(int a[], int k){
		
		for(int i=0;i<a.length;i++){
			
			for(int j=1;j<a.length;j++){
				
				if(a[i]+a[j] == k){
					System.out.println(" a[i] :"+a[i]+", a[j]"+a[j]);
					return true;
				}
			}
		}
		
		return false;
	}
}
