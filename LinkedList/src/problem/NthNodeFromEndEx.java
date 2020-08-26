package problem;
import MadeEasy.SinglyLinkedList.LinkedList.ListNode;

public class NthNodeFromEndEx {

	
	public ListNode nThNodeFromEnd(ListNode head, int nThNode){
		ListNode pNode= head, pThNode = null;
		
		for(int count=1; count<nThNode;count++){
			
			if(pNode != null){
				pNode = pNode.getNext();
			}
		}
		
		while(pNode != null){
			
			if(pThNode == null){
				pThNode = head;
			} else {
				pThNode = pThNode.getNext();
			}
			
			pNode = pNode.getNext();
		}
		
		if(pThNode != null){
			System.out.println("pThNode : "+pThNode.getData());
			return pThNode;
		} else {
			return null;
		}
	}
}
