package problems;

public class MaxRepetationNumberImprovedMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,8,7,3,2};
		int b[] = {3,8,7,3,2,7,2,3,8,8,8,8,8};
		int c[] = {3,8,7,3,2,3,8,7,3,2,3,8,7,3,2,7,7,7,1,7,1,7,1,7};
		int d[] = {2,2,2,2,2,2,2,3,8,7,3,2,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8};
		int x[] = {3,8,8,8,2};
		
		System.out.println(new MaxRepetationNumberImproved3().maxRepetationNumber(a));
		System.out.println(new MaxRepetationNumberImproved3().maxRepetationNumber(b));
		System.out.println(new MaxRepetationNumberImproved3().maxRepetationNumber(c));
		System.out.println(new MaxRepetationNumberImproved3().maxRepetationNumber(d));
		System.out.println("x : " + new MaxRepetationNumberImproved3().maxRepetationNumber(x));
		
	}

}
