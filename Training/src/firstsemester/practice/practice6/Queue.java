package firstsemester.practice.practice6;

//using Linkedlist
public class Queue {
    
    class ListNode{
        private int value;
        private ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }
    
    private ListNode head;
    private ListNode tail;
    private int size;
    
    public Queue() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public void offer(int value) {
        ListNode nd = new ListNode(value);
        if(head == null) {
            head = nd;
            tail = nd;
        } else {
            head.next = nd;
            head = head.next;
        }
        size++;
    }
    
    public Integer poll() {
        if(tail == null) {
            return null;
        } else {
            size--;
            int ret = tail.value;
            tail = tail.next;
            return ret;
        }
        
    }
    
    public Integer peek() {
        if(tail == null) {
            return null;
        } else {
            return tail.value;
        }
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public int size() {
        return size;
    }
    
    public static void main(String[] args) {
        //int itg = Integer.MAX_VALUE;
        //System.out.println("max is: " + itg);
        //System.out.println("max + 1 is: " + (itg+1));
    }

}
