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


 

