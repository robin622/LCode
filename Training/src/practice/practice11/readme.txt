Class 11: practice problem
Review: List / Queue / Stack / Deque / ArrayList / LinkedList / ArrayDeque / PriorityQueue

           List
    /        |       \
   /         |        \
ArrayList   Stack     LinkedList

            Queue 
       /    |   \     \
      /   Deque  \     \
     /     / \    \     \
 LinkedList   ArrayQueue  PirorityQueue
 
List: 

- add(E e);
- add(int index, E e);
- E get(int index);
- remove(int index);
- remove(E e);
- set(int index, E e);
- int size();

Queue:
- offer(E e);
- E peek();
- E poll();

Deque:
- offerFirst(E e);
- offerLast(E e);
- E peekFirst();
- E peekLast();
- E pollFirst();
- E pollLast();

Collections.reveresOrder() can only be used when the Object is comparable !!!

when implement comparator - compare, check > and <, for ==, do it lastly because for Integer, == is not 
correct. 

Intern pool / Constant pool (for String and Integer !!!)
-128 to 127 will be put into constant pool. (equals is safest)

Import * is not recommended, because it will pollute the name space and efficiency is not good. 

white Board skills
1, variable name, method name and class name should be short 
2, use helper method a lot !!! (professional, easy to spread to other boards)

In java 8, why we need static method in interface ?
https://beginnersbook.com/2017/10/java-8-interface-changes-default-method-and-static-method/

it is good for backward compatibility.


 

