package distinct;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListDistinctString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> name = Arrays.asList("Divu", "Divu", "DIVU", "DivU", "DiVu", "Kamlesh");
		Set<String> set = new HashSet<String>();
		
		System.out.println(name.stream().map(s -> s.toLowerCase()).distinct().collect(Collectors.toList()));
		
		System.out.println(name.stream().map(s -> s.toLowerCase()).filter(s -> !set.add(s)).distinct().collect(Collectors.toList()));
	}

}
