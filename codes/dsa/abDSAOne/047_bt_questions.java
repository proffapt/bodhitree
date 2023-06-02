import java.util.*;

class Main {
  public static void main(String[] args) {
    // Constructing the tree
    Node node = null;
    Node bt = node.myTree();
    
    // Q1 - Height of Binary Tree
    System.out.println(qOne(bt));

    // Q2 - Size of a Binary Tree
    System.out.println(qTwo(bt));

    // Q3 - Maximum in a Binary Tree
    System.out.println(qThree(bt));

    // Q4 - Level Order Traversal
    // 0 12 345
    qFour(bt);
  }
  
  static void qFour(Node root){
    ArrayDeque<Node> q = new ArrayDeque<>();
  }
  
  static int qThree(Node root){
    if (root == null) return Integer.MIN_VALUE;

    return Math.max(Math.max(qThree(root.left), qThree(root.right)), root.data);
  }

  static int qTwo(Node root){
    if (root == null) return 0;
    
    return qTwo(root.left) + qTwo(root.right) + 1;
  }

  static int qOne(Node root){
    if (root == null) return 0;
    
    return Math.max(qOne(root.left), qOne(root.right)) + 1;
  }
}

class Node {
  int data;
  Node right, left;

  Node(int data){
    this.data = data;
    this.right = null;
    this.left = null;
  }

  // Output Binary tree: 
  //        0
  //      /   \
  //     1     2
  //    /     / \
  //   3     4   5
  static Node myTree(){
    Node[] bt = new Node[6];
    for (int i = 0; i< bt.length; i++)
      bt[i] = new Node(i);

    bt[0].left = bt[1];
    bt[1].left = bt[3];
    bt[2].left = bt[4];
    bt[0].right = bt[2];
    bt[2].right = bt[5];

    return bt[0];
  }
}
