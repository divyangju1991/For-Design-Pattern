package distinct;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ListDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> num = Arrays.asList(4,5,6,7,4,5,6);
		
		System.out.println(num.stream().distinct().collect(Collectors.toList()));
	}

}
