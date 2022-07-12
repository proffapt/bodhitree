// Hashing Technique
/*
	Method to convert key, value pair to Index.
	Basically there is a hashing function when we put the key and value in it we get the index corresponding to
	the location of that value in our hash table.

	For example: let the hashing algorithm/function be f(x) = x%/array.length();
	Here: 
		Array is the hashing table
		x is the value.
		array.length() is the key being used.
		f(x) is the index of value(x) in the hashtable.
*/
// NEED FOR THIS?
/*
	- Super fast searching
	- Super fast insertion
	just put the value along with the key into the function
	the value of the function will be the index corresponding to the interested value.
*/
// Hash collision and methods to face it
/*
	two different value gives same indices.. then it is a hash collision
	For ex:
		21%10 -> 1
		11%10 -> 1
		Now which one will you put at index 1?
	==== Techniques to face hashing collisions ====
	1. Open addressing
		Put 21 at 1 then 11 at the next free spot in the array.. and so on..
	2. Chaining
		Put 11 and 21 in a linked list.. store pointer to head in index 1 of the array.
*/
// Classes implementing hashing technique:
/*
	- HashSet
	- HashMap
	- HashTable
	- LinkedHashMap
*/
// Load Factor: How much data your hash table can store before it's capacity is automatically increased.
import java.util.HashSet;
class Main{
	public static void main(String[] args){
		// Hash => Is using hashing technique internally.
		// Set => Repetition of values is not allowed.
		HashSet<Integer> h = new HashSet<>(20, 0.5f); // default capacity of 16 and load factor of 0.75
		h.add(6);
		h.add(8);
		h.add(3);
		h.add(11);
		h.add(11); // won't be added for real.. only unique values allowed
		// printing in ascending order for real..
		System.out.println(h); // Sexy af method to print a set
		System.out.println(h.hashCode()); // to get the hashing code.
	}
}
