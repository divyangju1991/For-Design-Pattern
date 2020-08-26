package MadeEasy.SinglyLinkedList;

public class LinkedList {
	
	public class ListNode {
		
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
	
	public LinkedList(){
		length = 0;
	}
	
	public ListNode getHead(){
		return head;
	}
	
	public synchronized void clear(){
		head = null;
		length = 0;
	}
	
	public int length(){
		return length;
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
	  ListNode	newNode = new ListNode(data);
	  
	  if(head == null){
		  head = newNode;
	  } else {
		  ListNode curr;
		  for(curr = head; curr.getNext() != null; curr = curr.getNext());
		  curr.setNext(newNode);
	  }
	  
	  length += 1;
	}
	
	public synchronized void insertAtPos(int data, int pos){
		
		ListNode newNode = new ListNode(data);
		
		if(pos < 0){
			pos = 0;
		} else if(pos > length) {
			pos = length;
		}
		
		if(head == null){
			head = newNode;
		} else if(pos == 0){
			newNode.setNext(head);
			head = newNode;
		} else {
			ListNode curr = head;
			for(int i=1; i < pos; curr = curr.getNext(), i++);
			
			newNode.setNext(curr.getNext());
			curr.setNext(newNode);
		}
		
		length += 1;
	}
	
	public synchronized ListNode removeFromBegin() {
		
		ListNode tmpNode;
		
		if(head == null){
			return null;
		} else {
			ListNode next = head.getNext();
			tmpNode = head;
			head = next;
			length -= 1;
			
			return tmpNode;
		}
	}
	
    /*public synchronized ListNode removeFromEnd() {
		
		ListNode prevNode;
		
		if(head == null){
			return null;
		} else if(head.getNext() == null) {
			head = null;
			length = 0;
			return head;
		} else {
			ListNode currNode =head, next = head.getNext();
			prevNode = null;
			while((next = currNode.getNext()) != null){
				prevNode = currNode;
				currNode = next;
			}
			
			prevNode.setNext(null);
			length -= 1;
			
			return currNode;
		}
	}*/
	public synchronized ListNode removeFromEnd() {
		
		ListNode prevNode = null;
		ListNode tmpNode;
		
		if(head == null){
			return null;
		} else if(head.getNext() == null) {
			tmpNode = head;
			head = null;
			length = 0;
			return tmpNode;
		} else {
			ListNode currNode;
			for(currNode = head; currNode.getNext()!=null; prevNode = currNode, currNode = currNode.getNext());
			
			tmpNode = currNode;
			prevNode.setNext(null);
			length -= 1;
			
			return tmpNode;
		}
	}
    
    public synchronized ListNode remove(int pos) {
		
		ListNode prevNode, tmpNode;
		
		if(pos < 0) {
			pos = 0;
		} else if(pos > length) {
			pos = length;
		}
		
		if(head == null){
			return null;
		} else if(pos == 0) {
			head = head.getNext();
			return head;
		} else {
			ListNode next = head.getNext();
			prevNode = head;
			
			for(int i = 1; i < pos ; i++) {
				prevNode = next;
				next = next.getNext();
			}
			
			tmpNode = next;
			prevNode.setNext(next.getNext());
			
			return tmpNode;
		}
	}
    
    public synchronized String removeMatched(ListNode matchedNode) {
		
		ListNode prevNode, tmpNode;
		
		if(head == null){
			return null;
		} else if(head.getNext() == null && head.getData() == matchedNode.getData()) {
			head = null;
			return String.valueOf(head.getData());
		} else {
			ListNode next = head.getNext();
			prevNode = head;
			
			while((next = next.getNext()) != null ) {
				prevNode = next;
				
				if(prevNode.getData() == matchedNode.getData()) {
					tmpNode = next;
					prevNode.setNext(next.getNext());
					return String.valueOf(tmpNode.getData());
				}
			}
			
			return "No Match found";
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("LinkedList [");
		
		if(head == null){
			sb.append(" null ]");
		} else if(head.getNext() == null) {
			sb.append(""+ head.getData() + "]");
		} else {
			ListNode curr = head;
			while(curr.getNext() != null){
				sb.append(""+ curr.getData() +", ");
				curr = curr.getNext();
			}
			sb.append(""+ curr.getData() +"]");
		}
		
		return sb.toString();
	}
	
	
}

