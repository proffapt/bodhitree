# Basics

- Can be uni-directional or bi-directional.
- uni-directional will be pointing to one vertex always, but bi-directional might be pointing to both or __none__.

# Representation

 There basically are two ways to depict a graph for computers.

## Adjacency Matrix 

- Inefficient than the later.
- Create a n*n matrix (where n is the number of vertices in the graph)
- Fill 1 if the two vertices are connected directly, otherwise 0.
- O(Vertices^2) space

> **Note** Preferred for dense graphs (highly connected)

## Adjacency List 

- Array (Array list) of linked lists.
- O(2 * Edges + vertices)
- Arraylist contains a linked list, with all the nodes which can be reached via the head node linked together in a list.

> **Note** Preferred for sparse graphs (lessly connected)
