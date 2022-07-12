// The table to excel access modifiers
/*
	***********		Class	Package		SubClass	Other
	Public			  Y		  Y				Y		  Y
	Protected		  Y		  Y				Y		  N
	No Modifier		  Y		  Y             N		  N
	Private			  Y		  N             N         N

	********* ABOUT THE TABLE **********
	1) PPNP -> Public, Protected, No modifier and Private.
	2) CPSO -> Class, Package, SubClass and Other.
	3) About those locations:
		- Class:
			Same class in which you have defined all these properties and methods.
			You can access content with any kind of access modifier.
		- Package:
			If you are in a different class from where these things are defined... but the 
			package is same.. can be in other file too but the package must be same
			.. again same file ki baat nahi hai.. same package ki baat hai! 
			then you can't access things with private access modifier.
		- SubClass:
			If the class is diff + The package is not same either => *the file is different for sure.. 
			but you imported it and inherited a new class using it.. then this case is called SubClass.
		- Other:
			Diff class + diff package + no subclass.
			That is.. tum doosri file mein ho.. toh obviously same class ho nahi sakta.. package bhi alag hai
			aur tune koi class inherit karke nahi banyayi.. seedhe uss original class ko import kiya and
			instantiate kardiya..

		---> Check in chronological order.
*/

class C1{
	public int b = 2;
	protected int c = 3;
	// The following is known as default modifier/no-modifier.
	int a = 1;
	private int d = 4;
}

class Main{
	public static void main(String[] args){
	}
}
