class Main {
  public static void main(String[] args) {
    Node n1 = new Node(10);
    Node n2 = new Node(20);
    Node n3 = new Node(15);
    // Node n4 = new Node(4);
    Node n5 = new Node(15);
    Node n6 = new Node(20);
    Node n7 = new Node(10);

    Node head = n1;
    n1.next = n2;
    n2.next = n3;
    n3.next = n5;
    // n4.next = n5;
    n5.next = n6;
    n6.next = n7;

    head.traverse(head);

    System.out.println(head.isPalindrome(head));
  }
}

class Node {
  int data;
  Node next;

  Node (int data){
    this.data = data;
    this.next = null;
  }

  // Constant space - Reverse half of the ll
  // Easily think about odd list, even will satisy.
  // Head null case
  static boolean isPalindrome(Node ptr) {
    if(ptr == null) return true;
    Node slow = ptr;
    Node fast = ptr;

    // first condition for even, second for odd
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    // After this, slow will be at mid
    
    Node revPtr = ptr.reverse(slow);
    
    // Odd mein dono saath mein null honge
    // Even mein revPtr pehle null hojayega, but tab tak list check hochuki hogi
    while (ptr != null && revPtr != null) {
      if (ptr.data != revPtr.data){
        return false;
      } else {
        ptr = ptr.next;
        revPtr = revPtr.next;
      }
    }
    return true;
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

