class Main{
	// Why static?
	// You can call directly those methods.. even without creating an object
	// which are static.. otherwise you will need to create object of the class first.. then use that function
	static int logic(int x, int y){
		if(x>y) return x;
		else return y;
	}

	static int logic(int x, int y, int z){
		if (x>y){
			if (x>z) return x;
			else return z;
		}
		else{
			if(y>z) return y;
			else return z;
		}
	}

	int max(int x, int y){
		if(x>y) return x;
		else return y;
	}
	
	public static void main(String[] args){
		// Methods in JAVA
		/*
			They are just functions called by other name.
			Specifically used for code segregation.
			Useful in using that bit of code multiple number of times.. well you know.
			here logic(int, int) is a method/function

			Why different name?
			- Because classic functions can be inside and outside of class.. but in java nothing exists without class
			thus such a function residing in a class is called method.
		*/
		int maximum=logic(69, 39); // using without creating object.. utilising static keyword
		// If you didn't use static.. then you have to create an object for the class containing the method first..
		// then call the method using the object.
		Main obj=new Main(); // object creation
		int maxi=obj.max(99, 66);
		System.out.println(maximum);
		System.out.println(maxi);

		// This is a demo of Method overloading
		int hehe=logic(69, 39, 59);
		System.out.println(hehe);
		// Method overloading can not be performed by changing the return type.. only number of parameter change can cause 
		// function overloading
	}
}
