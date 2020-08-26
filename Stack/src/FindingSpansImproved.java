import java.util.Stack;

public class FindingSpansImproved {
	
	public int[] findingSpans(int[] a){
		
		int[] spans = new int[a.length];
		Stack<Integer> s = new Stack<Integer>();
		int p = 0;
		
		for(int i=0; i<a.length; i++){
			
			while(!s.empty() && a[i] > a[s.peek()]) {
				s.pop();
			}
			
			if(s.isEmpty())
				p = -1;
			else
				p = s.peek();
			
			spans[i] = i - p;
			s.push(i);
		}
		
		return spans;
	}
}