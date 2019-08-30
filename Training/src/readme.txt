1, communication skills ****
2, transformation questions 

题不在多,而在深入 !!!
最高的标准要求自己 !!!

https://google.github.io/styleguide/javaguide.html

How to answer a question ?
1, Clarification
   a. sorted ? ascending/descending
   (if input is an array, think about if the array is sorted, ascending or descending, and duplicate elements)
   (if input is an matrix, think about matrix is null, matrix.length = 0, matrix[0].lenght = 0)
2, Examples

3, Solution
   a. Assumptions
   b. Input/output(signature)
   c. Corner cases
   d. Algorithm
   e. Time/Space complexity
   
4, Coding

5, Test
   a. Test corner cases: empty, 0, 1, 2 elements
   b. Test general cases

Speak out loud about your thinking process. Be careful about the communication practices. 

Round Down 
向下取整

面试关键： 
要说出思维方式 ！！！

做题关键
知其然，知其所以然

讲Code要点：
1, Document your assumptions
2, Explain your approach and how you intent to solve the problem (high - intermediate - details)
3, Provide code comments where applicable
4, Explain the big-O run time complexity of your solution. Justify your answer. 
5, Identify any additional data structures you used and justify why you used them. 
6, Only provide your best answer to each part of the question. 

******* communication ********

terminology
member variable = field
local variable
parameters
method 

Escape character -- 转义字符
 
 Java type chart
 1, boolean <=1 byte
 2, byte = 1 byte
 3, char = 2 byte
 4, short = 2 byte
 5, int = 4 byte
 6, long = 8 byte
 7, float = 4 byte
 8, double = 8 byte
 
How to crack question ?
1, Clarification
2, Examples
3, Solution
   a, Assumptions
   b, Input/Output(signature)
   c, Corner cases
   d, Algorithm
   e, Time/Space complexity
4, Coding
5, Test
   a, Test corner cases: empty, 0, 1, 2 elements
   b, Test general cases
  
 
 https://docs.oracle.com/javase/tutorial/
 1, Block indentation = 2 spaces
 2, Empty blocks: No concise empty blocks in a multi-block statement
 XXXXXXXXXXXXXXXXX
  try {
    doSomething();
  } catch (Exception e) {}
 3, Column limit: 100
 4, Indent continuation lines at least +4 spaces
 5, Switch comments: indented +2
 
 heapify
 To build a heap
 two versions
 1, build the heap from bottom to top    O(nlogn)
 get each element from the array and insert it into the heap, for insertion, it inserted at the end of the heap, 
 and then, siftup, with the increase height of the tree, more expensive siftup operations happens. 
 
 2, build the heap from top to bottom (in unsorted array)    O(n) = repair the heap from the last parent
 for the second last parents, swap at most once, TC is O((n/2) * 1)
 for the third last parents, swap at most twice, TC is O((n/4) * 2)
 So, sum up, 
 n/2 * 1 + n/4 *2 + n/8 * 3 + n/16 * 4 + ... + 1 * logn = O(n)

Lesson 13 is important
1, BST deletion 
2, iteration implementation of PreOrderTraversal/InOrderTraversal/PostOrderTraversal

Operand / Operator 
 