package java8Features;

import java.util.Optional;

public class optionalClass {
	public static void main(String[] args) {
//		optionalClass obj1=null;
		optionalClass obj1 =new optionalClass();
	
		Optional<optionalClass> obj=Optional.ofNullable(obj1);
		if(obj.isPresent()) {
			obj1.display();
		}
		else {
			System.out.println("Obj is null");
		}
		
	}

	public void display() {
		System.out.println("From display method");
	}
}
