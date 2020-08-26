package Problems;

public class DoubleEndedQueue {

	static final int MAX = 100;
	
	int a[];
	int front;
	int size;
	int rear;
	
	public DoubleEndedQueue(int size){
		a = new int[MAX];
		front  = -1;
		rear = 0;
		this.size = size;
	}
	
	public boolean isFull(){
		return ((front == 0 && rear == size-1) || (front == rear + 1));
	}
	
	public boolean isEmpty(){
		return front == -1;
	}
	
	
}
