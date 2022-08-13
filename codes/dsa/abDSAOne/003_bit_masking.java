import java.util.Scanner;
class Main{
	public static void main(String[] args){
		int n=309, mask, i; // counting from right.. starting with 0
	 	// finding ith bit in the binary form of the number
		i=5;
		mask=1<<i;	
		if((n&mask)==0) System.out.println("The "+i+"th bit was: 0");
		else System.out.println("The "+i+"th bit was: 1");
		// All the bits became 0, because of '&' with 0 and the one to be found
		// got '&' with 1 and we can determine easily..
		// if it was 0 > 1&0=0 > whole number 0 > thus it was 0
		// else it will be a non-zero number > thus it was 1

		// Setting and clearning ith bit
		/*
		   Setting a bit => changing value to 1.
		   Clearing a bit => changing value to 0.
		*/
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the to be changed position: ");
		i=s.nextInt();
		{	// outputting the bit at ith position
			System.out.println("Before changing..");
			mask=1<<i;	
			if((n&mask)==0) System.out.println("The "+i+"th bit was: 0");
			else System.out.println("The "+i+"th bit was: 1");
		}
		System.out.print("Enter the value to be changed to: ");
		int changeTo=s.nextInt(), newN=-1;
		if(changeTo==1){
			mask=1<<i;
			newN=n|mask;
		}
		else if(changeTo==0){
			mask=~(1<<i); // visible logic
			newN=n&mask;
		}
		else System.out.println("ERROR: Invalid change expected!");
		{	// outputting the bit at ith position
			System.out.println("After changing..");
			mask=1<<i;	
			if((newN&mask)==0) System.out.println("The "+i+"th bit was: 0");
			else System.out.println("The "+i+"th bit was: 1");
		}

		// Finding number of bits we need to change to convert from a to b:
		int a=22, b=27;
		// 1) How many different bits? > XOR
		int temp=a^b;
		// 2) How many set bits in temp?
		int setBitsCounter=0;
		while((temp&(temp-1))!=0) {
			setBitsCounter++;
			temp=temp&(temp-1);
		}
		if(a!=b)setBitsCounter++;
		// has a time complexity of only the number of bits needed to be changed.. most optimal solution!
		System.out.println("You need to change "+setBitsCounter+" bits for the conversion to take place.");
	}
}
