package practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstReduction {

	public static void main(String[] args) {
		
		//Empty List
		List<Integer> list = Arrays.asList();
		Integer red = list.stream().reduce(0,(i1,i2)-> i1+i2);
		System.out.println(red);
		
		//With one element
		List<Integer> list1 = Arrays.asList(1);
		Integer red1 = list1.stream().reduce(0,Integer::sum);
		System.out.println(red1);
		
		//Sum With multiple element
				List<Integer> list2 = Arrays.asList(1,2,3,4);
				Integer red2 = list2.stream().reduce(0,Integer::sum);
				System.out.println(red2);
				
		//Sum With multiple element and id as 100
				List<Integer> list7 = Arrays.asList(1,2,3,4);
				Integer red7 = list7.stream().reduce(100,Integer::sum);
				System.out.println(red7);
				
		//Max With multiple element
			List<Integer> list3 = Arrays.asList(1,2,3,4);
			Integer red3 = list3.stream().reduce(0,Integer::max);
			System.out.println(red3);
			
	    // Max with empty
			List<Integer> list4 = Arrays.asList();
			Integer red4 = list4.stream().reduce(0,Integer::max);
			System.out.println(red4);
			
		//Max With multiple element and id as 100
			List<Integer> list8 = Arrays.asList(1,2,3,4);
			Integer red8 = list8.stream().reduce(100,Integer::max);
			System.out.println(red8);
		//Max with no identity and empty i.e., with optional
			List<Integer> list5 = Arrays.asList();
			Optional<Integer> red5 = list5.stream().reduce(Integer::max);
			System.out.println(red5);
			
			//Max with no identity and multiple i.e., with optional
			List<Integer> list6 = Arrays.asList(1,2,3,4);
			Optional<Integer> red6 = list6.stream().reduce(Integer::max);
			System.out.println(red6);
	}
	
}
