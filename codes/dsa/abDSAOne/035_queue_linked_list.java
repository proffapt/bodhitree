// Queue is an abstract data structure - following FIFO architecture, 
// which can be implemented using both arrays as well as linked list.

class Main {
  public static void main(String[] args) {
    Queue q = new Queue();

    System.out.println(q.isEmpty());
    q.enqueue(5);
    q.enqueue(3);
    q.enqueue(8);
    System.out.println(q.isEmpty());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    q.enqueue(3);
    System.out.println(q.dequeue());
  }
}

class Queue{
  Node front = null, rear = null; // That's all you need for a queue

  // Think about 0 node
  // Think about 1 node
  // Think about > 1 node, all cases you can handle
  void enqueue (int data) {
    Node toAdd = new Node(data);

    if (this.isEmpty()) {
      this.front = toAdd;
      this.rear = toAdd;
    } else {
      this.rear.next = toAdd;
      this.rear = toAdd;
    }
  }

  int dequeue() {
    if (this.isEmpty()) {
      System.out.println("You want QueueUnderflow?");
      return -1;
    } else {
      int result = this.front.data;
      this.front = this.front.next;
      return result;
    }
  }
  
  // As simple as that!
  boolean isEmpty(){
    return (this.front == null) ? true : false ;
  }
}

class Node {
  int data;
  Node next;

  Node (int data) {
    this.data = data;
    this.next = null;
  }
}
