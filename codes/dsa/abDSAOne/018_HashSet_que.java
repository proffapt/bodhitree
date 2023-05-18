import java.util.*;

class Main {
  public static void main(String[] args) {
    // Q1 - Count the number of distinct elements in every window of size k
    int[] a = {1, 2, 2, 1, 3, 1, 1, 3};
    int k = 4;
    qONE_HashSet(a, k);
    System.out.println();
    qONE_HashMap(a, k);
  }

  // O(n*k)
  public static void qONE_HashSet(int[] a, int k) {
    HashSet<Integer> s = new HashSet<>();
    for (int i = 0; i < a.length+1-k; i++) {
      for (int j = i; j < i+k; j++) {
        s.add(a[j]);
      }
      System.out.print(s.size()+" ");
      s.clear();
    }
  }
  
  // O(n)
  public static void qONE_HashMap(int[] a, int k) {
    Map<Integer,Integer> m = new HashMap<>();
    for(int i=0; i < k; i++)
      m.put(a[i], m.getOrDefault(a[i], 0)+1);
    
    System.out.print(m.size()+" ");
    for(int i=k; i <= a.length-1; i++){
      m.put(a[i], m.getOrDefault(a[i], 0)+1);
      
      if (m.get(a[i-k]) == 1)
        m.remove(a[i-k]);
      else if (m.get(a[i-k]) > 1)
        m.put(a[i-k], m.getOrDefault(a[i-k], 0)-1);
      
      System.out.print(m.size()+" ");
    }
  }
}
