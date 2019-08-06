
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






