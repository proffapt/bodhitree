// Deque - Double Ended queue
// ArrayDeque - Array implementation of deque .. Addition and deletion can be done from both the ends.
import java.util.*;
class Main{
	public static void main(String[] args){
		ArrayDeque<Integer> d1 = new ArrayDeque<>(); // default size is 16 elements
		d1.add(1);
		d1.add(2);
		d1.forEach(n->System.out.print(n+" "));
		System.out.println("");
		System.out.println(d1.getFirst());
		System.out.println(d1.getLast());
		d1.addFirst(0);
		d1.forEach(n->System.out.print(n+" "));
		System.out.println("");
		System.out.println(d1.getFirst());
		System.out.println(d1.getLast());
		// With and w/o Exception
		/*
			With exception
				add , remove, get (First/Last)
			Without exception
				offer, poll, peek (First/Last)
		*/
	}
}
