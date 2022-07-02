// Java Generics
/*
	- The are like the templates we have in C++, they are not exactly the same.. but the concept is same..
*/
import java.util.ArrayList;

// Creating your own custom generic
class MyGeneric<T1, T2>{
	T1 a;
	T2 b;	
	MyGeneric(T1 x, T2 y){
		a=x;
		b=y;
	}
	void getData(){
		System.out.println("\na = "+a+", b = "+b);
	}
}

class Main{
	public static void main(String[] args){
		ArrayList a = new ArrayList();
		a.add("fuck you");
		a.add(69.69f);
		a.add(69);
		int b = (int) a.get(2); // ->> very bad method of writing a code
		System.out.println(b);
		ArrayList<Integer> goodAL = new ArrayList<>();
		goodAL.add(66);
		goodAL.add(69);
		goodAL.add(5);
		goodAL.forEach(n->System.out.print(n+" "));
		// Using my own custom generic
		MyGeneric<Integer, String> my = new MyGeneric<>(69, "Sixty Nine");
		my.getData();
	}
}
