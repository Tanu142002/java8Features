package java8Features;

@FunctionalInterface
public interface DisplayInterface {
	String sayHello(String name);

//	void sayBye();

	default void sayGoodMorning() {
		System.out.println("Good Morning from default Method");
	}

	public static void sayStaticGoodMorning() {
		System.out.println("Good Morning from Static method");
	}
	/**
	 * 
	 * 1. Any interface annoted by @functionalInterface is Funtional Interface 
	 * 2. Any interface having only& only one method (abstract method) SAM (Single
	 * Abstract Method)
	 */
}
