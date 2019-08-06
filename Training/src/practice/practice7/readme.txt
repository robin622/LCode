
Graph
Vertex, Edge (V, E)

1, difference between graph and tree

Trees come in the category of DAG : Directed Acyclic Graphs
https://www.geeksforgeeks.org/difference-between-graph-and-tree/

2, how to represent
(1) class GraphNode {
  int key;
  List<GraphNode> neighbors;
  public GraphNode(int key) {
    this.key = key;
    neighbors = new ArrayList<>();
  }
}
(2) Adjacency list
linkedList or arrayList
List<List<Integer>> graph


(3) Adjacency matrix


3, traversal of binary tree
preorder / inorder / postorder

BST
search - O(height) worst case O(n), average O(logn)
insert - O(height) worst case O(n), average O(logn)
remove - O(height) worse case O(n), average O(logn)

Self-Balancing Binary Search Tree
AVL tree, Red-Black Tree etc. 

Red-Black Tree
in Java: TreeMap/TreeSet
in C++ : map/set

Duplicated nodes in BST ?

Tail Recursion
the last execution statement is the recursive call. 









