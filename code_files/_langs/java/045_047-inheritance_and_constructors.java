// NOTE
/*
	Java doesn't support multiple inheritance
	that is.. two classes can not be base/parent/Super classes.
*/
class Base{
	int a;
	public Base(){
		System.out.println("I am constructor of base.");
		a=69;
	}
	// Overloading the constructor
	// still by default first constructor will be invoked
	public Base(int a){
		System.out.println("I am constructor of base with userdefined value of a.");
		this.a=a;
	}
	public void setA(int a){
		System.out.println("I am in base.");
		this.a=a; // this is a pointer which returns a pointer to the object invoking this function.. it becomes obj.a = local a;
	}
	public void getA(){
		System.out.println(a);
	}
}

// This class will have everything available there in the 
// base class and you can add extra shits in here too.
// but the accessibility of those content from the base class
// are defined by their acess modifiers!
class Derived extends Base{
	int b;
	public Derived(){
		System.out.println("I am constructor of derived.");
		b=96;
	}
	public Derived(int p){
		// this must be used inside the constructor of derived class at the beginning of it only..
		// won't work if in middle or anywhere else
		// used to reference immidiate parent's class object.
		super(p); // This will invoke the argument wala constructor of base class.. if more than two are there then 
		// compiler will decide according to number of arguments give.
		System.out.println("I am overloaded constructor of derived.");
		b=96;
	}
	public void setB(int b){
		System.out.println("I am in derived.");
		this.b=b;
	}
	public void getB(){
		System.out.println(b);
	}
}

class Baccha extends Derived{
	public Baccha(){
		super(123);
		System.out.println("I am constructor of baccha.");
	}
}

class Main{
	public static void main(String[] args){
		Derived d = new Derived();
		// just because of that above line.. constructor of base is called first and then is
		// constructor of derived called..
		d.getA(); d.getB();
		d.setA(6); d.setB(9);
		d.getA(); d.getB();
		d.setB(66);
		d.getA(); d.getB();
		Derived dd = new Derived(555);
		dd.getA(); dd.getB();
		Baccha db=new Baccha();
	}
}
