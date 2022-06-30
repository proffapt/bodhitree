// import java.util.Scanner; // >> can only utilise Scanner class inside java.util
// import java.util.* ; // >> can utilise everything inside java.util

class Main{
	public static void main(String[] args){
		// Scanner scan = new Scanner(System.in); // --> will work with the imports being mentioned
		java.util.Scanner scan = new java.util.Scanner(System.in);
		byte in = scan.nextByte();
		System.out.println("This is the given input: "+in);
		// Configuring custom packages
		/*
			1) add this line in top
			package YourPackageName;
			2) do it with everyfile present for your project/company
			then compile them using javac -d . file.java
				<this dot signifies the location of those packages in your system>
				<javac -d ~/Desktop/JavaProjects file.java> --> will do like ~/Desktop/JavaProjects/YourPackageName/file.class
				<javac -d . *.java> --> everything in the current folder compiled to their corresponding packages
			=> Creating subfolders inside of packages
			"package YourPackageName.YourSubFolderName"
			==> Using the packages
			1) import YourPackageName.file;
			2) in the main method create an object for the class named file.. and use it's methods without any problem.
		*/
	}
}
