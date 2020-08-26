package problem;

import MadeEasy.SinglyLinkedList.LinkedList;

public class NthNodeFromEndExMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		list.insertAtBegin(7);
		list.insertAtBegin(1);
		list.insertAtBegin(3);
		list.insertAtBegin(2);
		list.insertAtBegin(8);
		list.insertAtBegin(9);
		
		new NthNodeFromEndEx().nThNodeFromEnd(list.getHead(), 3);
		new NthNodeFromEndEx().nThNodeFromEnd(list.getHead(), 1);
		new NthNodeFromEndEx().nThNodeFromEnd(list.getHead(), 4);
		new NthNodeFromEndEx().nThNodeFromEnd(list.getHead(), 6);
	}

}
