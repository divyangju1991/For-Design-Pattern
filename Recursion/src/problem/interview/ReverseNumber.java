package problem.interview;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		reverseNumber(4567);
	}

	public static void reverseNumber(int num){
		
		if(num == 0){
			return;
		}
		
		System.out.print(num%10);
		
		reverseNumber(num/10);
	}
}
