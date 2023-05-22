class Main {
  public static void main(String[] args) {
    
    
    Node<Integer> ll = new Node<>(-1); // Generic node for calling of method
    // Building a linked list
    Node<Integer> n1 = new Node<>(5);
    Node<Integer> n2 = new Node<>(7);
    Node<Integer> n3 = new Node<>(3);

    Node<Integer> head = n1; // no need for new, basically head is reference to n1.
    n1.next = n2;
    n2.next = n3;

    // Traversing a linked list
    ll.traverse(head);

    // Inserting a node
    head = ll.insert(8, 2, head);
    ll.traverse(head);
    head = ll.insert(6, 0, head);
    ll.traverse(head);

    // Deleting a node
    head = ll.delete(3, head);
    ll.traverse(head);
    head = ll.delete(0, head);
    ll.traverse(head);
  }
}


class Node<T> {
  T data;
  Node<T> next; // This is a reference to the next node
                    // Class object; -> Returns reference to the object
                    // Exactly similiar to pointer to the object living in some part of memory.

  // Constructor
  Node (T data) {
    this.data = data;
    this.next = null; // Always do this yourself
                      // You might forget to do this in the end
                      // If need to overwritten you will do it anyways
  }

  // Goto ptr just before, and connect ptr.next with ptr.next.next
  // Case pos = 0
  // Linked List length exceeded?
  // REMEMBER: pos-1
  static Node<Integer> delete(int pos, Node<Integer> ptr) {
    Node<Integer> head = ptr;
    
    // Handling case of head
    if (pos == 0) return ptr.next;
    
    for (int i = 0; i < pos-1; i++) {
      ptr = ptr.next;
        // Handling linked list size limit
      if (ptr == null) {
        System.out.println("Linked List size exceeded");
        return ptr;
      }
    }

    ptr.next = ptr.next.next; // bypass the node to be deleted
                              // It will be taken up by garbage collector
    return head;
  }
  
  // connect toAdd.next to ptr.next, connect ptr.next to toAdd
  // Case pos = 0
  // Linked List length exceeded?
  // REMEMBER: pos-1
  static Node<Integer> insert(int data, int pos, Node<Integer> ptr) {
    Node<Integer> toAdd = new Node<>(data);
    Node<Integer> head = ptr;

    if (pos == 0) {
      toAdd.next = ptr;
      return toAdd;
    }
      
    // Traversing to the node just before the node needs to be added
    for (int i = 0; i < pos-1; i++) {
      ptr = ptr.next; 
      if (ptr == null) {
        System.out.println("Linked List size exceeded");
        return head;
      }
    }
    
    toAdd.next = ptr.next; // Connecting toAdd with old next of current pointer
                           // ptr -> oldNext
                           //         ^
                           //        /
                           //     toAdd
    ptr.next = toAdd; // toAdd becomes the new next
                      // ptr    oldNext
                      //  \      /
                      //   toAdd
                      //
    return head;
  }
  
  // Print till pointer becomes null
  static void traverse(Node<Integer> ptr) {
    while (ptr != null){ 
      System.out.print(ptr.data+" ");
      ptr = ptr.next;
    }
    System.out.println();
  }
}
