package countdownlatch;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		try {
			CountDownLatch countDownLatch = new CountDownLatch(2);
			
			DevTeam teamA = new DevTeam(countDownLatch, "Team-A");
			DevTeam teamB = new DevTeam(countDownLatch, "Team-B");
			
			teamA.start();
			teamB.start();
			
			countDownLatch.await();
			
			QATeam qaTeam = new QATeam("QATeam");
			qaTeam.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
