import java.util.*;

class Main {
  // Construction of heap from scratch
  // Inserting every element using the algorithm just learned
  // Has a complexity of O(n*logn)
  //
  // HEAPIFY
  // algorithm to create heap within O(n)
  
  public static void main(String[] args) {
    int[] heap = {20, 10, 30, 5, 50, 40};
    // Heapify will convert the above to a heap -> [50, 30, 40, 5, 10, 20]
    // Or some other valid MAX HEAP configuration
    heapify(heap);
    for (int i : heap) {
      System.out.print(i+" ");
    }
    System.out.println();

    int[] a = {40, 10, 30, 50, 60, 15};
    for (int i : a) {
      System.out.print(i+" ");
    }
    System.out.println();
    heapsort(a);
    System.out.println();
  }

  // 1. Constrcuct heap
  // 2. Remove the top most eleement with Last element, then remove the last
  // O(n*logn)
  public static void heapsort(int[] a) {
    for (int i = 0; i < a.length; i++) {
      // Constrcuct heap
      heapify(a);
      System.out.print(a[0]+" ");
      
      // Delete the top most element
      a[0] = a[a.length-1];
      a[a.length-1] = -1;
    }
  }

  // O(n)
  public static void heapify(int[] a) {
    int n = a.length;
    for (int i = n/2; i >= 0; i--) { // starting from n/2 is optimisation
                                     // Why? Because we ignored leaf eleements
                                     // 
                                     // Indices of Leaf element are:
                                     // [n/2]+1, [n/2]+2 ... n
                                     //
                                     // Hence non-leaf wer from 0 to [n/2]
      int leftChild = 2*i+1;
      int rightChild = 2*i+2;
      
      if (leftChild >= n) continue;

      // Good logic
      // leftChild is strictly less than equal to last index
      // rightChild might get out of bound when leftChild is at last index
      int greater;
      if (rightChild == n)
      // if (leftChild == n-1)
        greater = leftChild;
      else
        greater = a[leftChild] > a[rightChild] ? leftChild : rightChild;
      
      if(a[i] < a[greater]) {
        a[i] = a[i] ^ a[greater];
        a[greater] = a[i] ^ a[greater];
        a[i] = a[i] ^ a[greater];
      }
    }
  }
}
