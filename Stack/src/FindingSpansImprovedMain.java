import java.util.Arrays;

public class FindingSpansImprovedMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindingSpansImproved findingSpans = new FindingSpansImproved();
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
		
		int f[] = {5, 1, 3, 2, 7, 5};
		
		System.out.println(Arrays.toString(findingSpans.findingSpans(f)));

	}

}
