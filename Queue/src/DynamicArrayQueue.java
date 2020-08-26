/**
 * DeQueue
 * @author baps
 *
 */
public class DynamicArrayQueue {

	private int size, front, rear, cap;
	
	private int[] queueRep;
	
	private static final int CAPACITY = 16;
	

	public DynamicArrayQueue(){
		queueRep  = new int [CAPACITY];
		size = 0; front = 0; rear = 0;
	}
	
	public DynamicArrayQueue(int cap) {
		queueRep = new int[cap];
		size = 0; front = 0; rear = 0;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}
	
	public int size() {
	   return size;	
	}
	
    public boolean isFull() {
    	return size == cap;
    }
	
	public void enQueue (int data) throws NullPointerException, IllegalStateException{
		
		if(isFull()){
			expand();
		}
		
		size ++;
		queueRep[rear] = data;
		
		rear = (rear + 1) % cap;
	}
	
	public int deQueue() {
		
		if(isEmpty()) {
			throw new IllegalStateException("Queue is empty : underflow");
		}
		
		int tmp = queueRep[rear];
		
		queueRep[rear] = Integer.MIN_VALUE;
		
		rear = (rear + 1) % cap;
		
		return tmp;
	}
	
	private void expand() {
		
		int length = size();
		
		int[] newQueue = new int[length<<1];
		
		for(int i = front; i <= rear; i++) {
			newQueue[i-front] = queueRep[i%cap]; 
		}
		
		queueRep = newQueue;
		front = 0;
		rear = size - 1;
		cap *= 2;
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder("[");
		
		for(int i = front; i < rear; i++) {
			sb.append(""+queueRep[i%cap]);
			
			if(i < size -1) {
				sb.append(", ");
			}
		}
		
		sb.append("]");
		
		return sb.toString();
	}
}
