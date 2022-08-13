class Main{
	public static void main(String[] args){
		int n=309;
		int i=5; // counting from right.. starting with 0
	 	// finding ith bit in the binary for of the number
		int mask=1<<i;	
		if((n&mask)==0) System.out.println("The "+i+"th bit was: 0");
		else System.out.println("The "+i+"th bit was: 1");
	}
}
