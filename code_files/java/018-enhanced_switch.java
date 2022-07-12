class Main{
	public static void main(String[] args){
		// classic C-style switch statement is supported too, but this is gawd mode of switch case.
		// the enhanced switch
		byte age=24;	
		switch(age){
			case 8 -> System.out.println("Enjoy your life kid");
			case 16 -> System.out.println("Study well");
			case 24 -> {
				System.out.println("Get married soon");
				System.out.println("Get a Job too");
			}
			default -> System.out.println("keep enjoying");
		}
	}
}
