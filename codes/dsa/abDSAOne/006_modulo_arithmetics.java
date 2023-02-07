// Properties of Modulo
/*
	(a + b) % n = (a % n + b % n) % n
	(a - b) % n = (a % n - b % n) % n
	(a * b) % n = (a % n * b % n) % n

	-> Exponent
		(a ^ b) % n = ((a % n) ^ b) % n

	-> Modulo of Negative numbers
		((-a) % b) = b - (a % b)
*/
class Main{
	public static void main(String[] args){
		System.out.println(moduloFastPower(3978432, 5, 1000000007));
	}
	static long moduloFastPower(int a, int b, int n){
		long res = 1;
		while (b>0) {
			if ((b&1)!=0) {
				res = (res*a)%n; // res = (res % n * a % n) % n
			} 
			a = (a*a)%n; // a = (a % n * a % n) % n
			// Now I realised why the arithmetic is like this
			/*
				It will not let any value overflow the barrier, neither as individuals nor as a whole
				Because after a few iterations individuals are being updated with the values of whole.
			*/
			b >>= 1;
		}
		return res;
	}
}
