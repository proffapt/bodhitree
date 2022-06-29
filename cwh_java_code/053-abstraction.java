// Ek abstract method poori class ko abstract banane ki kaabiliyat rakhta hai!!j
/*
	Even if there is one abstract method or many doesn't matter.. the class containing
	it / them shall be declared as abstract class.
	
	-->> An abstract class is a class of which you can't create an object.
	What are they then?
	They are destined to create other classes from them.
	Like to keep track ki har inheritance par kya kya define karna hai.. warna woh class
	object hi nahi bana payegi.. :shrug
	But you can reference using the abstract class.. by dynamic method dispatch
*/
abstract class Base{
	public Base(){ System.out.println("Main Base class ka constructor hoon!"); }
	public void heloo(){ System.out.println("Hello there!"); }
	abstract public void greet(); // >> ek abstract method agya.. ab iss class ko abstract banana padega
}

/*
	You can only define the abstruct method of an abstract class
	inside it's derived classes only!
*/
class Derived1 extends Base{
	@Override
	public void greet(){ System.out.println("Konichiwa!"); }
}

class Derived2 extends Base{
	@Override
	public void greet(){ System.out.println("Namaste!"); }
}

// Need for abstraction
/*
	When you do abstraction you are forced to override the abstracted method 
	being derived from an abstracted class!
	--> else you have to declare the derived class as abstract too
*/
abstract class Derived3 extends Base{
	// @Override
	// public void greet(){ System.out.println("Nihao!"); }
	public void method(){ System.out.println("Mein ek method hoon."); }
}

class Main{
	public static void main(String[] args){
		Derived1 a = new Derived1();	
		// Derived3 b = new Derived3();	--> abstract class can not be instantiated
	}
}
