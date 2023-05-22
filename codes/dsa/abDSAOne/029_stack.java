import java.util.*;

class Main {
  public static void main(String[] args) {
    // Basic implementation and use cases
    Stack<Integer> s = new Stack<>();
    s.push(9);
    s.push(8);
    s.push(4);
    System.out.println(s.size());
    while (!s.isEmpty()) {
      System.out.print(s.peek()+" ");
      s.pop();
    }
    System.out.println();

    // Q1 - Previous Smaller Element
    // Q2 - Next Smaller Element
  }
}
