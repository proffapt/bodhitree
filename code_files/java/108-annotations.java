// Annotations
/*
	Provides metadata to class / method.
	Also provides extra data to program.
*/
// Various annotations
/*
	@Override 
		I have already used it.. used to mark a method which is overriding method from the parent class.
		Also helps me to keep track.. if it is really overriding or is it just me gone mad?

	@SuppressWarnings( "<warning name here>" )
		Use to supress warnings given by the compiler
		@SupressWarnings( "deprecation" ) --> To supress deprecation warnings.

	@Deprecated
		To mark a deprecated method..

	@FunctionalInterface
		Used to ensure that an interface is a functional interface.
		FUNCTIONAL INTERFACE is an interface containing only one abstract method, and that's it.
*/

@FunctionalInterface
interface myFunctionalInterface{
	void myMethod();	
	// void fuckyou();
}

class MyClass{
	void method1(){
		System.out.println("I am method 1");
	}
	@Deprecated
	void method2(){
		System.out.println("I am method 2");
	}
}
class Main{
	// SuppressWarnings is used for a method..
	@SuppressWarnings("deprecation")
	// will suppress all deprecation warnings in this method
	public static void main(String[] args){
		MyClass obj = new MyClass();	
		obj.method1();
		obj.method2();
	}
}
