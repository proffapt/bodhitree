class MyException extends Exception{
	@Override
	public String toString(){
		return "I am string";
	}
	@Override
	public String getMessage(){
		return "I am mesage";
	}
	// to fix the warning 
	private static final long serialVersionUID = 494949499;
}

class Main{
	public static void main(String[] args){
		// always surround the thrwon exception within try-catch block.
		try{
			// agar try-catch block mein surround nahi karta toh mera code yahin ruk jata.. as the sace is with other exceptions..
			throw new MyException(); // throw an exception via creating an object for you desired exception class.
		}
		catch(MyException e){
			e.printStackTrace(); // tells you about the Stack's status.. which class.. which function.. which line got the erraneous code.	
			System.out.println(e.toString()); // Is similar to printing e only.. by default method
			System.out.println(e);
			System.out.println(e.getMessage());
		}

		try {
			throw new ArithmeticException("custom message");
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}
}
