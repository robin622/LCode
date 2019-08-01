Summary of Stack/Queue/Dequeue

1, How to use Stack in Java ?

(1) Class Stack
push(E item), pop(), peek(), empty()
Stack s = new Stack();

(2) Class ArrayDeque or LinkedList
Deque<Integer> stack = new ArrayDeque<Integer>();
Deque<Integer> stack = new LinkedList<Integer>();

Difference
1, Deque(ArrayDeque) is implemented in JDK 1.6, but Stack is implemented
in JDK 1.0. 

2, ArrayDeque is faster than LinkedList used as Queue. 
   ArrayDeque is faster than Stack used as Stack. 
   http://brianandstuff.com/2016/12/12/java-arraydeque-vs-linkedlist/

3, ArrayDeque does not allow null, linkedlist allows. 

4, LinkedList implements a List interface, but ArrayDeque does not. 


2, How to use Queue in Java ?
add(offer), remove(poll), element(peek)

(1) Queue is an interface
 
(2) class LinkedList or ArrayDeque
Deque<Integer> queue = new ArrayDeque<Integer>();
Deque<Integer> queue = new LinkedList<Integer>();


So, use ArrayDeque as both Stack and Queue in Java. 
Use ArrayDeque as Stack
push = addFirst, pop = removeFirst, peek = peekFirst

Use ArrayDeque as queue
offer = offerLast, poll = pollFirst, peek = peekFirst


ArrayList
when removed, the size will not shrink because stable status will be kept. 

Time Complexity Analysis
LinkedList in java implementation (doubly linkedList, head and tail are kept)

Operation   /   ArrayList / LinkedList

(get at head/tail)  /  O(1)  /  O(1) 
get in middle  /  O(1)  /  O(n)
set at head/tail  / O(1)  /  O(1) 
set in middle  /  O(1)  / O(n)
add in middle  /  O(n)  /  O(n)
add at head  /  O(n)  /  O(1)
add at tail  /  O(1)(expand:O(n))  /  O(1)
remove at head  /  O(n)  /  O(1)
remove at tail  /  O(1)  / O(1)
remove at middle  /  O(n)  /  O(n)
size()  /  O(1)  /  O(1)
isEmpyt()  /  O(1)  /  O(1)


why amortized time ?
it captures the real time consumed in practical environment. 

when time complexity is similar between arraylist and linkedlist, use arraylist, the reason is: 
1, linkedlist consume more spaces
2, arraylist has better spatial locality

LinkedList is good for head/tail remove and add. (deque)

Stack and Vector are deprecated !!!

Dummy Head (when to use it ?)
1, the head could be changed when solving the problem
2, not sure yet which node will be head when constructing the list





