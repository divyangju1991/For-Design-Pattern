package DoublyLinkedList.Dummy1;

public class DLLNode {

	private DLLNode prev;
	
	private DLLNode next;
	
	private int data;

	
	public DLLNode(int data) {
		this.data = data;
		this.prev = null;
		this.next = null;
	}
	
	public DLLNode(int data, DLLNode prev, DLLNode next) {
		this.prev = prev;
		this.next = next;
		this.data = data;
	}

	public DLLNode getPrev() {
		return prev;
	}

	public void setPrev(DLLNode prev) {
		this.prev = prev;
	}

	public DLLNode getNext() {
		return next;
	}

	public void setNext(DLLNode next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	
}
