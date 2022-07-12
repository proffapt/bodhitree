class A{
	public int a;
	public int m1(){
		return 69;
	}
	public void m2(){
		System.out.println("This is method 2 of class A.");
	}
	public void m3(){
		System.out.println("This is method 3 of class A.");
	}
}

class B extends A{
	@Override // tells you that you have done overriding here.. if you someday change the original one in 
	// parent class then this part will throw error and tell you that over riding doesn't exist anymore.. be careful
	public void m3(){
		System.out.println("This is method 3 of class B."); // this func is prefered over the parent's func.
	}
	public void m4(){
		System.out.println("This is method 4 of class B.");
	}
}

class Main{
	public static void main(String[] args){
		A a = new A();
		B b = new B();
		a.m2();
		b.m2();
		a.m3();
		b.m3();
	}
}
