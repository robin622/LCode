package practice.practice14;

public class HashMap {
     
    class Entry<String, Integer> {
        String key;
        Integer value;
        Entry<String, Integer> next;
        
        public Entry(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }
    
    Entry<String, Integer>[] buckets;
    private final static int INIT_SIZE = 100;
    private final static double THRESHOLD = 0.75;
            
    public HashMap() {
        this(INIT_SIZE);
    }

    public HashMap(int size){
        buckets = new Entry[size];
    }
    
    public Integer put(String key, Integer value) {
        //1, calculate hashCode from key
        int hashCode = key.hashCode();
        //2, get bucket index
        int bucketIndex = hashCode % buckets.length;
        if(buckets[bucketIndex] == null) {
            buckets[bucketIndex] = new Entry(key, value);
        } else {
            Entry<String, Integer> curr = buckets[bucketIndex];
            Entry<String, Integer> prev = null;
            while(curr != null) {
                if(curr.key.equals(key)) {
                    if(!curr.value.equals(value)) {
                        buckets[bucketIndex] = new Entry(key, value);
                        return curr.value;
                    } 
                    return value;
                }
                prev = curr;
                curr = curr.next;
            }
            if(prev != null) {
                prev.next = new Entry(key, value); 
            }
        }
        return null;
    }
    
    public Integer get(String key) {
      //1, calculate hashCode from key
        int hashCode = key.hashCode();
        //2, get bucket index
        int bucketIndex = hashCode % buckets.length;
        if(buckets[bucketIndex] != null) {
            Entry<String, Integer> curr = buckets[bucketIndex];
            while(curr != null) {
                if(curr.key.equals(key)) {
                    return curr.value;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        
    }

}
