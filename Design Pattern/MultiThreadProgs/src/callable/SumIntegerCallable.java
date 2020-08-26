package callable;

import java.util.concurrent.Callable;

public class SumIntegerCallable implements Callable<Integer> {

	private Integer n;
	
	SumIntegerCallable(Integer n){
		this.n = n;
	}
	
	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i=1; i<=n; i++){
			sum += i;
		}
		return sum;
	}

	
}
