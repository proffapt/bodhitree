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
		/*
			Find the two non-repeating elements in an array where every element repeats twice.
		*/
		int[] arr1={5, 4, 1, 4, 3, 5, 1, 2};
		res=0;
		for(int i: arr1) res^=i; // will yield res=3^2
		// now have to separate the array into two parts; based on the logic that..
		// they have 1 or 0 on their first bit of difference from the right.
		// that is, find the right most set bit(right most 1 bit) in res.
		int mask=1, i;
		for(i=0; (res&mask)!=0; i++) mask=1<<i;
		System.out.println(i);
	}
}
