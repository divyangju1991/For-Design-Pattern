package problems;

public class SearchUsingIterativeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14};
		
		System.out.println(""+new SearchUsingIterative().search(a, 5));
		
		System.out.println(""+new SearchUsingIterative().search(a, 20));
		
		System.out.println(""+new SearchUsingIterative().search(a, 3));
	}

}
