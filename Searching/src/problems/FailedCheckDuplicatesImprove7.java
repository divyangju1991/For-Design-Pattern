package problems;

import java.util.stream.IntStream;

public class FailedCheckDuplicatesImprove7 {

	public int isDuplicateFound(int a[]){
		
		int actual_sum = IntStream.of(a).sum();
		int expected_sum = a.length * (a.length - 1) / 2;

		return actual_sum - expected_sum;
	}
}
