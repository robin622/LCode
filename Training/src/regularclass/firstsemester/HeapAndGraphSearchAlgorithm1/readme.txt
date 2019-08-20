
(Min-Max)Heap: (ProirityQueue)

1, complete binary tree is balanced tree
2, any node is smaller than its descendents

can be saved as array !!!!
1, index of lChild = myIndex * 2 + 1
2, index of rChild = myIndex * 2 + 2
3, index of parent = (myIndex - 1) / 2

*** G/F : implement a min(max) heap ***

when insert or delete an element, it is strongly associated with the last element.

insert/delete/update(when you know where it is) : O(logn)

heapify : O(n) remember time complexity

C: clarify
A: assumption
R: result
T: test

Dijkstra algorithm
Lazy implementation way ???

properties of dijkstra algorithm
1, one node can be expanded once and only once. 
2, one node can be generated more than once. 
3, all the cost of the nodes that are expanded are monotonically non-decreasing. 
4, time complexity for a graph with n node and the connectivity of the node is constant O(nlogn). 
5, when a node is popped out for expansion, its value is fixed which is equal to the shortest distance from the start node.





