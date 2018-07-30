package practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class FirstMap {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5);
		List<Integer> list2 = Arrays.asList(6,7,8);
		List<Integer> list3 = Arrays.asList(9,10,11);
		List<List<Integer>> list = Arrays.asList(list1,list2,list3);
		
		//list.stream().map(l -> l.size()).forEach(System.out::println);
		//Function<List<?>,Integer> size = List::size;
		//list.stream().map(size).forEach(System.out::println);
		Function<List<Integer>,Stream<Integer>> flatmapper = l -> l.stream();
		//slist.stream().map(flatmapper).forEach(System.out::println);
		list.stream().flatMap(flatmapper).forEach(System.out::println);
		
		
		
	}
	
}
