package firstsemester.practice.practice6;

public class Stack2 {
    
    private int[] arr;
    private int head; //points to next available space
    
    public Stack2(){
        arr = new int[100];
        head = -1;
    }
    
    public void push(int val) {
        if(head == arr.length - 1) {
            throw new IndexOutOfBoundsException();
        }
        arr[++head] = val;
    }
    
    public Integer pop() {
        if(head == -1) {
            return null;
        }
        int ret = arr[head--];
        return ret;
    }
    
    public Integer peek() {
        if(head == -1) {
            return null;
        }
        return arr[head];
    }
    
    public boolean isEmpty() {
        return head == -1;
    }
    
    public static void main(String[] args) {
        
    }

}
