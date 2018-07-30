package practice;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Method {

	public static void main(String[] args) {
		String prefix = "MR.";
		System.out.println(process("Hello World",str->str.toLowerCase()));
		System.out.println(process("Hello World",String::toLowerCase));
		System.out.println(process2("Hello World",5,(str,i)->str.substring(i)));
		System.out.println(process2("Hello World",5,String::substring));
		System.out.println(process("Hello World",str->prefix.concat(str)));
		System.out.println(process("Hello World",prefix::concat));
		
	}
	
	private static String process2(String string, int i, BiFunction<String,Integer,String>processor) {
		return processor.apply(string,i);
	}

	static String process(String str,Function<String,String> processor ){
		return processor.apply(str);
	}
}
