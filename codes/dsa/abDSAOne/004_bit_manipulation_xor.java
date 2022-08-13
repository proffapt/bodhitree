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
		// finding index of rightmost set bit
		int mask=1, i;
		for(i=0; (res&mask)!=0; i++) mask=1<<i;
		i=0;
		// separating out the arrays
		int p=0, q=0;
		int[] arr11={}, arr12={};
		for(int a: arr1){
			if((a&mask)==0) arr11[p++]=a;
			else if((a&mask)!=0) arr12[q++]=a;
		}
		// separating out the two numbers
		int temp=res;
		for(int a: arr11) res^=a;
		for(int a: arr12) temp^=a;
		System.out.println("The two numbers are: "+res+" and "+temp+".");
	}
}
