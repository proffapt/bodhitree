/*
    BFS has same concept as that of Level Order Traversal in Binary Tree.
    It focuses on discovering the breadth of the graph first.
    What's breadt? 
      - All the vertices just after the current vertex are 1 Level
      - Then after them lies the 2nd Level

      According to it, we move onto the next level only after completely discovering the current level.
*/

import java.util.*

class Main {
  public static void main(String[] args) {
    // Graph to search - Creating via Adjacency List
    ArrayList<LinkedList<Integer>> adj = new ArrayList<>();
    // Initialising the ArrayList
    for (int i = 0; i < 6; i++) {
      adj.add(new ArrayList<Integer>());
    }
  }

  static void bfs(){
    
  }
}
