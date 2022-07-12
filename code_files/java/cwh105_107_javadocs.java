// Java Documnetation generation
/*
	- Java provides a utility named "javadoc" to create the Documnetation deriving it's base from 
	original java documentation.
	- To beautify the docs and make them more expressive.. we have tags.. for classes and methods..
	- Must have a public class to be documented
	
	..... The command being used here is .....
	javadoc -protected -splitindex -use -author -version -d ./105_106-javadocs cwh105_106_javadocs.java
*/
// The following javadoc comment shall not be before package.. it must be after it and before the class or method which you wanna describe.

/** This is my first documented class \o/
  * <b>html tags testing</b><i> successful it was</i>
  * @author Arpit (proffapt) Bhardwaj
  * @version 1.0
  * @since 2022
  * @see <a href="https://www.youtube.com/watch?v=p7YXXieghto" target="_blank">Java Docs</a>
  */
public class cwh105_107_javadocs{

	/** Calculates the sum of two given numbers and prints them with a nice statement
	  * @param a must be an integer
	  * @param b must be an integer
	  * @throws Exception when first number is 0 it throws an exception
	  * @return always returns 1
	  * @deprecated this method has been deprecated please use the "+" operator
	  */
	public int add(int a, int b) throws Exception{
		if (a==0) throw new Exception();
		System.out.println("The sum is: "+(a+b));
		return 1;
	}

	/** main method controlling the flow of the program 
	  * @param args These are argument specified to the class via the command line
	  */
	public static void main(String[] args){
		System.out.println("This is my main method");	
	}

}
