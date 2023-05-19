import java.util.*;
// Priority Queue in JAVA is MIN HEAP by default.
// While, in C++ it is MAX HEAP
//
//  PriorityQueue uses MAX & MIN HEAP data structure internally.
//  We saw in last two lessons how to implement it from scratch,
//  Let's now use Java Collections Framework.
//
//  Why this name?
//  Because in queue the one who gets out first vary from queue types
//  Here, it depends on Priority, for numbers can be MAX / MIN, which can be 
//  implemented via corresponding HEAPS, hence named PriorityQueue.

class Main {
  public static void main(String[] args) {
    // Min heap
    PriorityQueue<Integer> min_heap = new PriorityQueue<>();
    // Max heap
    PriorityQueue<Integer> max_heap = new PriorityQueue<>(Collections.reverseOrder());

    // Addition
    min_heap.add(5);
    min_heap.add(15);
    min_heap.add(10);

    System.out.println(min_heap); // Easily print PQ
    System.out.println("Size of heap: "+min_heap.size());

    while(!min_heap.isEmpty()){ // Is empty or not?
      System.out.print(min_heap.peek()+" "); // Gets the top-most element
      min_heap.poll(); // Deletes the top-most element
    }
    System.out.println();

    // Q1 - Find the kth largest element in an array
    int[] a = {20, 10, 60, 30, 50, 40};
    int k = 3;
    System.out.println(qONE(a, k));

    // Q2 - Connect N ropes with minimum cost
    int[] b = {2, 5, 4, 8, 6, 9}; // Indicate 6 ropes with their lengths
                                  // say you take 2 and 5 first, cost = 7
                                  // then 4, cost = 7 + (7 + 4)
    System.out.println(qTWO(b));

    // Q3 -
  }

  public static int qTHREE() {
    
  }

  public static int qTWO(int[] a) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int i : a) {
      pq.add(i);
    }

    int cost = 0, totalLength=0;
    while (pq.size() > 1) {
      totalLength = pq.poll()+pq.poll();
      cost += totalLength; 
      pq.add(totalLength);
    }
    return cost;
  }

  // Logic is to maintain K largest elements found so far in a PriorityQueue
  public static int qONE(int[] a, int k) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    // Looping through first k elements and maitaining them in PriorityQueue
    for (int i=0; i<k; i++) {
      pq.add(a[i]);
    }
    
    // Now if the next element is greater than the minimum element found so far
    // then it's the minimum element that is going to be removed and the next element will
    // Re-arrange the PriorityQueue.
    for (int i=k; i<a.length; i++){
      if (pq.peek() < a[i]) {
        pq.poll();
        pq.add(a[i]);
      }
    }

    return pq.peek();
  }
}
