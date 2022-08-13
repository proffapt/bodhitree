// Some theory on bit and decimal conversion
/*
	- During bit to decimal conversion
		Number of decimal digits = log10(n)+1
	- During decimal to bit conversion
		Number of bits = log2(n)+1
*/
class Main{
	public static void main(String[] args){
		// finding odd / even	
		int p=13;
		// All the bits other than the right most will become 0, and if the right most is zero too
		// every bit will be zero thus if the final resutl is 0 -> even number
		// and if the final result is 1 -> last bit was 1 too -> odd number
		if ((p&1)==0) System.out.println("Even");
		// here I had to use (p&1) because the priority of '&' is less than '=='; so 1==0 will be evaluated first 
		// and will result in 0 then it will be like p&false which will result in ERROR: Bad operand types for binary operator.
		else System.out.println("Odd");
		int q=12;
		if ((q&1)==0) System.out.println("Even");
		else System.out.println("Odd");

		// swapping two numbers
		int a=5, b=7;
		System.out.println("Before swapping");
		System.out.println("a="+a+" and b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		// If you don't get it then do a dry run you wil get the logic
		System.out.println("After swapping");
		System.out.println("a="+a+" and b="+b);
	}
}
