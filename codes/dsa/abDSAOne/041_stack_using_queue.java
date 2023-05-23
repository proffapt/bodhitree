import java.util.*;

class Main {
  public static void main(String[] args) {
    Stack s = new Stack();
    s.push(5);
    s.push(4);
    s.push(9);

    System.out.println(s.peek());
    System.out.println(s.pop());
    System.out.println(s.peek());
  }
}

// Just opposite as that of implementing
// Queues from Stack
// what you did with pop and peek there, do here with push
// and what you did with push there, do with pop and peek here
class Stack{
  Queue<Integer> q1, q2;

  // So that there are two unique queues for every object.
  Stack(){
    q1 = new ArrayDeque<>();
    q2 = new ArrayDeque<>();
  }

  void push(int data){
    // Transfer stuff from q1 to q2
    while(!this.q1.isEmpty()){
      this.q2.offer(this.q1.poll());
    }

    // add new element to q1
    this.q1.offer(data);

    // Transfer everything back from q2 to q1
    while(!this.q2.isEmpty()){
      this.q1.offer(this.q2.poll());
    }
  }

  int pop(){
    return this.q1.poll();
  }

  int peek(){
    return this.q1.peek();
  }
}
