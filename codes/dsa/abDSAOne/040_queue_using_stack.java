import java.util.*;

class Main {
  public static void main(String[] args) {
    Queue q = new Queue();
    q.push(5);
    q.push(4);
    q.push(9);

    System.out.println(q.peek());
    System.out.println(q.pop());
    System.out.println(q.peek());
  }
}

class Queue{
  Deque<Integer> s1, s2; 

  // Should create 2 new stack for every object, if initialised without constructor
  // There will be 2 stacks for all the objects :shrug 
  Queue(){
    s1 = new ArrayDeque<>();
    s2 = new ArrayDeque<>();
  }

  void push(int data) {
    this.s1.push(data);
  }

  int pop(){
    // Move to second stack
    do {
      this.s2.push(this.s1.pop());
    } while (!this.s1.isEmpty());
    
    // pop from it
    int popped = this.s2.pop();

    // Send back to first stack
    do {
      this.s1.push(this.s2.pop());
    } while (!this.s2.isEmpty());

    return popped;
  }

  int peek(){
    // Move to second stack
    do {
      this.s2.push(this.s1.pop());
    } while (!this.s1.isEmpty());
    
    // pop from it
    int peeked = this.s2.peek();

    // Send back to first stack
    do {
      this.s1.push(this.s2.pop());
    } while (!this.s2.isEmpty());

    return peeked;
  }
}
