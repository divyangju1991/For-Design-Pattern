public class FixedSizeArrayQueue {

	private int[] queueRep;
	private int size, front, rear;
	
	private static final int CAPACITY = 16;
	
	private int cap;
	
	public FixedSizeArrayQueue() {
		queueRep = new int[CAPACITY];
		size=0; front=0;rear=0;cap=CAPACITY;
	}
	
	public FixedSizeArrayQueue(int cap) {
		queueRep = new int[cap];
		front=0;rear=0;size=0;this.cap=cap;
	}
	
	public void enQueue(int data) throws NullPointerException, IllegalStateException {
		
		if(size == cap){
			throw new IllegalStateException("Queue is full: Overflow");
		
		} else {

			size++;
			
			queueRep[rear] = data;
			rear = (rear+1)%cap;
		}
		
	}
	
	public int deQueue() throws IllegalStateException{
		
		if(size == 0){
			throw new IllegalStateException("Queue is Empty: Underflow");
		}
		
		size--;
		
		int data = queueRep[front];
		
		queueRep[front] = Integer.MIN_VALUE;
		front = (front+1)%cap;
		
		return data;
	}
	
	public boolean isEmpty() {
		return (size == 0);
	}

	public boolean isFull() {
		return (size == cap);
	}
	
	public int size(){
		return size;
	}
	
	public String toString() {
		
		String result = "[";
		
		for(int i=0; i<size; i++) {
			result += Integer.toString(queueRep[(front+i)%cap]);
			
			if(i < size-1){
				result += ", ";
			}
		}
		
		result += "]";
		
		return result;
	}
}
