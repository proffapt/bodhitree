// Observations
/*
    - Left always comes before Right
    - Name is directly connected to occurance of 'N' - aka node.
        - N in middle, L at first, R at last - Inorder (LNR)
        - N at last, L at first, R at middle - PostOrder
        - N at first, L at middle, R at last - PreOrder
 */
class Main {
  public static void main(String[] args) {
    // Getting the Binary Tree
    Node node = null;
    Node bt = node.myTree();

    // Inorder Traversal
    /*
        LNR - Left Node Right
        Output: 310 42 5

        Bottom to top, tilted lines
    */
    inorderTraversal(bt);
    System.out.println();
    
    // PreOrder Traversal
    /*
        NLR - Left Node Right
        Output: 013 24 5

        Top to bottom, tilted lines
    */
    preorderTraversal(bt);
    System.out.println();
    
    // PostOrder Traversal
    /*
        LRN - Left Node Right
        Output: 3 14 520

        Start from bottom left node, move up in rightwards tilted direction
        keep comting back in connected pattern to in zig-zag
    */
    postorderTraversal(bt);
    System.out.println();
  }

  static void inorderTraversal(Node root){
    if (root == null) return;
    
    inorderTraversal(root.left); // L - call function for root.left
    System.out.print(root.data+" "); // N - Print root.data
    inorderTraversal(root.right); // R - call function for root.right
  }
  
  static void preorderTraversal(Node root){
    if (root == null) return;
    
    System.out.print(root.data+" ");
    preorderTraversal(root.left);
    preorderTraversal(root.right);
  }
  
  static void postorderTraversal(Node root){
    if (root == null) return;
    
    postorderTraversal(root.left);
    postorderTraversal(root.right);
    System.out.print(root.data+" ");
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
