import java.util.*;

class Main {
  public static void main(String[] args) {
    // Declarations of Queue - Interface
    // 1. Using Array
    Queue<Integer> aq = new ArrayDeque<>(); // Recommended
    // 2. Using LinkedList
    Queue<Integer> llq = new LinkedList<>();

    // Do NOT throw exception
    /*
     * offer
     * poll
     * peek
     * */

    // Throws Exception
    // Same work as above, in chornological order
    /*
     * add - if queue was full
     * remove - if queue was empty
     * element - if queue was empty
     * */

    // Add means offer
    aq.offer(10);
    aq.offer(20);
    aq.offer(30);

    // Checking who's gonna come out - the front element
    System.out.println(aq.peek());

    // dequeue - remove element
    System.out.println(aq.poll());
    System.out.println(aq.peek());
    
    System.out.println(aq.size());
    System.out.println(aq.isEmpty());
  }
}
