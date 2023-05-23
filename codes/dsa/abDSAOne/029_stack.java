import java.util.*;

class Main {
  public static void main(String[] args) {
    // Basic implementation and use cases
    Stack<Integer> s = new Stack<>(); // Uses vector internally, and requires indices for operation
    // It is rather Recommended to use Deque interface
    // Deque is the Doubly ended queue
    Deque<Integer> as = new ArrayDeque<>(); 
    Deque<Integer> lls = new LinkedList<>(); 
    s.push(9);
    s.push(8);
    s.push(4);
    // System.out.println(s.size());
    while (!s.isEmpty()) {
      // System.out.print(s.peek()+" ");
      s.pop();
    }
    // System.out.println();

    // Q1 - Previous Smaller Element
    int[] a = {4, 10, 5, 8, 20, 15, 3, 12};
    qOne(a);

    // Q2 - Maximum Area in Histogram
    // I thought of a noval method via pre-processing of array completely by myself :)
    // And the ideation of code as well, all in 10 minutes
    // It had time and space complexities of: O(n), O(n)
    int[] b = {4, 2, 1, 5, 6, 3, 2, 4, 2};
    // System.out.println(qTwo(b));
  }

  // Using stack - Obviously
  // static int qTwo(int[] b){
  //   return area;
  // }

  // In this method we are maintaining a increasing stack from bottom
  // So that we get to see the maximum of the elements encountered yet
  // We keep popping off until we find the element less than current
  // peek that elemenet and push the current element
  static void qOne(int[] a) {
    Stack<Integer> s = new Stack<>();
   
    System.out.print("[");
    for (int i = 0; i < a.length; i++) {
      if (s.isEmpty()) {
        System.out.print((-1)+", ");
        s.push(a[i]);
        continue;
      }
      
      if (s.peek() < a[i]) {
        System.out.print(s.peek()+", ");
        s.push(a[i]);
      } else {
        s.pop();
        i--;
      }
    }
    System.out.printf("\b\b] \n");
  }
}
