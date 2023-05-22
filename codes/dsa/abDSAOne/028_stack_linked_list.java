class Main {
  public static void main(String[] args) {
    Stack mystack = new Stack();
    
    // System.out.println(mystack.isEmpty());
    // System.out.println(mystack.size());
    // System.out.println(mystack.peek());
    // System.out.println(mystack.pop());
    
    mystack.push(6);
    System.out.println(mystack.size());
    System.out.println(mystack.isEmpty());
    System.out.println(mystack.peek());

    mystack.push(4);
    System.out.println(mystack.peek());
    mystack.push(6);
    System.out.println(mystack.pop());
    mystack.push(6);
    mystack.push(6);
    mystack.push(6);
    mystack.push(6);
    mystack.push(7);
    System.out.println(mystack.peek());
  }
}

// Using Linkedlist - very simple
// DO WHATEVER OPERATION YOU WANT ON HEAD
  // Add bhi head ki jagah karo, remove bhi head ki jagah ko karo.
class Stack {
  Node head;
  int size;
  // int top; -> not required / redundant (top = size-1)
  // No need for isFull(), it has dynamic size.

  Stack(){
    this.size = 0;
    head = null;
  }

  boolean isEmpty(){
    return this.size == 0;
  }

  int size(){
    return this.size;
  }
  
  int peek(){
    return this.isEmpty() ? -1 : this.head.data;
  }

  void push(int data){
    Node toAdd = new Node(data);
    // Since i can't do head.next, as head is null
    // This was good
    toAdd.next = this.head;
    this.head = toAdd;
    this.size++;
  }
    
  int pop(){
    if (this.isEmpty()) {
      System.out.println("You want StackUnderflow?");
      return -1;
    }

    int popped = this.head.data;
    this.head = this.head.next;
    return popped;
  }
}

class Node {
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;
  }
}
