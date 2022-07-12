class Main{
	static int adivide(int a, int b){
		return a/b;
	}
	// tell the caller that surround the call to this method in try catch block and expect ArithmeticException.
	static int bdivide(int a, int b) throws ArithmeticException{
		return a/b;
	}
	// warn the caller that this method might throw an error
	static int cdivide(int a, int b) throws ArithmeticException{
		if (b==0){
			// throwing explicit exception
			throw new ArithmeticException("0 se divide nahi hota satvi fail :tableflip ");
			// adding the above line will force the compiler to not to run until you handle this possible exception..
			// return 0; -- > unreachable.. bcoz the program will stop exactly at throw calling line.
		}
		return a/b;
	}
	public static void main(String[] args){
		// int x = adivide(6, 0); // writer of method and caller of method are guilty of this exception.
		// int y = bdivide(6, 0); // only caller of this method is guilty.. since the writer said explicitly that it might give ArithmeticException 
		// 					   // thus the caller must have handled this in try-catch block!
		int z = cdivide(6, 0);
	}
}
