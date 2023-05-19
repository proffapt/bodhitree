import java.util.*;
import java.lang.*;

// This is manual implementation of heap
// In java collection framework it is present as Priority Queue.

class Main {
  // Heap
  // Heaps are Complete Binary Trees, which allso follow heap's property
  // Max and Min Heaps
  //
  // Heaps are implemented through arrays:
  // ith node has
  // Parent (ith Node) = (i-1)/2
  // leftChild (ith Node) = 2*i+1
  // rightChild (ith Node) = 2*i+2
  //
  // To achieve this magic, we need a complete binary tree
  //        1
  //      /   \
  //     2     3
  //    / \   /
  //   4   5 6
  //  / \
  // 7   8
  
  public static void main(String[] args) {
    // Also this is how you initialise ArrayList
    List<Integer> heap = new ArrayList<>(List.of(50, 30, 40, 10, 5, 20, 30));
    for (int i : heap) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    heapInsert(heap, 60);
    for (int i : heap) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    // heapInsert(heap, 45);
    // for (int i : heap) {
    //   System.out.print(i+" ");
    // }
    // System.out.println();

    heapDelete(heap);
    for (int i : heap) {
      System.out.print(i+" ");
    }
    System.out.println();
  }
  
  // Root node is always deleted
  // O(n)
  public static void heapDelete(List<Integer> a) {
    int i = a.size()-1;
    a.set(0, a.get(i)); // put last element in place of first
    a.remove(i); // remove last element

    i=0;
    while(2*i+1 <= a.size()-1){
      int leftChild = 2*i+1;
      int rightChild = 2*i+2;

      // Good logic
      // leftChild is strictly less than equal to last index
      // rightChild might get out of bound when leftChild is at last index
      int greater;
      if (rightChild == a.size())
        greater = leftChild;
      else
        greater = (a.get(leftChild) > a.get(rightChild)) ? leftChild : rightChild;
      
      if (a.get(i) < a.get(greater)) {
        int temp = a.get(i);
        a.set(i, a.get(greater));
        a.set(greater, temp);
        i = greater;
      } else {
        break;
      }
    }
  }

  // O(logn)
  public static void heapInsert(List<Integer> a, int key) {
    a.add(key); // Adding the key into last entry
    int i = a.size()-1;
    while(i>0){
      if (a.get((i-1)/2)<key) {
        a.set(i, a.get((i-1)/2));
        a.set((i-1)/2, key);
      } else {
        break;
      }
      i = (i-1)/2;
    }
  }
}
