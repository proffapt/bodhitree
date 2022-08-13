import java.util.Scanner;
class Main{
	public static void main(String[] args){
		int n=309, mask, i; // counting from right.. starting with 0
	 	// finding ith bit in the binary for of the number
		i=5;
		mask=1<<i;	
		if((n&mask)==0) System.out.println("The "+i+"th bit was: 0");
		else System.out.println("The "+i+"th bit was: 1");
		// All the bits became 0, because of '&' with 0 and the one to be found
		// got '&' with 1 and we can determine easily..
		// if it was 0 > 1&0=0 > whole number 0 > thus it was 0
		// else it will be a non-zero number > thus it was 1

		// Setting ith bit
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the to be changed position: ");
		i=s.nextInt();
		System.out.println("Enter the value to be changed to: ");
		int change_to=s.nextInt(), new_n;
		{	// outputting the bit at ith position
			System.out.println("Before changing..");
			mask=1<<i;	
			if((n&mask)==0) System.out.println("The "+i+"th bit was: 0");
			else System.out.println("The "+i+"th bit was: 1");
		}
		if(change_to==1){
			mask=1<<i;
			new_n=n|mask;
		}
		else if(change_to==0){
			mask=~(1<<i);
			new_n=n&mask;
		}
		else System.out.println("ERROR: Invalid change expected!");
		{	// outputting the bit at ith position
			System.out.println("After changing..");
			mask=1<<i;	
			if((n&mask)==0) System.out.println("The "+i+"th bit was: 0");
			else System.out.println("The "+i+"th bit was: 1");
		}
	}
}
