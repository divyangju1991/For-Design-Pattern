package oddEven.semaphore;

public class Even implements Runnable {
    private SharedPrinter sp;
    private int max;
 
    // standard constructor
 
    public Even(SharedPrinter sp2, int i) {
	    this.sp = sp2;
	    this.max = i;
	}

	@Override
    public void run() {
        for (int i = 2; i <= max; i = i + 2) {
            sp.printEvenNum(i);
        }
    }
}