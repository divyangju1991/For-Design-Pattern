package MadeEasy.SinglyLinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list = new LinkedList();
		System.out.println(list.toString());
		
		list.insertAtBegin(20);
		System.out.println(list.toString());
		
		list.insertAtEnd(25);
		list.insertAtEnd(75);
		System.out.println(list.toString());
		
		list.insertAtPos(10, 0);
		System.out.println(list.toString());
		
		list.insertAtPos(28, 2);
		System.out.println(list.toString());
		
		list.insertAtPos(48, 1);
		System.out.println(list.toString());
		
		list.remove(2);
		System.out.println(list.toString());
		
		list.remove(3);
		System.out.println(list.toString());
		
		list.removeFromBegin();
		System.out.println(list.toString());
		
		list.removeFromEnd();
		System.out.println(list.toString());
		
		list.removeFromEnd();
		System.out.println(list.toString());
		
		list.removeFromBegin();
		System.out.println(list.toString());
		
	}

}
