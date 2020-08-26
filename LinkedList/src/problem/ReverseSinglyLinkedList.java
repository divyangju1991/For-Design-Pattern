package problem;

import MadeEasy.SinglyLinkedList.LinkedList.ListNode;

public class ReverseSinglyLinkedList {

	public ListNode revereListIterative(ListNode head){
		
		ListNode curr = head;
		ListNode prev = null;
		ListNode next = null;
		
		while(curr != null){
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		
		return prev;
	}
}
