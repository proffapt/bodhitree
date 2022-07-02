interface DemoInterface{
	void meth1();
	void meth2();
}

class TestClass{
	void hehe(){
		System.out.println("hehe");
	}
}

@FunctionalInterface
interface DemoFunctionalInterface{
	void meth1(int a);
}

class Main{
	public static void main(String[] args){
		// ANONYMOUS CLASSES
		/*
		Didn't want to create a whole new class just to create one object use and forget it?
		Anonymous classes are here at your service!
		Ye class hai bhi aur nahi bhi.. since it is declared while instantiating the object.. so yeah one time thingy and exists no where else
		Can be used to extend a class or implement an interface..
		they are local classes and 
				**** Have no name.. and are not included in your package.. thus anonymous!
		*/
		DemoInterface anonObj = new DemoInterface(){
			@Override
			public void meth1(){
				System.out.println("I am method 1");
			}
			@Override
			public void meth2(){
				System.out.println("I am method 2");
			}
		};
		anonObj.meth1();
		TestClass anonObject = new TestClass(){
			void haha(){
				System.out.println("haha");
			}
		};
		anonObject.hehe();
		// anonObject.haha(); --> will give error.. because this is dynamic method dispatch.. you are using thus can't use any other thing than in super class
							   // if and only if it is overriden in the subclass.

		// LAMBDA EXPRESSIONS
		/*
			Can only be used with FUNCTIONAL INTERFACES
	   	*/ 
		DemoFunctionalInterface lambdaObj = (i)->{
			System.out.println("I am method 1 "+ i);
		};
		lambdaObj.meth1(6);
	}
}
