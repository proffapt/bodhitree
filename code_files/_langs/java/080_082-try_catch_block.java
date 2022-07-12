// Still there are two types of exceptions in java
/*
	1. Checked exceptions:
		These are checked by the compiler during the compile time.. and won't be allowed to compile the code.
	2. Unchecked exceptions - Runtime errors:
		These are not checked by the compiler.. programmer has to handle them.
*/

// Common examples of exceptions
/*
	1. Null Pointer exception -- pointer thingy
	2. Arithmetic exception
	3. Array Index out of bout exception
	4. Illegal argument - dena tha string de diye object as argument
	5. Number format exception - taking input as string then converting it to number.. what if user gave "and" as input
*/

class Main{
	public static void main(String[] args){
		int a=6000;		
		int b=0;
		// Without try:
		/*
		int c=a/b;
		System.out.println("The result is "+c+".");
		*/
		// With try
		try{
			int c=a/b;
			System.out.println("The result is "+c+".");
		}
		catch (Exception e){
			System.out.println("Failed to carry out the division.");
			System.out.println("REASON: "+e);
		}
		System.out.println("END OF DIVISION !!");

		// Specific exception handling:
		byte marks[] = new byte[3];	
		marks[0]=69;
		marks[1]=100;
		marks[2]=89;
		java.util.Scanner in = new java.util.Scanner(System.in);
		// here comes the error handling part:
		try{
			System.out.print("Enter the index: ");
			byte index = in.nextByte();
			System.out.print("Enter the number you want to divide with: ");
			int number = in.nextInt();
			int result = marks[index]/number;
			System.out.println("The result is "+result+".");
		}
		catch (ArithmeticException e){
			System.out.println(e);
			System.out.println("ERROR: Maths nahi aati");	
		}
		catch (ArrayIndexOutOfBoundsException e){
			System.out.println(e);
			System.out.println("ERROR: Andha hai lawda");	
		}
		catch (Exception e){
			// trigger by giving very high value of index exceeding the range of byte.
			System.out.println(e);
			System.out.println("ERROR: aukaad mein raho bey");	
		}

		// Nested try-catch block
		try{
			System.out.print("Enter the value of index: ");
			int input = in.nextInt();
			try {
				System.out.println(marks[input]);
			}
			catch (ArrayIndexOutOfBoundsException e){
				System.out.println("Sorry this index is not in the bounds of this array");		
				System.out.println("Exception in level 2");		
			}
		}
		catch (Exception e){
			System.out.println("Exception in level 1");	
		}
	}
}
