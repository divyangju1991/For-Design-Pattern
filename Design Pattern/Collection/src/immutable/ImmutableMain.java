package immutable;

import java.util.List;

public class ImmutableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"Divyang", "Komal"};
		Immutable2 immutable = new Immutable2(1, "Divu", names);
		
		List<String> list = immutable.getList();
		
		list.add("Ramesh");
		
		System.out.println(list);
		
		
		
	}

}
