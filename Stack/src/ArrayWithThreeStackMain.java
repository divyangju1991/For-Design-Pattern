public class ArrayWithThreeStackMain {
	
	public static void main(String args[]){
		
		ArrayWithThreeStack s = new ArrayWithThreeStack(12);
		
		s.push(1, 2);
		s.push(2, 5);
		s.push(3, 15);
		
		System.out.println(s.toString());
		
		s.push(1, 7);
		s.push(2, 8);
		s.push(3, 16);
		
		System.out.println(s.toString());
		
		s.push(1, 10);
		s.push(2, 11);
		s.push(3, 18);
		
		System.out.println(s.toString());
		
		s.push(1, 4);
		s.push(2, 6);
		s.push(3, 14);
		
		System.out.println(s.toString());
		System.out.println("=======================");
		
s = new ArrayWithThreeStack(12);
		
		s.push(1, 2);
		s.push(1, 5);
		s.push(1, 15);
		s.push(3, 16);

		System.out.println(s.toString());
		
		s.push(1, 7);
		System.out.println(s.toString());
		s.push(1, 8);
		System.out.println(s.toString());
		s.push(1, 10);
		System.out.println(s.toString());
		s.push(1, 11);
		System.out.println(s.toString());
		
		s.push(3, 18);
		
		System.out.println(s.toString());
		
		s.push(1, 4);
		s.push(2, 6);
		s.push(3, 14);
		
		System.out.println(s.toString());
		
		System.out.println(s.printObject());
		
		s.pop(3);
		s.pop(3);
		System.out.println(s.toString());
		System.out.println(s.printObject());
		
		s.pop(3);
		
		

	}
}
