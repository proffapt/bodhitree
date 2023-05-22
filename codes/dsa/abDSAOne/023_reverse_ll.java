class Main {
  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(15);
    Node n4 = new Node(4);

    Node head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n4;

    head.traverse(head);

    // Reversing Linked list
    head = head.reverse(head);
    head.traverse(head);
  }
}

class Node {
  int data;
  Node next;

  Node (int data){
    this.data = data;
    this.next = null;
  }

  // Maintain three pointers
  // connect to previous and carry forward the three pointers
  // Null ka next doesn't exist, take care for nextPtr
  static Node reverse(Node ptr) {
    Node prev = null;
    // Node nextPtr = ptr.next;
    Node nextPtr = null;
    
    while (ptr != null) {
      // Keeping ptr and nextPtr at same node in the end helps to prevent the case of null.next with nextPtr
      // null     10     20
      //  ^        ^  
      //  |    |     |
      // prev ptr nextPtr
      nextPtr = ptr.next;
      // Connect to the previous node
      ptr.next = prev;
      // Move all the three pointers one step forward
      prev = ptr;
      ptr = nextPtr;
      // if (nextPtr != null) nextPtr = nextPtr.next;
    }
    return prev;
  }

  static void traverse(Node ptr) {
    while (ptr != null){
      System.out.print(ptr.data+" ");
      ptr = ptr.next;
    }
    System.out.println();
  }
}
