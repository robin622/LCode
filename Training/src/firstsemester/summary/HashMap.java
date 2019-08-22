package firstsemester.summary;

import java.util.Map;

public class HashMap {
    
    static class Entry{
        String key;
        java.lang.Integer value;
        Entry next;
        public Entry(String key, Integer value) {
            this.key = key;
            this.value = value;
        }
    }
    
    //by using separate chaining to implement HashMap
    private static double factor = 0.75;
    private static Entry[] array;
    private static int num;
    
    public HashMap(int size) {
        array = new Entry[size];
        num = 0;
    }
    
    public HashMap() {
        this(10);
    }
    
    public Integer put(String key, Integer value){
        if(num == array.length * factor) {
            //rehash
            Entry[] arrayNew = new Entry[array.length * 2];
            rehash(arrayNew);
            array = arrayNew;
        }
        return addToMap(key, value, array);
    }
    
    private Integer addToMap(String key, Integer value, Entry[] array) {
        int index = getBucketNum(key);
        if(array[index] == null) {
            array[index] = new Entry(key, value);
        } else {
            Entry curr = array[index];
            while(curr.next != null) {
                if(curr.key.equals(key)){
                    Integer ret = curr.value;
                    curr.value = value;
                    return ret;
                } 
                curr = curr.next;
            }
            curr.next = new Entry(key, value);
        } 
        return null;
    }

    private int getBucketNum(String key) {
        int hashCode = key.hashCode();
        return hashCode % array.length;
    }

    private void rehash(Entry[] arrayNew) {
        for(int i = 0; i < array.length; i++) {
            Entry entry = array[i];
            addToMap(entry.key, entry.value, arrayNew);
        }
    }

    public Integer get(String key) {
        int index = getBucketNum(key);
        if(array[index] == null) {
            return null;
        } 
        Entry curr = array[index];
        while(curr != null) {
            if(curr.key.equals(key)){
                return curr.value;
            } 
            curr = curr.next;
        }
        return null;
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("123", 321);
        map.put("14", 41);
        
        System.out.println(map.get("14"));
    }

}
