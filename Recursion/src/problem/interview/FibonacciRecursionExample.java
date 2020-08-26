package problem.interview;

public class FibonacciRecursionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Fibonacci series : ");
		int n = 10;
		
		for(int i=0; i<=n; i++){
			System.out.print(" "+fibonacciRecursion(i));	
		}
	}

	public static int fibonacciRecursion(int n){
		
		//base conditions
		if(n == 0){
			return 0;
		}
		
		if(n == 1){
			return 1;
		}
		
		//tail recursion
		return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
	}
}
