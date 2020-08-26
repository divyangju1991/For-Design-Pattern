package problems;

public class FindRepetatedNoOddTimesMain {

	/**
	 * Only 1 no is odd times except this even times
	 * @param args
	 */
	public static void main(String args[]){
		
		int a[] = {1,2,3,2,8,7,3,5,3,1,8,7,5};
		
		System.out.println(new FindRepetatedNoOddTimes().findRepeatedNoOddTimes(a));
	}
}
