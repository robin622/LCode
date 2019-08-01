package practice.practice6;

//using array
public class Queue2 {
    private int[] arr;
    private int size;
    private int head;
    private int tail;
    
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
    
    public static void main(String[] args) {
        String[] expectedArr = "41C,41D,25A25A,".split(",");
        for(String s: expectedArr) {
            System.out.println("|" + s + "|");
        }
        
    }

}
