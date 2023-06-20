import java.util.*;

class Main {
  public static void main(String[] args) {
    // Constructing the tree
    Node node = null;
    Node bt = node.myTree();

    // Q6 - Left view of a binary tree
    // Very fundamental changes for getting the left view, more or less similar
    System.out.print("Left View of Binary Tree = ");
    qSix(bt);
    System.out.println();

    // Q7 - Top view of binary tree
    System.out.print("Top View of Binary Tree = ");
    qSeven(bt);
    System.out.println();
  }

  static void qSeven(Node root){
    if(root == null) return;
    
    // Constructing the map first
    Map<Integer, Node> map = inOrder(root, 0);
    
    map.forEach((hd, node) -> System.out.print("(" + hd + "," + node.data + ") "));
  }

  // Doing InOrder Traversal, creating the map
  static Map<Integer, Node> inOrder(Node root, int hd){
    if(root == null) return null;
    
    Map<Integer, Node> map = new HashMap<>();
    
    inOrder(root.left, hd-1);
    System.out.println(root.data);
    map.put(hd, root);
    inOrder(root.right, hd+1);

    return map;
  }
  
  // remove `<-` lines and you will get right view of the binary tree
  static void qSix(Node root) {
    if(root == null) return;

    int element = -1;
    boolean filled = false; // <-
    ArrayDeque<Node> q = new ArrayDeque<>();

    q.offer(root);
    Node end = new Node(-1);
    q.offer(end);

    while(!q.isEmpty()){
      Node removed = q.poll();

      if (removed == end) {
          System.out.print(element + " ");
          if (!q.isEmpty())
              q.offer(end);
          filled = false; // <-
      }
      else {
          if (!filled){ // <-
            element = removed.data;
            filled = true; // <-
          } // <-

          if (removed.left != null)
              q.offer(removed.left);

          if (removed.right != null)
              q.offer(removed.right);
      }
    }
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
  //        /
  //       6
  static Node myTree() {
    Node[] bt = new Node[7];
    for (int i = 0; i < bt.length; i++)
        bt[i] = new Node(i);

    bt[0].left = bt[1];
    bt[1].left = bt[3];
    bt[0].right = bt[2];
    bt[2].left = bt[4];
    bt[2].right = bt[5];
    bt[5].left = bt[6];

    return bt[0];
  }

}
