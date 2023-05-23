import java.util.*;

/*
    ArrayDeque (Class) > Deque (Implements) > Queue (extends) > Collection (extends)
*/
class Main {
  public static void main(String[] args) {
  // Stack
  ArrayDeque<Integer> stack = new ArrayDeque<>();
  // Queue
  ArrayDeque<Integer> queue = new ArrayDeque<>();
  // Deque
  ArrayDeque<Integer> deque = new ArrayDeque<>();

  stack.push(3); stack.peek(); stack.pop(); // use stack operations to use as stack

  queue.offer(5); queue.peek(); queue.poll(); // use queue operations to use as queue
                                              // Dosn't throw exeptions
  queue.add(5); queue.element(); queue.remove(); // use queue operations to use as queue
                                                 // Throws Exceptions

  deque.offerFirst(4); deque.offerLast(5); deque.peekFirst(); deque.peekLast(); deque.pollFirst(); deque.pollLast(); // use deque operations to use as queue
                                                                                                                     // Doesn't throw exception
  deque.addFirst(4); deque.addLast(5); deque.getFirst(); deque.getLast(); deque.removeFirst(); deque.removeLast(); // use deque operations to use as queue
                                                                                                                   // Throws exceptions
  }
}
