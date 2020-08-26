package learn;

//6n - 1 or 6n +1 to get Prime Nos
public class PrimeNoList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new PrimeNoList().genearatePrimeNo(4);
		
		System.out.println("===================");
		
		new PrimeNoList().genearatePrimeNo(5);
		
		System.out.println("===================");
		
		new PrimeNoList().genearatePrimeNo(6);
		
		System.out.println("===================");
		
		new PrimeNoList().genearatePrimeNo(7);
		
		System.out.println("===================");
		
		new PrimeNoList().genearatePrimeNo(8);
		
		System.out.println("===================");

	}
	
	public void genearatePrimeNo(int n){
		
		if(n >= 1)
			System.out.println("1");
		
		if(n >= 2)
			System.out.println("2");
		
		if(n >= 3)
			System.out.println("3");
			
		for(int i=1; i<n/2; i++){
			
			System.out.println(""+((6*i)-1));
			
			if(n%2 != 0 || (i<((n/2) - 1)))
				System.out.println(""+((6*i)+1));
		}
	}

}
