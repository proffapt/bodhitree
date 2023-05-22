class Main {
  public static void main(String[] args) {
    Node n1 = new Node(1);
    Node n2 = new Node(2);
    Node n3 = new Node(3);
    Node n4 = new Node(4);
    Node n5 = new Node(5);

    n1.next = n2;
    n2.next = n3;
    n3.next = n4;
    n4.next = n5;
    Node head = n1;

    n1.random = n3;
    n2.random = n1;
    n3.random = n3;
    n4.random = n2;
    n5.random = n4;

    head.traverse(head);
  }
}

class Node {
  int data;
  Node next;
  Node random;

  Node (int data){
    this.data = data;
    this.next = null;
    this.random = null;
  }

  static void traverse(Node ptr) {
    while (ptr != null){
      System.out.print(ptr.data+" ");
      ptr = ptr.next;
    }
    System.out.println();
  }
}
