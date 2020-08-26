
public class LinkedListQueue {

	class ListNode {
	
		private ListNode next;
		
		private int data;
		
		public ListNode(int data) {
			this.data = data;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}
		
	}
	
	private int length = 0;
	
	private ListNode front, rear;
	
	public LinkedListQueue() {
		length = 0;
		front = rear = null;
	}
	
	public int size() {
		return length;
	}
	
	public boolean isEmpty() {
		return length == 0;
	}
	
	public void enQueue(int data) {
		
		ListNode newNode = new ListNode(data);
		if(isEmpty())
			front = newNode;
		else
			rear.setNext(newNode);
		
		rear = newNode;
		
		length++;
	}
	
	public int deQueue() {
		
		if(isEmpty()) {
			throw new IllegalStateException("Queue is Empty : underflow");
		}
		
		int tmpData = front.getData();
		front = front.getNext();
		
		length--;
		
		if(isEmpty()){
			rear = null;
		}
		
		return tmpData;
	}
	
	public int first(){
		
		if(isEmpty()){
			throw new IllegalStateException("Queue is empty : underflow");
		}
		
		return front.getData();
	}
	
	public int last() {
		
		if(isEmpty()){
			throw new IllegalStateException("Queue is empty : underflow");
		}
		
		return rear.getData();
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder("[");
		
		ListNode tmpNode = front;
		
		if(front != null) {
			
			sb.append(""+front.getData());
			
			while((tmpNode = tmpNode.getNext()) != null){
				
				sb.append(", "+tmpNode.getData());
				
			}
		}
		
		sb.append("]");
		
		return sb.toString();
	}
}
