import java.util.*;

class Main {
  public static void main(String[] args) {
    // Constructing the tree
    Node node = null;
    Node bt = node.myTree();

    // Q6 - Right view of a binary tree
    // Very fundamental changes for getting the left view, more or less similar
    qSix(bt);
    System.out.println();
  }
  
  static void qSix(Node root) {
    if(root == null) return;

    ArrayDeque<Node> q = new ArrayDeque<>();

    q.offer(root);
    Node end = new Node(-1);
    q.offer(end);

    while(!q.isEmpty()){
      Node removed = q.poll();

      if (removed == end) {
          System.out.println();
          if (!q.isEmpty())
              q.offer(end);
      }
      else {
          System.out.print(removed.data + " ");

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
