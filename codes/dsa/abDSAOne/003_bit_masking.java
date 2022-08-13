class Main{
	public static void main(String[] args){
		int n=309;
		int i=5; // counting from right.. starting with 0
	 	// finding ith bit in the binary for of the number
		int mask=1<<i;	
		if((n&mask)==0) System.out.println("The "+i+"th bit was: 0");
		else System.out.println("The "+i+"th bit was: 1");
		// All the bits became 0, because of '&' with 0 and the one to be found
		// got '&' with 1 and we can determine easily..
		// if it was 0 > 1&0=0 > whole number 0 > thus it was 0
		// else it will be a non-zero number > thus it was 1

		// Setting ith bit
	}
}
