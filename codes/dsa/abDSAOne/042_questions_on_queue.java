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
    n[6].down = n[10]; n[7].down = n[11]; n[8].down = n[12];

    // Linking - Layer 3
    n[12].next = n[13];
    n[11].down = n[14]; n[12].down = n[15];

    // Linking - Layer 4
    n[15].next = n[16];

    // Solution
    qOne(n[0]);
  }

  // O(N) - O(N)
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
