class Main{
	public static void main(String[] args){
		// finding odd / even	
		int p=13;
		// All the bits other than the right most will become 0, and if the right most is zero too
		// every bit will be zero thus if the final resutl is 0 -> even number
		// and if the final result is 1 -> last bit was 1 too -> odd number
		if ((p&1)==0) System.out.println("Even");
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
