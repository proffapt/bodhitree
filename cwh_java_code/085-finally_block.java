// Finally Block.. what is it?
/*
	It contains the code which is always executed irrespective of the exception
	being handled or not!
	--> You can not use finally without try block..

	NEED FOR FINALLY BLOCK?
	It is used to free system resources like closing a connection.. freeing a pointer.. closing a file etc.
	if some exception occured which was not handled.. thus to safely close the program we need it.. 
*/

class Main{
	static int divide(int a, int b){
		try{
			return a/b;	
		}
		catch (Exception e){
			e.printStackTrace();	
		}
		finally{
			// why is this significant here?
			// It will still run even afte the call of return.. the func won't end.. it will execute this finally block..
			System.out.println("Freeing up resources..");
		}
		// won't be called don't worry..
		return 0;
	}

	public static void main(String[] args){
		int a = divide(7, 0);	
		System.out.println(divide(7, 4));
		System.out.println(".....................");
		for(int i=5; i>-5; i--){
			if(i==0){
				try {
					int c = 10/i;
				}
				catch (Exception e){
					continue;
				}
				// if finally wasn't here.. this part wouldn't have called ever.. but it is so it will be called even after continue..
				finally {
					System.out.println("No baby.. you can't divide by 0");
				}
			}
			else System.out.println(10/i);
		}
		try { int x=6, y=0, d = x/y; } // error toh abhi bhi ayega kyunki handle nahi kiya catch block se
		finally { System.out.println("Chutiya 0 se divide karra hai"); }
	}
}
