package set;

import java.util.HashSet;

public class TestSetAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		
		if(set.add(2))
			System.out.println("2 is not Duplicate");
		
		if(!set.add(2))
			System.out.println("2 is Duplicate");
	}

}
