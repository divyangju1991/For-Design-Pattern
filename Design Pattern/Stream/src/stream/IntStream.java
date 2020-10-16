package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class IntStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Stream<Integer> s = list.stream().filter(n -> (n == 5));
				
		System.out.println(s.findFirst());
				
		Optional<Integer> op = list.stream().filter(n -> (n == 10)).findFirst();
		
		System.out.println(op);
		
		System.out.println(op.orElse(1));
		
		//java.util.NoSuchElementException: No value present
		//System.out.println(op.get());
		
		System.out.println(list.stream().anyMatch(n -> (n == 5)));
		
		System.out.println(list.stream().allMatch(n -> (n == 5)));
		
		System.out.println(list.stream().noneMatch(n -> (n == 10)));
		
		list.stream().filter(n -> (n == 5)).forEach(System.out::println);
		
		
	}

}
