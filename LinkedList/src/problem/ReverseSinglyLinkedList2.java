package problem;

import MadeEasy.SinglyLinkedList.LinkedList.ListNode;

public class ReverseSinglyLinkedList2 {

	public void revereListRecursive(ListNode curr, ListNode[] head){
		
		if(curr == null){
			return;
		}
		
		ListNode next = curr.getNext();
		
		if(next == null){
			head[0] = curr;
			return;
		}
		
		revereListRecursive(next, head);
		
		next.setNext(curr);
		curr.setNext(null);
		
	}
}
