package practice.practice4;

public class LinkedList {
    
    class ListNode {    
        private int value;
        private ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }
    
    public int length(ListNode head) {
        int length = 0;
        //ListNode curr = head;
        while(head != null) {
            length++;
            head = head.next;
        }
        return length;
    }
    
    
    public ListNode getIndex(ListNode head, int idx) {
        //ListNode curr = head;
//        for(int i = 0; i <= idx; i++) {
//            if(head == null) {
//                return null;
//            }
//            head = head.next;
//        }
//        return head;
        while(head != null && idx > 0) {
            head = head.next;
            idx--;
        }
        return head;
    }
    
    public ListNode appendHead(ListNode head, int value) {
//        if(head == null) {
//            return new ListNode(value);
//        }
        ListNode newHead = new ListNode(value);
        newHead.next = head;
        return newHead;
    }
    
    public ListNode appendTail(ListNode head, int value) {
        if(head == null) {
            return new ListNode(value);
        }
        ListNode curr = head;
        while(curr != null && curr.next != null) {
            curr = curr.next;
        }
        curr.next = new ListNode(value);
        return head;
    }
    
    
    public static void main(String[] args) {
        
    }

}
