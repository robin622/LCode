package practice.practice6;

public class Queue2 {
    
    //using circular array to implement a queue
    private static int head;
    private static int tail;
    private static int size;
    private static int[] array;
    
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
    
//    public Queue2(int cap) {
//        arr = new int[cap+1];
//        head = 0;
//        tail = 1;
//    }
//    
//    public boolean offer(int value) {
//        if(head == tail) {
//            //full
//            return false;
//        }
//        arr[tail] = value;
//        tail = ((tail+1) % arr.length);
//        return true;
//    }
//    
//    public Integer poll() {
//        if(head == tail-1) {
//            return null;
//        }
//        Integer result = arr[head+1];
//        head = ((head + 1) % arr.length);
//        return result;
//    }
//    
//    public Integer peek() {
//        if(head == tail-1) {
//            return null;
//        }
//        return arr[head];
//    }
//    
//    public boolean isEmpty() {
//        return size == 0;
//    }
//    
//    public int size() {
//        return size;
//    }
    
    public static void main(String[] args) {
        Queue2 q2 = new Queue2(4);
        q2.offer(3);
        q2.offer(4);
        q2.offer(5);
        q2.offer(1);
        q2.poll();
        q2.offer(7);
        //for(int m : arr) {
        //    System.out.println(m);
        //}
        if(tail > head) {
            for(int i = head; i <= tail; i++) {
                System.out.println(array[i]);
            }
        } else {
            for(int i = head+1; i < array.length; i++) {
                System.out.println(array[i]);
            }
            for(int i = 0; i < tail; i++) {
                System.out.println(array[i]);
            }
        }
        
    }
}

//}
