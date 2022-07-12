// Remember this ideology to understand the concept of Dynamic Method Dispatch
class Phone{
	public void greet(){
		System.out.println("Welcome to Phone...");
	}
	public void on(){
		System.out.println("Turning on phone..");	
	}
}

class SmartPhone extends Phone{
	public void swagat(){
		System.out.println("SmartPhone mein apka swagat hai...");
	}
	@Override
	public void on(){
		System.out.println("Turning on SmartPhone..");	
	}
}

class Main{
	public static void main(String[] args){
		/*
			Trick to learn all these shits..
			SUperB -> Super obj = new Sub();
		*/
		// Why is it valid?
		// SmartPhone ke object ko mein phone bol sakta hun ki nahi??.. kyunki SmartPhone bhi toh ek phone hi hai
		// that is, it is derived from the class phone.. thus smart phone cann be called a phone.
		// But you can't call every phone a smartphone.. thus the next one is invalid
		// read it is .. new smartphone can be a phone
		Phone p = new SmartPhone();	// mem allocation via new happens in Runtime
		// and p can be SmartPhone and Phone both.. thus polymorphism..
		// Hence and example of polymorphism.
		// overloading and overriding are also a kind of polymorphism..

		// read it is .. new phone can not be a smartphone for sure
		// SmartPhone s = new Phone(); --> invalid

		// an object of super class can't be stored as an object of sub class
		// OK.. so what's the speciality??
		p.greet(); // --> methods of super class can be used without fear..

		// p.swagat(); --> you can't use those methods from the sub class which are not overriding some other method in super class

		p.on(); // --> since this is overriding a method in super class thus it can be used..
		// on will be used of sub class.
	}
}
