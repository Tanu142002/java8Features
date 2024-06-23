package java8Features;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIAssignment {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("** Predicate **");
		System.out.print("Enter character: ");
		Character c = sc.next().charAt(0);
		
		Predicate<Character> pChar = new Predicate<Character>() {

			@Override
			public boolean test(Character t) {
				switch (t) {
				case 'a': {

					System.out.println("It is vowel");
					break;
				}
				case 'e': {

					System.out.println("It is vowel");
					break;
				}
				case 'i': {

					System.out.println("It is vowel");
					break;
				}
				case 'o': {

					System.out.println("It is vowel");
					break;
				}
				case 'u': {

					System.out.println("It is vowel");
					break;
				}
				default:
					System.out.println("It is not vowel");
				}
				return false;
			}
		};
		pChar.test(c);
		System.out.println();
		System.out.println("** Consumer **");
		
		Consumer<String> consumer = new Consumer<String>() {
			
			@Override
			public void accept(String t) {
				System.out.println(t + "Consumer here.");
				
			}
		};
		 consumer.accept("Hey! Hello , ");
		 
		 System.out.println();
		 System.out.println("** Function **");
		 
		 Function<Integer,Integer> function =new Function<>() {

			@Override
			public Integer apply(Integer t) {
				
				return t*t;
			}
		};
		Integer t1=5;
		int b=function.apply(t1);
		System.out.println("Square of " + t1 + " is: " + b);
		
		System.out.println();
		System.out.println("** Supplier **");
		Supplier<String> supplier=new Supplier<String>() {
			
			@Override
			public String get() {
				String msg="Supplier here.";
				return msg;
			}
		};
		String res= supplier.get();
		System.out.println(res);
	}
}
