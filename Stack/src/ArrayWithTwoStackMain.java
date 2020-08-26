public class ArrayWithTwoStackMain {
	
	public static void main(String args[]){
		
		ArrayWithTwoStack s = new ArrayWithTwoStack(8);
		
		s.push(1, 2);
		s.push(2, 5);
		
		System.out.println(s.toString());
		
		s.push(1, 7);
		s.push(2, 8);
		
		System.out.println(s.toString());
		
		s.push(1, 10);
		s.push(2, 11);
		
		System.out.println(s.toString());
		
		s.push(1, 4);
		s.push(2, 6);
		
		System.out.println(s.toString());
	}
}
