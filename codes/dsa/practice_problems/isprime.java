import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: "); int n = in.nextInt();
		if (n<=1) {
			System.out.println("Neither prime nor composite");
			System.exit(0);
		}
		// This particular method of i*i is so damn good
		/**
		  Basically the optimised condition was i<= sqrt(n) 
		  but using this i*i I can use this logic without using math library!
		**/
		for(int i=2; i*i<=n; i++){
			if (n%i == 0) {
				System.out.println("Not a prime!");
				System.exit(0);
			}
		}
		System.out.println("Is a prime!");
	}
}
