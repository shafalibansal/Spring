package practice;

import java.util.Arrays;
import java.util.Comparator;

public class Lambda {

	public static void main(String[] args) {
		String[] names ={"Mr John","Ms Shweta","Dr Ram","Dr Jimmy"}; 
		//Using Java 7
		Arrays.sort(names ,new Comparator<String>(){

			@Override
			public int compare(String name1,String name2) {
				return name1.split(" ")[1].compareTo(name2.split(" ")[1]);
			}
			
		});
		System.out.println(Arrays.toString(names));
		
		//using Java 8 Lambda expression 
		Arrays.sort(names,(name1,name2)-> name1.split(" ")[1].compareTo(name2.split(" ")[1]));
		
		System.out.println(Arrays.toString(names));
		
		
		//using Java 8 Lambda expression in short way
				Arrays.sort(names,Comparator.comparing(name1 -> name1.split(" ")[1]));
				
				System.out.println(Arrays.toString(names));
				
		//using Method reference
				Arrays.sort(names,Comparator.comparing(Lambda::firstName));
				
				System.out.println(Arrays.toString(names));
				
		//using Method reference in reverse order
				Arrays.sort(names,Comparator.comparing(Lambda::firstName).reversed());
				
				System.out.println(Arrays.toString(names));
				
		//using Method reference in reverse order
				Arrays.sort(names,Comparator.comparing(Lambda::firstName).reversed().thenComparing(Lambda::title));
				
				System.out.println(Arrays.toString(names));
				
				
	}
	public static String firstName(String name){
		return name.split(" ")[1];
	}
	
	public static String title(String name){
		return name.split(" ")[0];
	}
}
