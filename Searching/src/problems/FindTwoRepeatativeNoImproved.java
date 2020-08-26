package problems;

public class FindTwoRepeatativeNoImproved {

	public void findTwoRepeatativeNo(int a[]){
		int size = a.length;
		
		/* s is sum of elements in a[]*/
		int s =0;
		
		/* p is product of elements in a[]*/
		int p = 1;
		
		/* x and y are repetitive elements */
		int x, y;
		
		/* D is for difference x and y , e.g x-y */
		int d;
		
		int n = size-2, i;
		
		//calculate sum and product of elements in a[]
		for(i=0;i<size;i++){
			s = s + a[i];
			p = p * a[i];
		}
		
		/**/
		s = s - n * (n+1)/2;
		
		p = p/ fact(n);
		
		/* D is x - y now */
		d = (int) Math.sqrt(s * s - 4 * p);
		
		x = (d + s)/2;
		y = (s - d)/2;
		
		System.out.println("x : "+x+", y: "+y);
	}
	
	public int fact(int n){
		
		if(n == 0){
			return 1;
		} else {
			return fact(n-1);
		}
	}
}
