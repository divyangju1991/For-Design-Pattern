package problem.interview;

public class SumOfDigits {
	
	static int sum = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfDigits(123));
	}

	public static int sumOfDigits(int nums){
		
		//base condition 
		if(nums == 0){
			return nums;
		} else {
			sum = sum + (nums%10);
			sumOfDigits(nums/10);
		}
		
		return sum;
	}
}
