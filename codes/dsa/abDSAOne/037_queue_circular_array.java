/*
                               Circular Array
    - All of the mathematical operations on the indices of this array are performed via applying modulo
    of length of the array to those calculations.
          (a=a+1) become (a=a+1)%n
*/
/*
 *                  Implementing Queue with such a concept
*/
// Whenever you increament last or first, always do CIRCULAR INCREAMENTATION.
/*
- only the logic for isEmpty() and isFull() modifies.
- rest logic remains same with following minor patches:
  - we have to update the front from -1 as well when adding first element
  - Have to update the front and rear both to -1 while removing the last element

*/

class Main {
  public static void main(String[] args) {
    Queue q = new Queue(5);
    System.out.println(q.isEmpty());
    System.out.println(q.isFull());
    q.enqueue(5);
    q.enqueue(3);
    q.enqueue(4);
    System.out.println(q.isFull());
    q.enqueue(6);
    q.enqueue(9);
    q.enqueue(0);
    System.out.println(q.isFull());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
    System.out.println(q.dequeue());
  }
}

// Take care while 
//   removing the last element 
//   adding the first element
class Queue{
  int[] a;
  int size;
  int front; // becomes pretty useful here
  int rear;

  Queue (int size){
    this.a = new int[size];
    this.size = size;
    this.front = -1;
    this.rear = -1;
    // Both equal to -1 will lay the foundation of isEmpty check
  }

  boolean isFull(){
    return ((this.rear+1) % this.size == this.front) ? true : false;
  }

  // both front and rear should be -1 at the same time
  boolean isEmpty(){
    return (this.front == -1 && this.rear == -1);
  }

  int dequeue(){
    if (this.isEmpty()) {
      System.out.println("Bacche ki jaan loge kya?");
      return -1;
    }
    
    int removed = this.a[this.front];
    // All of this to handle artificial empty condition
    if (this.front == this.rear) {
      this.front = -1;
      this.rear = -1;
    }
    else
      this.front = (this.front + 1) % this.size;
    
    return removed;
  }

  void enqueue(int data){
    if (this.isFull()) {
      System.out.println("No more space to add another guy");
      return;
    }

    
    this.rear = (this.rear + 1) % this.size;
    
    if (this.front == -1) this.front = this.rear; // Just repurcursions of optimisation, artificial empty
    
    this.a[this.rear] = data;
  }
}
