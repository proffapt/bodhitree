// Counting of level starts from 0, and that of height from 1.
// So, basically ROOT node is LEVEL 0, HEIGHT 1.
//
// Number of max nodes at level i = 2^i
// Number of max nodes with a height h = (2^h) - 1
//
// Ways of implementing it:
//    - Arrays: Method was seen in HEAP.
//    - Node (Linked List kinda thing)


// Recursion in Binary Tree 
/*
    - The sub subproblems are ALWAYS going to be the LEFT sub-tree and Right sub-tree.
        - Forget everything now, you will have ONLY 3 NODES.
        - It directly means that the function is going to be called again for LEFT and RIGHT sub-trees.
    - The order will be decided on the basis of what you want to do.
        - f(LEFT) > Do stuff > f(RIGHT) => Means do stuff in left and then right
    
    NOTE: Via this method one can only do things in either, inorder, preorder or postorder because the recursive calling
          leads us to the bottom of the tree. Lever order is not possible via this method - will have to use queue for that.
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    createTree();
  }

  // Very important to understand how this recursion and recursive leap of faith are actually working.
  static Node createTree(){
    Scanner s = new Scanner(System.in);

    System.out.print("Enter data: ");
    Node root = new Node(s.nextInt());

    if (root.data == -1) return null; // Base case

    System.out.println("Enter left of "+root.data);
    root.left = createTree(); // Root ka left bana dega, mat socho kese banaya bas lake de diya
                              // Although it's like left ki tarah depth mein chale gaye then wahan se kiya
                              // This was how recursion worked here, but you don't have to think about it
                              // Just see it like root.left = left wale sub-tree ka node ke barabar hojayega
                              // woh left wala subtree kese bana, simple createTree function call karke

    System.out.println("Enter right of "+root.data);
    root.right = createTree(); // Root ka right bana dega, mat socho kese banaya bas lake de diya
                               // Same things from the left node ka setup


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
