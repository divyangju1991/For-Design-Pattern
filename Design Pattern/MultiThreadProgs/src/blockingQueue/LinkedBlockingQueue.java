package blockingQueue;

import java.util.LinkedList;
import java.util.List;

public class LinkedBlockingQueue<E> implements BLockingQueue<E> {
	
	private int maxSize;
	private List<E> queue;
	
	public LinkedBlockingQueue(int maxSize) {
		this.maxSize = maxSize;
		queue = new LinkedList<E>();
	}

	@Override
	public synchronized void put(E item) throws InterruptedException {
		
		if(queue.size() == maxSize){
			this.wait();
		}
		
		queue.add(item);
		
		this.notifyAll();
	}

	@Override
	public synchronized E take() throws InterruptedException {
		// TODO Auto-generated method stub
		if(queue.isEmpty()){
			this.wait();
		}
		
		E item = queue.remove(0);
		this.notifyAll();
		
		return item;
	}
	
	

}
