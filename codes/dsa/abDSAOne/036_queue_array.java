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
    System.out.println(q.getFront());
    System.out.println(q.dequeue());
    System.out.println(q.getFront());
  }
}

class Queue{
  int[] a;
  int size;
  int rear;
  // int front; Redundant here, is always = 0.

  Queue (int size){
    this.size = size;
    this.rear = -1;
    this.a = new int[size];
  }

  void enqueue(int data){
    if (this.isFull()) {
      System.out.println("No more space to add another guy");
      return;
    }
    this.a[++this.rear] = data;
  }

  // Have to shift the whole array forward, as 
  // Removal happens from front and addition from back, can't just let the freed space go away 
  // THE QUEUE HAS TO MOVE FORWARD!
  int dequeue(){
    if (this.isEmpty()){
      System.out.println("Bacche ki jaan loge kya?");
      return -1;
    }
    int removed = a[0];
    for (int i = 0; i <= this.rear-1; i++) {
      this.a[i] = this.a[i+1];
    }
    --this.rear;
    return removed;
  }

  int getFront(){
    if (!this.isEmpty()) return a[0];
    else {
      System.out.println("This is an empty Queue, what the heck do you want?");
      return -1;
    }
  }

  boolean isFull(){
    return (this.rear == this.size - 1) ? true : false;
  }

  boolean isEmpty() {
    return (this.rear == -1) ? true : false;
  }
}
