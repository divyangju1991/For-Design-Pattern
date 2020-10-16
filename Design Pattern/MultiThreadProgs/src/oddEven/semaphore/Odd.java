package oddEven.semaphore;

public class Odd implements Runnable {
    private SharedPrinter sp;
    private int max;
 
    public Odd(SharedPrinter sp2, int i) {
		this.sp = sp2;
		this.max = i;
	}

	// standard constructors 
    @Override
    public void run() {
        for (int i = 1; i <= max; i = i + 2) {
            sp.printOddNum(i);
        }
    }
}