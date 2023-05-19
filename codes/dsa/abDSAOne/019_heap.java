import java.util.*;

class Main {
  // Heap
  // Heaps are Complete Binary Trees, which allso follow heap's property
  // Max and Min Heaps
  //
  // Heaps are implemented through arrays:
  // 0th index of array is left empty
  // ith node has
  // Parent (ith Node) = i/2
  // leftChild (ith Node) = 2*i
  // rightChild (ith Node) = 2*i+1
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
    heapInsert(heap, 60);
    for (int i : heap) {
      System.out.print(i+" ");
    }
    System.out.println();
    
    heapInsert(heap, 45);
    for (int i : heap) {
      System.out.print(i+" ");
    }
  }

  public static void heapInsert(List<Integer> a, int key) {
    a.add(key); // Adding the key into last entry
    int i = a.size()-1;
    while(i>0){
      if (a.get(i/2)<key) {
        a.set(i, a.get(i/2));
        a.set(i/2, key);
      } else {
        break;
      }
      i /= 2;
    }
  }
}
