package Problems;

public class CheckDuplicatesImprove1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int a[] = {3,8,7,3,2};
		System.out.println(new CheckDuplicatesImprove1().isDuplicatesFoundInArray(a, a.length));
		
		int b[] = {3,8,7,1,2};
		System.out.println(new CheckDuplicatesImprove1().isDuplicatesFoundInArray(b, b.length));	
		
		int c[] = {3,8,7,6,2,8};
		System.out.println(new CheckDuplicatesImprove1().isDuplicatesFoundInArray(c, c.length));	
		
		int d[] = {3,8,7,3,1,2,1};
		System.out.println(new CheckDuplicatesImprove1().isDuplicatesFoundInArray(d, d.length));	
		
		
	}

}
