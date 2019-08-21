package firstsemester.practice.practice6;

//using Linkedlist
public class Stack {

    class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }
    
    private ListNode head;
    private int size;
    
    public Stack() {
        head = null;
        size = 0;
    }
    
    public void push(int val) {
        ListNode newNode = new ListNode(val);
//        if(head == null) {
//            head = newNode;
//        }else {
//            newNode.next = head;
//            head = newNode;
//        }
        newNode.next = head;
        head = newNode;
        size++;
    }
    
    public Integer pop() {
        if(head == null) {
            return null;
        } else {
            int ret = head.val;
            head = head.next;
            size--;
            return ret;
        }
    }
    
    public Integer peek() {
        if(head == null) {
            return null;
        }
        return head.val;
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public int size() {
        return size;
    }
    
    public static void main(String[] args) {
        
    }

}
