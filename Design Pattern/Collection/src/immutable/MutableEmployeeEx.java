package immutable;

import java.util.HashMap;
import java.util.Map;

public class MutableEmployeeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MutableEmployee e1 = new MutableEmployee();
		e1.setName("Divu");
		e1.setId(1);
		
		MutableEmployee e2 = new MutableEmployee();
		e2.setName("Divu");
		e2.setId(1);
		
		Map<MutableEmployee, String> map = new HashMap<MutableEmployee, String>();
		map.put(e1, "1");
		map.put(e2, "2");
		
		System.out.println("size : "+map.size());
		
		System.out.println(map.get(e1));
		
		System.out.println(map.get(e2));
		
		e1.setName("Kamlesh");
		
		System.out.println("size : "+map.size());
		
		System.out.println(map.get(e1));
		
		System.out.println(map.get(e2));
	}

}
