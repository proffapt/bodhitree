import java.util.Scanner;

class Main{
	public static void main(String[] args){
		// String name = new String("proffapt");	
		String name="proffapt";
		// So good right?.. supported in both ways..
    // Looping through array
    // 1
    for (int i = 0; i < name.length(); i++) {
      char c = name.charAt(i); 
      System.out.print(c);
    }
    System.out.println();
    // 2
    for (char c : name.toCharArray()) {
      System.out.print(c);
    }
    System.out.println();
    
		System.out.println(name);
		// strings are immutable.. they can't be changed..
		// Various method of printing in JAVA
		int a=69;
		float b=69.69f;
		System.out.printf("The value of a is %d and that of b is %f", a, b);
		System.out.printf("\nThe value of a is %d and that of b is %f\n", a, b);
		Scanner s=new Scanner(System.in);
		String naam=s.nextLine();
		System.out.printf("\nThe name you entered is %s.\n", naam);
		// Methods for strings in java
		System.out.println("Length of your name is "+naam.length()+".");
		System.out.println("Your name in upper case is "+naam.toUpperCase()+".");
		System.out.println("Your name in lower case is "+naam.toLowerCase()+".");
		String untrimmed="    fuck her    ";
		System.out.println("Untrimmed:"+untrimmed+".");
		System.out.println("Trimming extra spaces in end and beginning:"+untrimmed.trim()+".");
		System.out.println("Getting substring from index 2 till the end of string: "+naam.substring(2));
		System.out.println("Getting substring from index 2 till index 4(5-1): "+naam.substring(2, 5)); // last index is not included while the first one is
		System.out.println("Replacing f by u: "+name.replace('f', 'u')+".");
		System.out.println("Replacing apt by dnf: "+name.replace("apt", "dnf")+".");
		System.out.println("Replacing f by sudo: "+name.replace("f", "sudo")+".");
		// System.out.println("Replacing f by sudo: "+name.replace('f', "sudo")+"."); -- > will give error.. can't do replacing with char and string
		System.out.println("Does it start with pro?: "+name.startsWith("pro")+".");
		System.out.println("Does it start with apt?: "+name.startsWith("apt")+".");
		System.out.println("Does it ends with pro?: "+name.endsWith("pro")+".");
		System.out.println("Does it ends with apt?: "+name.endsWith("apt")+".");
		System.out.println("Char at index 2: "+name.charAt(2)+".");
		System.out.println("First occurance of 'f' from the beginning of string: "+name.indexOf('f')+".");
		System.out.println("First occurance of 'f' within the index 4 and end of string: "+name.indexOf('f', 4)+".");
		System.out.println("First occurance of 'f' from the end of string: "+name.lastIndexOf('f')+".");
		System.out.println("First occurance of 'f' from the beginning of string to index 3: "+name.lastIndexOf('f', 3)+".");
		System.out.println("First occurance of 'apt' from the beginning of string: "+name.indexOf("apt")+".");
		System.out.println("Name is equal to proffapt?: "+naam.equals("proffapt")+".");
		System.out.println("Name is equal to arpit?: "+naam.equals("arpit")+".");
		System.out.println("Name is equal to arpit?: "+naam.equals("arPit")+".");
		System.out.println("Name is equal to arPit.. ignore case?: "+naam.equalsIgnoreCase("arPit")+".");
	}
}
