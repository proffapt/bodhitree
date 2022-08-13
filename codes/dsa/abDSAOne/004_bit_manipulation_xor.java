// Properties of XOR
/*
	a^a=0
	0^b=b
*/
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
		for(int i: arr) res^=i;
		System.out.println("The unique number is: "+res);
		/*
			Find the two non-repeating elements in an array where every element repeats twice.
		*/
	}
}
