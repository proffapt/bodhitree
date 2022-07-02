import java.util.*;

// NOTEEE
// Each and every-fucking thing existing in array exist in linked list with same meaning
class Main{
	public static void main(String[] args){
		// This particular syntax is of generics..
		// ArrayList is advanced implementation of arrays by java.
		LinkedList<Integer> l1 = new LinkedList<>(); // by default size will be 10 elements.		
		LinkedList<Integer> l2 = new LinkedList<>(); 
		l2.add(69); // appends to last.
		l2.add(55);
		l2.add(90);
		l1.add(6);
		l1.add(4);
		l1.add(7);
		l1.add(8);
		l1.add(6);
		System.out.println("The 3rd element is: "+l1.get(2));	
		for(int i:l1) System.out.print(i+" ");
		l1.add(2, 3); // adds a new element(3) at this location(index 2) and extends the array
		System.out.println("\nThe 3rd element is: "+l1.get(2));	
		for(int i:l1) System.out.print(i+" ");
		l1.addAll(l2); // l1 mein l2 jod do.. last mein
		System.out.print("\n");
		for(int i:l1) System.out.print(i+" ");
		l1.addAll(2, l2); // l1 mein l2 jod do.. at index 2
		System.out.print("\n");
		for(int i:l1) System.out.print(i+" ");
		l1.removeAll(l2); // removes all elements of l2 from l1
		System.out.print("\n");
		for(int i:l1) System.out.print(i+" ");
		l1.addAll(l2); // l1 mein l2 jod do.. last mein
		l2.clear();
		System.out.print("\n");
		for(int i:l2) System.out.print(i+" ");
		System.out.println(l1.contains(69));
		System.out.println(l1.indexOf(69)); // sabse pehle jo mile
		System.out.println(l1.lastIndexOf(69)); // sabse last mein jo mile
		System.out.println(l1.indexOf(169));
		System.out.println(l1.size());
		l1.remove(2); // removes the element and re-arranges the rest of the array
		System.out.println(l1.size());
		for(int i:l1) System.out.print(i+" ");
		l1.set(2, 44); // replaces the element present at the index 2 by 44.
		System.out.print("\n");
		for(int i:l1) System.out.print(i+" ");
		l1.removeIf(n->(n%11==0)); // remove elements if the element is divisible by 11..
		// the thing inside top most paranthesis is called a PREDICATE.. n refers to the element..
		// means.. remove n if n%11==0.
		// thing before arrow operator is removed if thing after arrow operator is true.
		System.out.print("\n");
		for(int i:l1) System.out.print(i+" ");
		System.out.print("\n");
		l1.forEach(n->System.out.print(n+" ")); // read like for each n in the array list do this.

		// Linked list specific methods
		l1.addLast(666);
		System.out.print("\n");
		l1.forEach(n->System.out.print(n+" ")); // read like for each n in the array list do this.
		l1.addFirst(999);
		System.out.print("\n");
		l1.forEach(n->System.out.print(n+" ")); // read like for each n in the array list do this.
		System.out.print("\n");
		System.out.println(l1.peek()); // retrives the head for the linked list.
	}
}
