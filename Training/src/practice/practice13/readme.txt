Map/Set/Hash

1, key can not be duplicate

Set
1, HashSet
2, TreeSet
3, LinkedHashSet (hashSet + doubly linked list)

Map
1, HashMap
2, TreeMap
3, LinkedHashMap

V put(K key, V value)
V get(Object key)
V remove(Object key)
boolean containsKey(Object key)

continasValue(Object value) : O(n)

HashTable vs HashMap
1, HashMap allows one null key. 
2, Vector and HashTable are thread safe. 

How to deal with collision ?
1, separate chaining (close addressing)
2, Open addressing (linear probing)

Open addressing 
1, insert, go below until find an empty space. 
2, search, go below and compare until find the entry or encounter empty. 
3, delete, same logic. (not really delete, just mark it)

HashMap can only has one null key, it is always mapped to bucket 0. 

==
determine if two primitive types have the same value. 
determine if two references pointed to the same object. 

equals()( == >> equals, but equals != "==")
*** it can be overridden ***

How to implement good HashCode ?
a * 31 * 31 + b.hashCode() * 31 + c.hashCode() 

HashMap 
for Hash, when rehashing, it is not related to the capacity, because the overall space is still the same. But make the data
spread on buckets more evenly, which lead to higher efficiency.  



