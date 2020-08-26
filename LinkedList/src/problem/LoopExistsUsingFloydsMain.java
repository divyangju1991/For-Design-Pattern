package problem;
import UnrolledlinkedList.UnrolledLinkedList;
import UnrolledlinkedList.UnrolledLinkedList.ListNode;

public class LoopExistsUsingFloydsMain {

	public static void main(String[] args) {
		
		UnrolledLinkedList<Integer> list = new UnrolledLinkedList<Integer>();
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(9);
		list.add(7);
		
		System.out.println(new LoopExistsUsingFloyds().findLoopExistUsingFloyds(list.getFirstNode()));
	}
}
