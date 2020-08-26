package problem;
import MadeEasy.SinglyLinkedList.LinkedList.ListNode;

public class NthNodeFromEndEx2 {

	int count = 0;
	
	public ListNode nThNodeFromEnd(ListNode head, int nThNode){
		
		if(head != null){
			nThNodeFromEnd(head.getNext(), nThNode);
			count++;
		}
		
		if(nThNode == count){
			System.out.println("data = "+head.getData());
			return head;
		}
		
		return null;
	}
}
