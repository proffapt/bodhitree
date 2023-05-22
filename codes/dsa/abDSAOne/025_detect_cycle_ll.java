class Main {
  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(15);
    Node n4 = new Node(4);
    Node n5 = new Node(15);
    Node n6 = new Node(20);
    Node n7 = new Node(10);

    Node head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n5;
    n4.next = n5;
    n5.next = n6;
    n6.next = n7;
    n7.next = n3;

    // head.traverse(head);

    System.out.println(head.fcdAlgorithm(head));
  }
}

class Node {
  int data;
  Node next;

  Node (int data){
    this.data = data;
    this.next = null;
  }

  // Floyd's Cycle detection algorithm
  // Constant space
  static Node fcdAlgorithm(Node ptr) {
    Node slow = ptr, fast = ptr, meetingPtr = null;

    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
      if (fast == slow) {
        // Now we are sure that cycle exist
        // Let's findout the node where cycle exists
        // That node is equidistant from:
        // point of meeting of s, f pointers, and the start of the list
        Node head = ptr;
        meetingPtr = fast;
        while (head != meetingPtr) {
          head = head.next;
          meetingPtr = meetingPtr.next;
        }
        break;
      }
    }
    return meetingPtr;
  }
  
  static Node reverse(Node ptr) {
    Node prev = null, nextPtr = null;
    
    while (ptr != null) {
      nextPtr = ptr.next;
      ptr.next = prev;
      prev = ptr;
      ptr = nextPtr;
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


