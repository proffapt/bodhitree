// Stacks are abstract data type following the LIFO principle
// It can be implemented utilising either Arrays or LinkedList
// I have done both of these in cwh's C course already
// But, for the sake of it let's do them here as well.

class Main {
  public static void main(String[] args) {
    Stack mystack = new Stack(5);
    
    System.out.println(mystack.capacity());
    System.out.println(mystack.isFull());
    System.out.println(mystack.isEmpty());
    System.out.println(mystack.size());
    System.out.println(mystack.peek());
    System.out.println(mystack.pop());
    
    mystack.push(6);
    System.out.println(mystack.size());
    System.out.println(mystack.isEmpty());
    System.out.println(mystack.peek());
    
    mystack.push(6);
    mystack.push(6);
    mystack.push(6);
    mystack.push(6);
    mystack.push(6);
  }
}

// Implmenting stack using Arrays
// Drawback: Fixed size - NOT Dynamic
class Stack {
  int[] a;
  int top; // Index of top element
  int size;

  Stack (int size) { // Constructor
    this.top = -1;
    this.size = size;
    this.a = new int[size]; // array will be created internally! More abstraction!
  }

  boolean isFull(){
    return this.top == this.size-1;
  }

  boolean isEmpty(){
    return this.top == -1;
  }

  int size(){
    return this.top+1;
  }

  int capacity(){
    return this.size;
  }

  void push(int data){
    if (this.isFull()) {
      System.out.println("You want StackOverflow?");
      return;
    }
    
    this.a[++top] = data;
  }

  int peek(){
    return this.isEmpty() ? -1 : this.a[top];
  }

  int pop() {
    if (this.isEmpty()) {
      System.out.println("You want StackUnderflow?");
      return -1;
    }
      
    int popped = this.a[top];
    --this.top;
    return popped;
  }
}
