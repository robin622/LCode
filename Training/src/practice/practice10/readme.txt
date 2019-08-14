Implementing heaps

why choose flatten complete binary tree to represent a heap ?
transform array to a heap in place

we only use array to represent a heap and do some manipulation in place. 
we can get the minimum value with O(1), O(logn) to insert or delete a value. 

percolateUp()

percolateDown()

Heapify implementation

Sorting algorithm
Arrays.sort(primitve) // primitive quicksort
Arrays.sort(object)   // object    mergesort

mergeSort is stable 
if two elements with same values, after sorting, the order keeps. 

heapSort(unstable)
time: O(nlogn) Space: O(1)

why not used a lot ?
1, Runtime Overhead (high constant)
2, Poor locality (swap from first to last)
3, Hard to parallelize / distribute

