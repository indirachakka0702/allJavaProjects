package Abstract;
// abstract
// Diamond problem
//Interface

public class entry {

	public static void main(String[] args) {
		// abstract means to show which we need and hide which we don't need
		// 1. class will be declared using keyword abstract
		// 2. abstract can have both method without body and with body
		// 3. Abstract class cannot be instantiated 
		// 4. If child class wants to extend the parent then all abstract unimplemented methods to be implement in child class
		//    else you can make child class as abstract
		// 5. there can be more than one or zero abstract method in abstreact class

		//Animal a = new Animal();
		Dog d = new Dog();
		d.methodWithBody();
		d.methodWithoutBody();
	}

}
