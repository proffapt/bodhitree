// Counting of level starts from 0, and that of height from 1.
// So, basically ROOT node is LEVEL 0, HEIGHT 1.
//
// Number of max nodes at level i = 2^i
// Number of max nodes with a height h = (2^h) - 1
//
// Ways of implementing it:
//    - Arrays: Method was seen in HEAP.
//    - Node (Linked List kinda thing)

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    createTree();
  }

  static Node createTree(){
    Scanner s = new Scanner(System.in);

    System.out.print("Enter data: ");
    Node root = new Node(s.nextInt());

    if (root.data == -1) return null;

    System.out.println("Enter left of "+root.data);
    root.left = createTree();

    System.out.println("Enter right of "+root.data);
    root.right = createTree();

    return root;
  }
}

class Node {
  int data;
  Node left;
  Node right;

  Node(int data){
    this.data = data;
    left = null;
    right = null;
  }
}
