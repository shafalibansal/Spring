package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FirstPredicate {

	public static void main(String[] args) {

		//Filter and peek operations are lazy but forEach is not
		//Filter with single predicate
		Stream<String> stream = Stream.of("one","two","three","four","five");
		Predicate<String> p = t -> t.length() > 3;
		stream.filter(p).forEach(s -> System.out.println(s));
		
		System.out.println("================================");
		//Filter with two predicates
		Stream<String> stream1 = Stream.of("one","two","three","four","five");
		Predicate<String> p1 = Predicate.isEqual("two");
		Predicate<String> p2 = Predicate.isEqual("three");
		stream1.filter(p1.or(p2)).forEach(s -> System.out.println(s));
		
		System.out.println("================================");
		//Filter with two predicates and peek and no output will be printed.Peek is an intermediate operation
		Stream<String> stream2 = Stream.of("one","two","three","four","five");
		List<String> list = new ArrayList<>();
		stream2.peek(System.out::println).filter(p1.or(p2)).peek(list::add);
		
		System.out.println("================================");
		//Filter with two predicates and peek and forEach and output will be printed.Peek is an intermediate operation but forEach is not
		Stream<String> stream3 = Stream.of("one","two","three","four","five");
		List<String> list1 = new ArrayList<>();
		stream3.peek(System.out::println).filter(p1.or(p2)).forEach(list1::add);
		System.out.println("size of list:"+list1.size());
	}

}
