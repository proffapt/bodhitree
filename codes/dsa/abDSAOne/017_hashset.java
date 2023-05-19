import java.util.*;

// Hashing has benifit of having following operations in O(1):
//   - INSERT
//   - DELETE
//   - SEARCH

class Main {
  public static void main(String[] args) {
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

    // Q1 - Count the number of distinct elements in every window of size k
    int[] a = {1, 2, 2, 1, 3, 1, 1, 3};
    int k = 4;
    qONE(a, k);
    System.out.println();

    // Q2 - Union of two arrays
    int[] b = {3, 4, 1, 4, 2, 5, 5};
    System.out.println(qTWO(a, b));

    // Q3 - Intersection of two arrays
    System.out.println(qTHREE(a, b));
  }
  
  // O(n*k)
  public static void qONE(int[] a, int k) {
    HashSet<Integer> s = new HashSet<>();
    for (int i = 0; i < a.length+1-k; i++) {
      for (int j = i; j < i+k; j++) {
        s.add(a[j]);
      }
      System.out.print(s.size()+" ");
      s.clear();
    }
  }

  // O(m+n)
  public static int qTWO(int[] a, int[] b) {
    HashSet<Integer> s = new HashSet<>();
    
    for (int i : a) {
      s.add(i);
    }
    
    for (int i : b) {
      s.add(i);
    }
    
    return s.size();
  }

  // O(n)
  public static int qTHREE(int[] a, int[] b) {
    HashSet<Integer> s = new HashSet<>();
    
    for (int i : a) {
      s.add(i);
    }
    int n_a = s.size();
    
    for (int i : b) {
      s.add(i);
    }
    int n_a_b = s.size();
    
    s.clear();
    for (int i : b) {
      s.add(i);
    }
    int n_b = s.size();
    
    return n_a + n_b - n_a_b;
  }
}
