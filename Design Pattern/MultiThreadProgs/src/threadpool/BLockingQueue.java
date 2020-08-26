package threadpool;

public interface BLockingQueue<E> {

	void put(E item) throws InterruptedException;
	
	E take() throws InterruptedException;
	
	int size();
}
