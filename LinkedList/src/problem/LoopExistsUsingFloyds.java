package problem;
import UnrolledlinkedList.UnrolledLinkedList.ListNode;

public class LoopExistsUsingFloyds {

	public boolean findLoopExistUsingFloyds(ListNode head){
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		
		while(fastPtr != null && fastPtr.getNext() != null){
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			
			if(fastPtr == slowPtr){
				return true;
			}
		}
		
		return false;
	}
}
