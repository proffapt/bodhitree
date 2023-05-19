import java.util.*;

class Main {
  public static void main(String[] args) {
    // Q1 - Count the number of distinct elements in every window of size k
    int[] a = {1, 2, 2, 1, 3, 1, 1, 3};
    int k = 4;
    qONE_HashSet(a, k);
    System.out.println();
    qONE_HashMap(a, k);
    System.out.println();

    // Q2 - Find the sub array with given sum
    // Just give the starting and ending indices for the sub-array
    int[] b = {10, 15, -5, 15, -10, 5};
    int sum = 5;
    qTWO(b, sum);

    // Q3 - Find the largest sub-array with equal numbers of 1 and 0
    int[] c = {1, 1, 0, 1, 1, 0, 0};
    qTHREE(c);
  }

  public static void qTHREE(int[] a) {
    int n = a.length, i = -1;
    Map<Integer,Integer> m = new HashMap<>();
    for (int j = 0, sum = 0 ; j <= n-1; j++) {
      int k = (j-i+1)/2;
      sum += a[j];
      
      // Need to handle this special case
      if (sum == k) {
        System.out.println("["+0+", "+j+"]");
      }
      
      if(sum == k) {
        i = m.get(sum - k);
        System.out.println("["+i+", "+j+"]");
      }
      
      // Should be done in the end otherwise, woh khud bhi milsakta
      m.put(sum, j);
    }
  }

  // O(n)
  // NOTE: This doesn't work when there are more than one occurance of a number as a sum.
  public static void qTWO(int[] a, int k) {
    int n = a.length, sum = 0, i = -1;
    Map<Integer,Integer> m = new HashMap<>();
    for (int j = 0 ; j <= n-1; j++) {
      sum += a[j];

      // Need to handle this special case
      if (sum == k) {
        System.out.println("["+0+", "+j+"]");
      }

      if(m.containsKey(sum - k)){
        i = m.get(sum - k);
        System.out.println("["+(i+1)+", "+j+"]");
      }
      
      // Should be done in the end otherwise, woh khud bhi milsakta
      m.put(sum, j);
    }
    if (i == -1) {
      System.out.println("Not Found");
    }
  }
  
  // O(n)
  public static void qONE(int[] a, int k) {
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
