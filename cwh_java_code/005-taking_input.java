import java.util.Scanner;

class Main{
	public static void main(String[] args){
		System.out.println("Taking input from the user");	
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter you number: ");
		byte num=scan.nextByte();
		System.out.print("You entered: ");
		System.out.println(num);
		// boolean isByte=scan.hasNextByte();
		// System.out.println(isByte);
		System.out.println("Taking input from the user as a word and string");	

		// will give full line
		// String line=scan.nextLine();
		// System.out.println(line);	

		// will take anything before first white-spaced char is entered
		String word=scan.next();
		System.out.println(word);	
		String name=scan.next();
		// This is how you concativate stuff
		System.out.println("Hello "+name+" have a good day!");
	}
}
