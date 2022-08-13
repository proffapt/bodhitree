class Main{
	public static void main(String[] args){
		// finding odd / even	
		// int n=13;
		// if (n&1==0) System.out.println("Even");
		// else System.out.println("Odd");

		// swapping two numbers
		int a=5, b=7;
		System.out.println("Before swapping");
		System.out.println("a="+a+" and b="+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swapping");
		System.out.println("a="+a+" and b="+b);
	}
}
