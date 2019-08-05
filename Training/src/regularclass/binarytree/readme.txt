Binary Tree
Definition: at most two children node. 

Balanced binary tree: is commonly defined as a binary tree in which the depth of the left and right subtrees of every node
differ by 1 or less. 

Complete binary tree: is a binary tree in which every level, except possibly the last is completely filled, and all nodes
are as far left as possible. (it can be saved in an array) 

perfect binary tree: no missing nodes.

Conclusion 1: if a tree has n number of nodes, and it is balanced, then the height of the tree = O(logn).
Conclusion 2: if a tree is a complete tree, then it must be a balanced tree. 

Binary search tree: for every single node in the tree, the values in its left subtree are all smaller than its value, 
the values in its right subtree are all larger than its value. (no duplicate elements are allowed)

if there is some duplicates, add counter field in each node!!!

Trick: 所有前面的node的个数总和都没有最后一层node的个数多,因此我们分析tree的time complexity的时候往往只看最后一层node的个数!!!