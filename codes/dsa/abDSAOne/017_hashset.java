import java.util.*;

class Main {
  public static void main(String[] args) {
    
  // Hashing has benifit of having following operations in O(1):
  //   - INSERT
  //   - DELETE
  //   - SEARCH
  
  // Declrations
  // 1
  HashSet<String> sample_set = new HashSet<>(Arrays.asList("Apple", "Banana", "Orange"));
  // 2 - Declrations with fixed size 
  HashSet<Integer> ass = new HashSet<Integer>(10);
  // 3 - Default size 16 (DYNAMIC)
  Set<Integer> yass = new HashSet<>();
  // 4
  HashSet<Integer> s = new HashSet<>();
  
  // Adding
  s.add(5);
  s.add(10);
  
  // Printing
  System.out.println(s); // [5, 10]

  // Finding whether an element exist or not
  System.out.println(s.contains(10)); // true

  // Remove
  s.remove(10);
  System.out.println(s.contains(10)); // false

  // Is empty?
  System.out.println(s.isEmpty()); // false

  // Getting the size of hashset
  System.out.println(s.size()); // 1

  // Clearing the HashSet
  s.clear();
  System.out.println(s.isEmpty()); // true
  }
}
