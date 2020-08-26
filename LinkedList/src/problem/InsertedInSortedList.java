package problem;

import MadeEasy.SinglyLinkedList.LinkedList.ListNode;

public class InsertedInSortedList {

	public ListNode insertInSortedList(ListNode head, ListNode newNode){
		
		ListNode current = head;
		if(head == null){
			return null;
		}
		
		ListNode tmpNode = null;
		
		while(current != null && current.getData() <= newNode.getData()){
			tmpNode = current;
			current = current.getNext();
		}
		
		newNode.setNext(current);
		tmpNode.setNext(newNode);
		
		return head;
	}
}
