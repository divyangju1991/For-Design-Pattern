package problem;
import UnrolledlinkedList.UnrolledLinkedList.ListNode;

public class CylicFirstNode {
	
	public ListNode findBeginOfLoop(ListNode head){
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		boolean loopExists = false;
		
		while(fastPtr != null && fastPtr.getNext() != null){
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			
			if(slowPtr == fastPtr){
				loopExists = true;
				break;
			}
		}
		
		if(loopExists){
			slowPtr = head;
			while(slowPtr != fastPtr){
				slowPtr = slowPtr.getNext();
				fastPtr = fastPtr.getNext();
			}
			return fastPtr;
		} else {
			return null;
		}
		
	}

	
	
	
}
