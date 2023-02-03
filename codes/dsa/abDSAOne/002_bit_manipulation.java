// Bit-wise operators
/*
	- Work directly on bits.
	- Computationally fastest.
*/
// Some theory on bit and decimal conversion
/*
	~ Binary to Decimal
	101 = 1*2^2 + 0*2^1 + 1 *2^0
			= 5
	> `2` being used here is the base of Binary System as `10` is of Decimal system (101 = 1*10^2 + 0*10^1 + 1*10^0)	

	~ Decimal to Binary
	> 1 for odd, 0 for even (Trick to Memorize : 1 toh odd hota hi hai XD)
		[ Right to left : Reverse order ]
						13 > Odd := 1
						13/2 = 6 > Even := 0
						6/2 = 3 > Odd := 1
						3/2 = 1 > Odd := 1
	> Stop at 1
	13 in binary is 1101 (What you recieved was in reverse order)

	# Addition in Binary
	1 + 1 = 10 (0 likho 1 gaya carry over)
	1 + 1 + 1 = 10 + 1 = 11
		2 in binary 10
		3 in binary 11 
	This is the max you will need
							 101 
							+111
							-----
							1100
							-----
	# Substraction in Binary
	1100-101 = 1100+(-101)

	Negative of a number in binary is 2's complement
		- Invert all bits (remember the number is 32 bits or 64 bits long)
		- Add one
				(-101) = 010+1=011
		But here's a catch
			In reality the numbers aren't just of size of 2 or 3 bits they are either 32-bit or 64-bit depending on the processor.
			Hence, 101 = 000..00101
			2's complement will be:
				111..11010 + 1 = 11..11011

	Now our question becomes
							000..001100
						 +111..111011
							-----------
							000..000111
							-----------

	NOTE:
	Let the number of interest be `n`
			Number of decimal digits = log10(n)+1
			Number of bits = log2(n)+1
*/
// XOR
/*
	Jab dono alag honge tab ye 1 hoga
		Basically, it tells if both are different or not
	0^0 = 0
	1^0 = 1
	0^1 = 1
	1^1 = 0
*/
// Inverse Operator(~)
/*
	 ~5 = ~(..00101) = ..11010

	 This means 2's complement of a = ~a +1
*/
// Right and Left shift operators
/*
	 12>>2 = ..001100 >> 2 = ..000011 = 3 = 12 / 2^2
	 12<<2 = ..001100 << 2 = ..0110000 = 48 = 12 * 2^2

	b >> a = b / 2^a
	b << a = b * 2^a
*/
class Main{
	public static void main(String[] args){
		// finding odd / even	
		/*
			Even numbers will always have the last bit set to zero
			And, odd number will have their last bit set to one.
			Why?
			 Last bit is of 0 power -> 2^1 = 1 > Odd, adding it will make the whole number odd!

			Trick: 0 - even, 1 - odd [ Last bit ]
		*/
		int p=13;
		// 13&1 == bit(13)&(..01)
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
		a=a^b; // = 2
		b=a^b; // = 5
		a=a^b; // = 7
		// If you don't get it then do a dry run you will get the logic
		System.out.println("After swapping");
		System.out.println("a="+a+" and b="+b);
	}
}
