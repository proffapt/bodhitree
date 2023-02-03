// Important Properties of XOR
/*
	a^a=0
	0^a=a
*/
class Main{
	public static void main(String[] args){
		// One application was for finding how many bits to change to change a number to other.	

		// TWO:
		/*
			Find the only non-repeating element in an array where every element repeats twice.
		*/
		int[] arr={5, 4, 1, 4, 3, 5, 1};
		for(int i: arr) System.out.print(i+" "); System.out.println();
		int res=0; for(int i: arr) res^=i; // will yield res=3 -> the answer
		System.out.println("The unique number is: "+res);

		// THREE:
		/*
			Find the two non-repeating elements in an array where every element repeats twice.
		*/
		int[] arr1={5, 4, 1, 4, 3, 5, 1, 2};
		for(int i: arr1) System.out.print(i+" "); System.out.println();
		res=0; for(int i: arr1) res^=i; // will yield res=3^2
		/*
			In order to extract those two numbers from the result:
				We will have to separate the array into two parts; based on the logic that..
			They have either 1 or 0 on their first bit of difference from the right.
			that is, find the right most set bit (right most 1 bit) in res.

			What the fuck did just happen?
				3^2 = 11^10 = 01 => rightmost bit where the difference occurs is 0.
				So we will separate the array in two parts which have different 0th bit.
		*/
		// Plan of action
		/*
			1. Finding index of rightmost set bit of res (3^2)
			2. Separating out the arrays
			3. Separating out the two numbers
		*/
		int mask=res&(~(res-1)); // All bits are cleared except the right most set bit.
		int temp=res;
		for(int a: arr1)
			if((a&mask)==0) temp^=a;
		res^=temp;
		System.out.println("The two numbers are: "+res+" and "+temp+".");

		// FOUR:
		/*
		   Find the only non-repeating element in an array where every element is repeating 3 times.
		*/
		int arr2[]={2, 2, 1, 5, 1, 1, 2, 3 ,3 , 3};
		for(int i: arr2) System.out.print(i+" "); System.out.println();
		int[] bit32=new int[32];
		for(int i=0; i<32; i++){
			mask=1<<i;
			for(int a: arr2)
				if((a&mask)!=0) bit32[i]=(bit32[i]+1)%3; // 3 = total occurances, can be generalised by changing value of 3 to k
		}
		// Converting binary to decimal
		int decimal=0;
		for(int i=0; i<32; i++)
			decimal+=(bit32[i]*Math.pow(2, i));
		System.out.println("The unique number is: "+decimal);
	}
}
