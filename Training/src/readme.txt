https://google.github.io/styleguide/javaguide.html

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


 