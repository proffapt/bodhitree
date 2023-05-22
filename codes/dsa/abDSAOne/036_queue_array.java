class Main {
  public static void main(String[] args) {
    
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
  }

  void enqueue(int data){
    this.a[++this.rear] = data;
  }

  boolean isFull(){
    return (this.rear == this.size - 1) ? true : false;
  }

  boolean isEmpty() {
    return (this.rear == -1) ? true : false;
  }
}
