// Properties of XOR
/*
	a^a=0
	0^b=b
*/
import java.io.*;
class Main{
	public static void main(String[] args){
		// One application was for finding how many bits to change to change a number to other.	

		// TWO:
		/*
			Find the only non-repeating element in an array where every element repeats twice.
		*/
		int[] arr={5, 4, 1, 4, 3, 5, 1};
		int res=0;
		/*
		for(int i=0; i<arr.length; i++){
			res=res^arr[i];
		}
		*/
		// Doing it the java way
		for(int i: arr) res^=i; // will yield res=3 -> the answer
		System.out.println("The unique number is: "+res);

		// THREE:
		/*
			Find the two non-repeating elements in an array where every element repeats twice.
		*/
		int[] arr1={5, 4, 1, 4, 3, 5, 1, 2};
		res=0;
		for(int i: arr1) res^=i; // will yield res=3^2
		// now have to separate the array into two parts; based on the logic that..
		// they have 1 or 0 on their first bit of difference from the right.
		// that is, find the right most set bit(right most 1 bit) in res.
		// finding index of rightmost set bit
		// int mask=1, i;
		// for(i=0; i<=Math.log10(res); i++){
		// 	mask=1<<i;
		// 	if((res&mask)!=0) break;
		// }
		int mask=res&(~(res-1));
		// separating out the arrays
		// AND
		// separating out the two numbers
		int temp=res;
		for(int a: arr1){
			if((a&mask)==0) res^=a;
			else temp^=a;
		}
		System.out.println("The two numbers are: "+res+" and "+temp+".");

		// FOUR:
		/*
		   Find the only non-repeating element in an array where every element is repeating 3 times.
		*/
	}
}
