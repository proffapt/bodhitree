class Main {
  public static void main(String[] args) {
    
  }
}

class NodeGeneric<T> {
  T data;
  NodeGeneric next;

  NodeGeneric (T data) {
    this.data = data;
    this.next = null;
  }
}
