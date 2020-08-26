/**
 * 
 */
package callable;

import java.util.concurrent.Callable;

/**
 * @author baps
 *
 */
public class SquareDoubleCallable implements Callable<Double> {
	
	private Double n;
	
	SquareDoubleCallable(Double n){
		this.n = n;
	}

	@Override
	public Double call() throws Exception {
		return n * n;
	}

}
