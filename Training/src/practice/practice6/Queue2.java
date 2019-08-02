package practice.practice6;

//using array
//public class Queue2 {
//    private int[] arr;
//    private int size;
//    private int head;
//    private int tail;
    
//    public Queue2(int cap) {
//        arr = new int[cap];
//        size = 0;
//        head = -1;
//        tail = -1;
//    }
//    
//    public void offer(int value) {
//
//    }
//    
//    public Integer poll() {
//        
//    }
//    
//    public Integer peek() {
//
//    }
//    
//    public boolean isEmpty() {
//
//    }
//    
//    public int size() {
//
//    }
public class Queue2 {
    
    //using circular array to implement a queue
    private int head;
    private int tail;
    private int size;
    private int[] array;
    
    public Queue2(int capacity) {
        array = new int[capacity];
        head = 0;
        tail = 0;
        size = 0;
    }
    
    public boolean offer(int value) {
        if(size == array.length) {
            return false;
        }
        array[head] = value;
        head = (head + 1) % array.length;
        size++;
        return true;
    }
    
    public Integer poll() {
        if(size == 0) {
            return null;
        }
        int ret = array[tail];
        tail = (tail + 1) % array.length;
        size--;
        return ret;
    }
    
    public Integer peek() {
        if(size == 0) {
            return null;
        }
        return array[tail];
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public int size() {
        return size;
    }
    
    public static void main(String[] args) {
        String[] expectedArr = "41C,41D,25A25A,".split(",");
        for(String s: expectedArr) {
            System.out.println("|" + s + "|");
        }
        
    }
}

//}
