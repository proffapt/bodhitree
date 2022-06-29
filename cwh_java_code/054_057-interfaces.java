/*
	Abstract classes can have concrete methods.. but have atleast one abstract method
	Interfaces have only and only abstract methods.. nothing should be defined in them.
	
	Can't create objects of interfaces.. but can reference some object with it.
	Interface obj = new ConcreateClass();
*/

interface PedalAndBreaks{
	int a=45; // completely allowed
	// is equivalent to..
	// final int a=45;
	void applyBreak(int decrement);
	// public by default..
	// equivalent to..
	// public void applyBreak(int decrement);
	void speedUp(int increment);
	// void speedUp(int increament){  System.out.println("Fuck you");}; --> ERROR
	/*
		Inside interface you don't need to use abstract keyword!
		coz the method inside them have to be abstract by definition.
	*/
}

interface Horn{
	void peepee();
	void boink();
	// void fuckyou(); --> will break the classes using this interface ahead in the code.
	default void fuckyou(){
		System.out.println("Fuck youuuu.. tururururu.. fuck youuuuuuuu");
	}
	// DEFAULT METHOD..
	/*
		If you wanna modify your interface then
		use default keyword.. add this before the method
		and declare the method right here.. so that you don't have to change everywhere!
		
		And yeah obviously you can over ride it too.
	*/
}

// when you use an interface you use "implements" not "extends"
class AvonCycle implements PedalAndBreaks{
	int speed=69;
	// must use public keyword
	public void applyBreak(int decrement){
		speed-=decrement;
	}
	public void speedUp(int increment){
		speed+=increment;
	}
}

class Bicycle{
	public void frame(){
		System.out.println("This is your frame..");
	}
	public void wheel(){
		System.out.println("This is your wheel..");
	}
}

class HeroCycle extends Bicycle implements PedalAndBreaks, Horn{ // multiple inheritance was done with interfaces
	// see that "Bicycle implements PedalAndBreaks, Horn".. combining last two into the first one.. calling it as herocycle.. 
	// then adding extra feature like it's logo.. is what completes the cycle
	int speed=40;
	public void applyBreak(int decrement){
		speed-=decrement;
	}
	public void speedUp(int increment){
		speed+=increment;
	}
	public void peepee(){ System.out.println("pee pee"); }
	public void boink(){ System.out.println("boink boink"); }
	public void logo(){ System.out.println("Hero Cycels"); }
}

class Main{
	public static void main(String[] args){
		/*
			why does it even exist??

			-> You can't use multiple abstract classes to inherit a class with...
			but you can do the same with interfaces!!
		*/
		AvonCycle myCycle = new AvonCycle();
		HeroCycle myHeroCycle = new HeroCycle();
		myHeroCycle.fuckyou();
		// can create properties of inside the interface.
		System.out.println(myCycle.a);
		// myCycle.a = 555; --> can't modify that property of the interface tho.
	}
}
