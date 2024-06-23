package java8Features;

import java.util.Arrays;
import java.util.List;

interface myInterface {
	void display();
}

public class AssMethodReference {
	public AssMethodReference() {
		System.out.println("Constructor called!!");
	}
	
	public static void print(String s) {
		String string = s.toUpperCase();
		System.out.println("This is month of " + string);
	} 

	public static void mrDisplay() {
		System.out.println("I am display by static method...");
	}

	public void nonStatic_mrDisplay() {
		System.out.println("I am display of non static method...");
	}

	public static void main(String[] args) {
//	List<String> str= Arrays.asList("January" , "February" , "March", "April" , "MAy","June");
//	str.stream().forEach(AssMethodReference :: print);

		AssMethodReference obj = new AssMethodReference();

		myInterface mi = () -> System.out.println("hello Display By lambda...");
		myInterface mi1 = AssMethodReference::mrDisplay;
		
		myInterface mi2 =obj::nonStatic_mrDisplay;
		
		myInterface mi3=AssMethodReference::new;
				
		mi.display();
		mi1.display();
		mi2.display();
		mi3.display();
	}
}
