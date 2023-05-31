# Basics

- Can be uni-directional or bi-directional.
- uni-directional will be pointing to one vertex always, but bi-directional might be pointing to both or __none__.
- There also is a concept of weighted graph, in it the contribution of all edges will not be same, if not mention contribution of each edge is same. Contribution can be considered as equivalent to length of the edge.

# Representation

 There basically are two ways to depict a graph for computers.

## Adjacency Matrix 

- Inefficient than the later.
- Create a n*n matrix (where n is the number of vertices in the graph)
- Fill 1 if the two vertices are connected directly, otherwise 0.
- O(Vertices^2) space

> **Note** Preferred for dense graphs (highly connected)

Just suppose that the graph has 5 nodes named from 0 to 4
The basic idea will just be to mark the (source, destination) coordinate as 1,
if it is a bi-directional edge then along with that also mark the (destination, source) as 1.
    
```java
class Main{
 public static void main(String[] args){
    int v = 5;
    int e = 10;

    int[][] a = new int[v][v];
 }

 static void addEdge(int[][] a, int source, int destination){
     a[source][destination] = 1;
     a[destination][source] = 1;
 }
}
```


## Adjacency List 

- Array (Array list) of linked lists.
- O(2 * Edges + vertices)
- Arraylist contains a linked list, with all the nodes which can be reached via the head node linked together in a list.

> **Note** Preferred for sparse graphs (lessly connected)

Just suppose that the graph has 5 nodes named from 0 to 4
The basic idea will just be to mark the (source, destination) coordinate as 1,
if it is a bi-directional edge then along with that also mark the (destination, source) as 1.

```java
class Main{
 public static void main(String[] args){
    int v = 5;
    int e = 10;

    ArrayList<LinkedList<Integer>> list = new ArrayList<>();
 }

 static void addEdge(ArrayList<LinkedList<Integer>> a , int source, int destination){
     // Fist get the head of the list using .get(i) function, which gets the element stored in i'th index.
     // Then what you will get will be a linked list obviously, extend it by adding the destination into the list by .add(destination)
     a.get(source).add(destination);
     a.get(source).add(destination);
 }
}
```
