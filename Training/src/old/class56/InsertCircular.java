package old.class56;

public class InsertCircular {
    
    static class ListNode {
        int value;
        ListNode next;
        public ListNode(int value) {
            this.value = value;
        }
    }
    
    public ListNode insertIntoCircular(ListNode head, int target) {
        if(head == null) {
            return new ListNode(target);
        }
        ListNode curr = head;
        //case 1: target is less than head
        if(target < head.value) {
            //1, reach the end
            while(curr.next != head) {
                curr = curr.next;
            }
            //2, insert
            return insert(target, curr);
        }
        //case 2: target is larger than head
        while(curr.next != head) {
            if(target > curr.value && target <= curr.next.value) {
                //insert
                insert(target, curr);
                return head;
            }
            curr = curr.next;
        }
        //reach the end
        insert(target, curr);
        return head;
    }
    
    private ListNode insert(int target, ListNode curr) {
        ListNode newNode = new ListNode(target);
        newNode.next = curr.next;
        curr.next = newNode;
        return newNode;
    }

    public static void main(String[] args) {
        ListNode hd1 = new ListNode(1);
        ListNode hd2 = new ListNode(2);
        ListNode hd3 = new ListNode(3);
        ListNode hd4 = new ListNode(5);
        hd1.next = hd2;
        hd2.next = hd3;
        hd3.next = hd4;
        hd4.next = hd1;
        
        InsertCircular ic = new InsertCircular();
        ListNode newNode = ic.insertIntoCircular(hd1, 4);
        System.out.println("test");
    }

}
