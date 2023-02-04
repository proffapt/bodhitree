class Main{
	public static void main(String[] args){
		System.out.println(GCD(24, 60));
	}
	// Question 1
	static void trailingZeroesInFactorial(int n){
		int zeroes = 0;
		for (int i = 5; i<=n; i*=5)
			zeroes+=n/i;
		// Why this for loop?
		/* 
			Simple part toh dekh hi lega but, 5 ki powers mein more than 1 `5` ayenge.. usko handle karne ke liye : n/5 + n/25 + n/125 ...
		*/
		System.out.println("Number of zeros in "+n+"! = "+zeroes);
	}
	// Question 2
	static void isPalindrome(int n){
		// Reverse the number
		int reversed=0, temp=n;
		while (temp>0){
			reversed=reversed*10 + temp%10;
			temp = temp/10;
		}
		// Then compare both
		if (n==reversed) System.out.println(n+" is a palindrome.");
		else System.out.println(n+" is not a palindrome.");
	}
	static void isPrime(int n){
		boolean yes=true;
		for (int i=2; i*i<=n; i++){ // i <= sqrt(n)
			if (n%i == 0) {
				yes=false;
				break;
			}
		}
		if(yes) System.out.println(n+" is Prime");
		else System.out.println(n+" is not Prime");
	}
	// Question 3 - how many primes from 1 to n?
	static void sieveOfEratoSthenes(int n){
		boolean[] isNotPrime = new boolean[n+1];
		isNotPrime[0]=true; isNotPrime[1]=true; // 0 & 1 are not prime
		for(int i=2; i*i<=n; i++){
			for(int j=i*2; j<=n; j+=i){
				isNotPrime[j]=true;
			}
		}
		for(int i=0; i<=n; i++){
			if (!isNotPrime[i]) System.out.print(i+" ");
		}
	}
	// Question 4 - Best way to find GCD of two numbers
	static int GCD(int a, int b){ // Euclidean Algorithm
		// Theorem: GCD(a, b) = GCD(b, a%b)
		/*
			We will exploit this very theorem, and repeat it recursively until one of the value
			reaches to 0, then the other remaining value will be the required GCD of initial numbers.
		*/
		if (a>b) {
			a=a^b;
			b=a^b;
			a=a^b;
		}
		// a < b Always! Why?
		/*
			Because you are going to do b%a, hence a has to be less than b.
			Otherwise, it will just keep on running indefinetly with same arguments.
		*/
		if (a==0) return b; // Hence, b is never going to be zero first
		return GCD(b%a, a);
		/* Better approach, but hard to understand
			if (b==0) return a; 
			return GCD(b, a%b);
		*/
	}
}
