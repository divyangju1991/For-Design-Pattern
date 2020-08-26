package problems;

public class LinearSearchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,2,5,5,5};
		
		int b[] = {1,2,4,2,6,7,8,7,7};
		
		System.out.println(new LinearSearch().linearSearch(a, 5));
		
		System.out.println(new LinearSearch().linearSearch(b, 2));
		
		System.out.println(new LinearSearch().linearSearch(a, 2));
		
		System.out.println(new LinearSearch().linearSearch(b, 1));
		
		System.out.println(new LinearSearch().linearSearch(b, 7));
	}

}
