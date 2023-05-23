import java.util.*;

// This problem has multiple approaches to solve, here we gonna see the most optimal appraoch
/*
    - Naive / Bruteforce              : O(n*k), O(1)
    - Using AVL Tree / PriorityQueue  : O(n*logk), O(k)
    - Using Deque                     : O(n), O(k)
*/

class Main {
  public static void main(String[] args) {
    // Q1 - Maximum element in the sliding window
    int[] a = {4, 1, 3, 5, 1, 2, 3, 2, 1, 1, 5};
    int k = 3;
    
    qOne(a, k);
  }

  static void qOne(int[] a, int k){
    ArrayDeque<Integer> q = new ArrayDeque<>();

    for (int i : a) {
      if (q.peek() < i) 
        q.poll();
      
      q.offer(i);
    }
  }
}
