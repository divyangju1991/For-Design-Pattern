package problem;
import UnrolledlinkedList.UnrolledLinkedList.ListNode;

public class FindLengthOfLoop {

	public int findLengthOfLoop(ListNode head){
		
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		boolean loopExists = false;
		int length = 0;
		
		while(fastPtr != null && fastPtr.getNext() != null){
			fastPtr = fastPtr.getNext().getNext();
			slowPtr = slowPtr.getNext();
			
			if(fastPtr == slowPtr){
				loopExists = true;
				break;
			}
		}
		
		if(loopExists){
			slowPtr = head;
			
			do{
				slowPtr = slowPtr.getNext();
				++length;
			} while(slowPtr != fastPtr);
		}
		return length;
	}
}
