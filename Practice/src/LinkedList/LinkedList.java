package LinkedList;

public class LinkedList {

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
	
	private ListNode head;
	
	private int length;
	
	public int length() {
		return this.length;
	}
	
	public synchronized void insertAtBegin(int data){
		
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			head = newNode;
		} else {
			newNode.setNext(head);
			head = newNode;
		}
		
		length += 1;
	}
	
	public synchronized void insertAtEnd(int data){
		
		ListNode newNode = new ListNode(data);
		
		if(head == null) {
			head = newNode;
		} else {
			
			ListNode curr = head, prev = null;
			while(curr != null) {
				prev = curr;
				curr = curr.getNext();
			}
					
			prev.setNext(newNode);
		}
		
		length += 1;
	}
	
	public synchronized void insertAtPos(int data, int pos){
		
		ListNode newNode = new ListNode(data);
		
		if(pos < 0) {
			pos = 0;
		} else if(pos > length){
			pos = length;
		}
		
		if(pos == 0) {
			newNode.setNext(head);
			head = newNode;
		} else {
			ListNode curr = head;
			for(int i = 1; i < pos; i++){
				curr = curr.getNext();
			}
			
			newNode.setNext(curr.getNext());
			curr.setNext(newNode);
		}
		
		length += 1;
	}
	
	public synchronized ListNode removeFromBegin(){
		
		ListNode tmpNode;
		if(head == null){
			return null;
		} else {
			tmpNode = head;
			head = head.getNext();
			length -= 1;
			return tmpNode;
		}
		
	}
	
	public synchronized ListNode removeFromEnd(){
		
		if(head == null) {
			return null;
		} else if(head.getNext() == null) {
			head = null;
			return null;
		} else {
			
			ListNode prev = null, curr = head, next = curr.getNext();
			
			while(next != null){
				prev = curr;
				curr = next;
				next = curr.getNext();
			}
			
			prev.setNext(next);
			
			length -= 1;
			return curr;
		}
	}
	
	public synchronized ListNode remove(int pos){
		
		if(pos < 0) {
			pos = 0;
		} else if(pos > length) {
			pos = length;
		}
		
		ListNode tmpNode;
		if(head == null) {
			return null;
		} else if(pos == 0) {
			tmpNode = head;
			head = head.getNext();
			return tmpNode;
		} else {
			
			ListNode prev = null, curr = head, next = head.getNext();
			for(int i = 0; i < pos; i++) {
				
				prev = curr;
				curr = next;
				next = curr.getNext();
				
			}
			
			prev.setNext(next);
			return curr;
		}
	}

	@Override
	public String toString() {
		
		if(head == null) {
			return "[null]";	
		} else if(head.getNext() == null) {
			return "["+ head.getData() +"]";
		} else {
			StringBuilder sb = new StringBuilder("["+ head.getData());
			ListNode curr = head;
			while ((curr = curr.getNext()) != null){
				sb.append(", "+ curr.getData());
			}
			sb.append("]");
			return sb.toString();
		}
		
	}
	
	
}
