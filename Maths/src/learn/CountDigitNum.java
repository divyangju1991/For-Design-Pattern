package learn;

public class CountDigitNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountDigitNum numsDigit = new CountDigitNum();
		
		System.out.println(numsDigit.countDigitNum(123));
		System.out.println(numsDigit.countDigitNum(1234));
		System.out.println(numsDigit.countDigitNum(12345));
	}

	int countDigitNum(long n){
		return (int) Math.floor(Math.log10(n) + 1);
	}

}
