package practice;

import java.util.function.Function;

interface Runnable{
	String process();
}
public class Tutorial {

	public String run(String str,Function<String,String> r){
		System.out.println("Hello");
		return "World"+ r.apply(str);
	}
	public static void main(String[] args) {
		Tutorial t = new Tutorial();
		String m = t.run("Bye",str -> str.toLowerCase());
		System.out.println(m);
	}
}
