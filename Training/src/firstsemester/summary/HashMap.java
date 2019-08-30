package firstsemester.summary;

public class HashMap<K, V> {
    
    public static class Entry <K, V>{
        final K key;
        V value;
        Entry<K,V> next;
        
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    
    //by using separate chaining to implement HashMap
    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private Entry<K, V>[] array;
    private int size; //how many key-value pairs are stored in the hashmap
    private float loadFactor;
    
    public HashMap(int cap, float loafFactor) {
        if(cap <= 0) {
            throw new IllegalArgumentException("cap can not less than 0");
        }
        array = (Entry<K, V>[])new Entry[cap];
        this.size = 0;
        this.loadFactor = loafFactor;
    }
    
    public HashMap() {
        this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
    }
    
    public int size() {
        return size;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public V put(K key, V value){
        if(size >= array.length * loadFactor) {
            //rehash
            Entry<K, V>[] arrayNew = (Entry<K, V>[]) new Entry[array.length * 2];
            rehash(arrayNew);
            array = arrayNew;
        }
        return addToMap(key, value, array);
    }
    
    private V addToMap(K key, V value, Entry<K,V>[] array) {
        int index = getBucketNum(key);
        if(array[index] == null) {
            array[index] = new Entry<K,V>(key, value);
        } else {
            Entry<K,V> curr = array[index];
            while(curr.next != null) {
                if(curr.key.equals(key)){
                    V ret = curr.value;
                    curr.value = value;
                    return ret;
                } 
                curr = curr.next;
            }
            curr.next = new Entry<K,V>(key, value);
        } 
        size++;
        return null;
    }

    private int getBucketNum(K key) {
        int hashCode = hash(key);
        return hashCode % array.length;
    }
    
    private int hash(K key) {
        if(key == null) {
            return 0;
        }
        return key.hashCode() & 0x7FFFFFFF; ///!!!
    }

    private void rehash(Entry<K,V>[] arrayNew) {
        for(int i = 0; i < array.length; i++) {
            Entry<K,V> entry = array[i];
            addToMap(entry.key, entry.value, arrayNew);
        }
    }

    public V get(K key) {
        int index = getBucketNum(key);
        if(array[index] == null) {
            return null;
        } 
        Entry<K,V> curr = array[index];
        while(curr != null) {
            if(curr.key.equals(key)){
                return curr.value;
            } 
            curr = curr.next;
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("123", 321);
        map.put("14", 41);
        
        System.out.println(map.get("14"));
    }

}
