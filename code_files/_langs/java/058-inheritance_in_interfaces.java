interface Daddy{
	void method_1();
	void method_2();
}

// interface Child implements Daddy{ --> ERROR
interface Child extends Daddy{
	void method_3();
	void method_4();
	// basically this is just combining both the interfaces.. 
	// basically it's just for segrigation but still be used as one.
}

class Main{
	public static void main(String[] args){
	}
}
