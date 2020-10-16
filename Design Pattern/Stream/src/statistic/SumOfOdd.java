package statistic;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.IntPredicate;
import java.util.function.Predicate;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SumOfOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		/*
		list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n))
		.collect(Collectors.toList()).stream();
		
		
		
		
		System.out.println(list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n))
				.collect(Collectors.toList()));
		*/
		
		System.out.println(list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n)).mapToInt(Integer::intValue).sum());
		
		System.out.println(list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n)).mapToInt(Integer::intValue).average());
		
		System.out.println(list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n)).mapToInt(Integer::intValue).summaryStatistics());
		
		System.out.println(list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n)).reduce(0, Integer::sum));
		
		System.out.println(list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n)).reduce(Integer.MAX_VALUE, Integer::min));
		
		System.out.println(list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n)).reduce(0, Integer::max));
		
		/*
		 * Not supported Method
		System.out.println(list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n)).reduce(0, Long::count));
		System.out.println(list.stream().filter(n -> (n%2 == 0)).map(n -> (n*n)).reduce(0, Integer::average));
		*/
		List<String> names = Arrays.asList("AB", "CD", "EF");
		
		System.out.println(names.stream().reduce("", (s1, s2) -> s1+s2));
		
		//System.out.println(names.stream().map((s1, s2) -> s1+s2));
	}

}
