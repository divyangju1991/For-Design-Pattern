package basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInternally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = new ArrayList(Arrays.asList("one", "two"));
	     Stream<String> sl = l.stream();
	     l.add("three");
	     System.out.println(sl.collect(Collectors.toList()));
	     
	     Stream<String> s2 = l.parallelStream();
	     System.out.println(s2.collect(Collectors.toList()));
	 
	}

}
