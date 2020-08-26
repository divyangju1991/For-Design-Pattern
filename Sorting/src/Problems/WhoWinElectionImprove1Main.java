package Problems;

public class WhoWinElectionImprove1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,8,7,3,2};
		int b[] = {3,8,7,3,2,7,2,3,8,8,8,8,8};
		int c[] = {3,8,7,3,2,3,8,7,3,2,3,8,7,3,2,7,7,7,1,7,1,7,1,7};
		int d[] = {2,2,2,2,2,2,2,3,8,7,3,2,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
		
		System.out.println(new WhoWinElection().checkWhoWinTheElection(a));
		System.out.println(new WhoWinElection().checkWhoWinTheElection(b));
		System.out.println(new WhoWinElection().checkWhoWinTheElection(c));
		System.out.println(new WhoWinElection().checkWhoWinTheElection(d));
	}

}
