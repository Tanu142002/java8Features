package java8Features;

import java.util.Arrays;
import java.util.List;

interface DisplayInterfaceTest1 {
	void display();
}

public class MethodReferenceTest {

	public MethodReferenceTest() {
		System.out.println("hello from constructor");
	}

	public static void mrtest() {
		System.out.println("hello there from MethodReference class static method");
	}

	public void mrtest_nonStatic() {
		System.out.println("hello there from MethodReference class static method");
	}

	public static void main(String[] args) {
		List<String> weekdays = Arrays.asList("Monday", "Tuesday", "Wdnsday", "Thursday", "Friday", "Saturday",
				"Sunday", "Sunday");

		weekdays.stream().forEach(System.out::println);

		MethodReferenceTest obj = new MethodReferenceTest();

//		obj.display();
		DisplayInterfaceTest1 di = () -> System.out.println("hello there");
		DisplayInterfaceTest1 di1 = MethodReferenceTest::mrtest;
		DisplayInterfaceTest1 di2 = obj::mrtest_nonStatic;
		DisplayInterfaceTest1 di3 = MethodReferenceTest::new;
		di.display();
		di1.display();
		di2.display();
		di3.display();

		/**
		 * Method reference 3 types 1. Static MR 2. Instance MR 3. Constructor MR
		 */
	}

}
