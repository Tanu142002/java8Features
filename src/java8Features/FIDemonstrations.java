package java8Features;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIDemonstrations {
	public static void main(String[] args) {
		

		
		Predicate<Integer> prtestwithlambda= 
				(Integer x)->
		(x>100)
		;
		System.out.println(prtestwithlambda.test(5));
		
		
		Function<String, String> function=(s)-> s.toUpperCase();
		System.out.println(function.apply("gm"));
		
	
		Predicate<Integer> prtest = new Predicate<Integer>() {

			@Override
			public boolean test(Integer num) {
				if (num > 100) {
					System.out.println("Greater than 100 !!");
				} else {
					System.out.println("Less than 100 !!");
				}
				return false;
			}
		};
	prtest.test(102);
	
	
		Consumer<String> consumer = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s + "From Consumer");

			}
		};
//		consumer.accept("Good Morning ");
		Function<String, String> funct = new Function<String, String>() {

			@Override
			public String apply(String s) {
				s = s.toUpperCase();
				return s;
			}
		};
		String caps = funct.apply("hello good morning");
		System.out.println(caps);

		Supplier<String> sup = new Supplier<String>() {

			@Override
			public String get() {
				String msg = "hello from supplier";
				return msg;
			}
		};
		String getmsg = sup.get();
		System.out.println(getmsg);
	}
}
