import java.util.EmptyStackException;

public class LinkedStack<T> {

	private int length; //Indicates size of the linked list
	private ListNode top;
	
	class ListNode {
		
		private int data;
		
		private ListNode next;
		
		public ListNode(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public ListNode getNext() {
			return next;
		}

		public void setNext(ListNode next) {
			this.next = next;
		}

	}
	
	//Constructor create Empty Stack
	public LinkedStack() {
		length  = 0;
		top = null;
	}
	
	public boolean isEmpty(){
		return (length == 0);
	}
	
	public int size(){
		return length;
	}
	
	//Adds specific data to the stack
	public void push(int data) {
		ListNode tmp = new ListNode(data);
		tmp.setNext(top);
		top = tmp;
		length++;
	}
	
	public int pop() throws EmptyStackException {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		int result = top.getData();
		top = top.getNext();
		length--;
		
		return result;
	}
	
	public int peek() throws EmptyStackException {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return top.getData();
	}
	
	public String toString(){
		
		StringBuilder sb = new StringBuilder();
		ListNode curr = top;
		
		while(curr != null){
			sb.append(curr.getData() + "\n");
			curr = curr.getNext();
		}
		
		return sb.toString();
	}
	
}
