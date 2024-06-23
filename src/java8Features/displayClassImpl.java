package java8Features;

public class displayClassImpl implements DisplayInterface {
	public static void main(String[] args) {
		System.out.println("Test class created for functional interface");

		new displayClassImpl().sayHello("Tanu");
//		new displayClassImpl().sayBye();

		new displayClassImpl().sayGoodMorning();

		DisplayInterface.sayStaticGoodMorning();

	}

	

//@Override
//public void sayBye() {
//	System.out.println("Bye!! from class");
//	
//}

	public void simpleMethod() {
		System.out.println("Simple Method");
	}



@Override
public String sayHello(String name) {
	String nString= name + " , how r u";
	return nString;
}
}
