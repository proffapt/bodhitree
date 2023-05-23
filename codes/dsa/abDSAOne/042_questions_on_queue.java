import java.util.*;

class Main {
  public static void main(String[] args) {
    // Q1 - Flatenning a multilevel linked list
    // Node creation
    Node[] n = new Node[17];
    for (int i = 0; i < 17; i++) n[i] = new Node(i+1);

    // Linking - Layer 1
    for (int i = 0; i < 4; i++) n[i].next = n[i+1];
    n[0].down = n[5]; n[3].down = n[8];
    
    // Linking - Layer 2
    for (int i = 5; i < 7; i++) n[i].next = n[i+1];
    n[8].next = n[9];
    for (int i = 6; i < 9; i++) n[i].down = n[i+4];

    // Linking - Layer 3
    n[12].next = n[13];
    for (int i = 11; i < 13; i++) n[i].down = n[i+3];

    // Linking - Layer 4
    n[15].next = n[16];

    // Solution(s)
    qOne(n[0]);
    System.out.println();
    
    qOneOptimised(n[0]);
  }

  // Modifies the original linkedlist, 
  // Hence does the job without using anyspace.
  // How?
  //
  // print using last pointer
  static void qOneOptimised(Node head){
    // Things with linked list are always optimised using a second pointer!
    // Mostly slow and fast, but obviously depends on context.

    Node curr = head, last = head; 
    
    // Modifying the linked list via connecting via next wherever needed
    while (true){
      last = getLastNode(last);
      curr = getNodeWithDownNode(curr);
      
      // Since curr lags behind last, curr agar next 
      // karte karte, null hogaya, that is whole list is traversed
      if (curr == null) break;
      
      last.next = curr.down;
      curr = curr.next;
    }
    
    // Printing the modified linked list
    while (head != null){
      System.out.print(head.data+" ");
      head = head.next;
    }
  }

  // Get the next node from left having down pointer
  static Node getNodeWithDownNode(Node ptr){
    // There is a case where next karte karte, ptr becomes null
    // then when you try down you will get error, hence do a check
    while (ptr != null && ptr.down == null) ptr = ptr.next;
    
    return ptr;
  }

  // Get the last element, just before the link breaks(.next is null) for next node.
  static Node getLastNode(Node ptr){
    while (ptr.next != null) ptr = ptr.next;
    
    return ptr;
  }
  
  // O(N) - O(N)
  // Using Queue data structure - extra space
  static void qOne(Node head){
    Queue<Node> q = new ArrayDeque<>();
    q.offer(head);
    
    while (!q.isEmpty()){
      Node ptr = q.poll();
      while (ptr != null) {
        System.out.print(ptr.data+" ");

        if (ptr.down != null) q.offer(ptr.down);

        ptr = ptr.next;
      }
    }
  }
}

class Node{
  int data;
  Node next;
  Node down;

  Node(int data){
    this.data = data;
    this.next = null;
    this.down = null;
  }
}
