HashTable

           Average     Worst
           
Search     O(1)        O(n)

Insert     O(1)        O(n)

Delete     O(1)        O(n)

Hash function map a key to an index of an array by hashcode. 

Hash Collision solution 
1, Separate Chaining 
2, Open addressing (probe + rehash)

Why insert(delete) is O(n) worst case ?
when insert, you need to traverse each element in the linkedlist, if it exists, replace it.

When using hashtable, you need to analyze average and worst case time complexity !!!

XOR (不进位的加法)
1, commutative law
2, associative law
3, 0 xor a = a

Do not blindly use below: 
1, deleteCharAt(i)
2, subString(start, end) TC, SC O(n)
3, String1 + String2 TC, SC O(n + m)

两个挡板,三个区间,同向而行
物理意义!!!



