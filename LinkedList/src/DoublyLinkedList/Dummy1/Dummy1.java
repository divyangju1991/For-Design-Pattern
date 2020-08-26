package DoublyLinkedList.Dummy1;

public class Dummy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList list = new DoublyLinkedList();
		
//		list.insert(81, 0);
//		System.out.println(list.toString());
		
//		list.insertAtEnd(15);
//		System.out.println(list.toString());
		
		list.insertAtBegin(10);
		System.out.println(list.toString());
		list.insertAtBegin(25);
		System.out.println(list.toString());
		list.insertAtBegin(40);
		System.out.println(list.toString());
		list.insertAtBegin(50);
		System.out.println(list.toString());
		list.insertAtEnd(15);
		System.out.println(list.toString());
		list.insert(28, 2);
		System.out.println(list.toString());
		list.insert(48, 1);
		System.out.println(list.toString());
		list.insert(79, 4);
		System.out.println(list.toString());
		list.insert(81, 0);
		System.out.println(list.toString());
		list.insert(88, 0);
		System.out.println(list.toString());
		
		System.out.println("int min value = "+Integer.MIN_VALUE);
		
		System.out.println(" min value < 0 : "+(Integer.MIN_VALUE < 0));
	}

}
