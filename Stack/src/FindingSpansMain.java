import java.util.Arrays;

public class FindingSpansMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindingSpans findingSpans = new FindingSpans();
		int a[] = {6, 3, 4, 5, 2};
		
		System.out.println(Arrays.toString(findingSpans.findingSpans(a)));
		
		int b[] = {8, 4, 3, 2, 1};
		
		System.out.println(Arrays.toString(findingSpans.findingSpans(b)));

		int c[] = {8, 1, 2, 3, 4};
		
		System.out.println(Arrays.toString(findingSpans.findingSpans(c)));
		int d[] = {1, 2, 3, 4, 5};
		
		System.out.println(Arrays.toString(findingSpans.findingSpans(d)));

		int e[] = {5, 4, 1, 2, 3};
		
		System.out.println(Arrays.toString(findingSpans.findingSpans(e)));

	}

}
