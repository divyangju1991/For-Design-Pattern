package map.comparator;

import java.util.Comparator;

public class ComparatorById implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getId().compareTo(o2.getId());
	}
	
}
