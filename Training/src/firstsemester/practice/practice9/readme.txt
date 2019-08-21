Heap in Java (PriorityQueue)

Comparator vs Comparable

Comparator is more like a utility tool. 
Comparable is the property of object. 

Comparator : compare
Comparable : compareTo

PriorityQueue<Cell> minHeap = new PriorityQueue<>(k, new MyComparator());
if K<=0, illegalArgumnetException will be thrown in the constructor. 

PriorityQueue<Cell> minHeap = new PriorityQueue<>(Collections<> c);
when c is passed, heapify will be called. 

Collections.reverseOrder()

How to use lamda expression?

in real, max heap should be used !!! for k smallest elements.  (online algorithm !!!)
maxHeap time complexity is low. 

online algorithm : stream processing
offline algorithm : batch processing

