class Main{
	/*
	static int sum(int a, int b){
		return a+b;
	}

	static int sum(int a, int b, int c){
		return a+b+c;
	}
	*/
	// How many times will you do this?.. pathetic
	// look at varargs now

	static int sum(int ... arr){ // this means >> put every argument given into an array named arr
		int result=0;
		for(int i:arr)
			result+=i;
		return result;
	}

	// making atleast two args as compulsory
	static int add(int a, int b, int ... arr){ // this means >> put first two in a and b respectively and for remaining put every argument given into an array named arr
		int result=a+b;
		for(int i:arr)
			result+=i;
		return result;
	}

	public static void main(String[] args){
		int a = sum(1, 2, 3, 4, 5 ,6, 7, 8);	
		int b = sum(4, 5 ,6, 7, 8);	
		// int c = add();
		int c = add(3, 4);
		int d = add(3, 4, 5);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
