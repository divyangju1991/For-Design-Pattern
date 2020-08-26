package problems;

import java.util.LinkedList;
import java.util.Queue;

public class InterLeavingQueueMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> q = new LinkedList<Integer>();
		//11, 12, 13, 14, 15, 16, 17, 18, 19, 20
		q.offer(11);
		q.offer(12);
		q.offer(13);
		q.offer(14);
		q.offer(15);
		q.offer(16);
		q.offer(17);
		q.offer(18);
		q.offer(19);
		q.offer(20);
		
		InterLeavingQueue interLeavingQueue = new InterLeavingQueue();
		interLeavingQueue.interLeavingQueue(q);
		
		System.out.println(q.toString());
	}

}
