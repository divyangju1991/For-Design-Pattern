package DoublyLinkedList.Dummy1;

public class DoublyLinkedList {

	private DLLNode head;
	
	private DLLNode tail;
	
	private int length;
	
	public DoublyLinkedList() {
		
		head = null;
		tail = null;
		length = 0;
	}
	
	public DLLNode insertAtBegin(int data){
		
		DLLNode newNode = new DLLNode(data, null, head);
		if(length == 0) {
			tail = newNode;
		} else {
			newNode.getNext().setPrev(newNode);
		}
		 
		head = newNode;
		length += 1;
	
		return head;
	}
	
	public DLLNode insertAtEnd(int data){
		
		DLLNode newNode = new DLLNode(data, tail, null);
		if(head != null) {
			newNode.getPrev().setNext(newNode);
		} else {
			head = newNode;
		}
		length += 1;
	
		return tail;
	}
	
	public DLLNode insert(int data, int pos){
		
		if(pos < 0) {
			pos = 0;
		}
		
		if(pos > length){
			pos = length;
		}
		
		DLLNode newNode = new DLLNode(data);
		if(head == null){
			head = tail = newNode;
		} else if(pos == 0) {
            newNode.setNext(head);
            head = newNode;
            newNode.getNext().setPrev(newNode);
		} else {
			DLLNode tmpNode = head;
			int tmpPos = 0;
			while(((tmpPos = ++tmpPos) < pos) && ((tmpNode = tmpNode.getNext()) != null));
			
			newNode.setNext(tmpNode.getNext());	
			newNode.setPrev(tmpNode);
			newNode.getNext().setPrev(newNode);
			tmpNode.setNext(newNode);
		}
		
		length += 1;
		
		return newNode;
	}
	
	public DLLNode removeFromFront(){
		
		DLLNode saveNode = head;
		
		if(head == null){
			return null;
		} else {
			head = head.getNext();
			
			if(head == null) {
				tail = null;
			}
			
			length -= 1;
			
			return saveNode;
		}
		
	}
	
	public DLLNode removeFromEnd(){
		
		DLLNode saveNode = tail;
		
		if(head == null){
			return null;
		} else {
			
			tail = tail.getPrev();
			
			if(tail == null){
				head = null;
			} else {
				tail.setNext(null);
			}
			
			length -= 1;
			
			return saveNode;
		}
	}
	
	
	public DLLNode remove(int pos) {
		
		DLLNode saveNode = null;
		
		if(pos < 0){
			pos = 0;
		} else if(pos > length) {
			pos = length;
		}
		
		if(head == null){
			return null;
		} else if(pos == 0) {
			saveNode = head;
			head = head.getNext();
			
			if(head == null) {
				tail = null;
			}
			
			length -= 1;
			
			return saveNode;
		} else {
			
			DLLNode tmpNode = head;
			int tmpPos = 0;
			
			while(((tmpPos = ++tmpPos) < pos) && ((tmpNode = tmpNode.getNext()) != null));
			
			saveNode = tmpNode;
			tmpNode.getPrev().setNext(tmpNode.getNext());
			tmpNode.getNext().setPrev(tmpNode.getPrev());
			
			length -= 1;
			
			return saveNode;
		}
	}
	
	public DLLNode removeMatched(int data) {
		
		if(head.getData() == ) {
			
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		if(length == 0){
			sb.append("[]");
		} else{
			
			sb.append("["+head.getData());
			
			DLLNode temp = head;
			while((temp = temp.getNext()) != null){
				sb.append(", "+temp.getData());
			}
			sb.append("]");
		}
		
		return sb.toString();
	}
}

