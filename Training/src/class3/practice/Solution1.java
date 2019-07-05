package class3.practice;

import class3.practice.Solution.ListNode;

/**
 * class ListNode { public int value; public ListNode next; public ListNode(int
 * value) { this.value = value; next = null; } }
 */
public class Solution1 {

    class ListNode {
        public int value;
        public ListNode next;
        public ListNode(int value) {
            this.value = value;
            next = null;
        }
    }

    public ListNode mergeSort(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode lastNodeOfMid = getLastNodeOfMid(head);
        ListNode secondHalfNode = lastNodeOfMid.next;
        lastNodeOfMid.next = null;
        ListNode first = mergeSort(head);
        ListNode second = mergeSort(secondHalfNode);
        return combination(first, second);
        //head = newNode;
        //return head;
        
    }

    private ListNode combination(ListNode head, ListNode tail) {
        ListNode first = head;
        ListNode second = tail;
        ListNode fake = new ListNode(-1);
        ListNode current = fake;
        while (first != null && second != null) {
            if (first.value < second.value) {
                current.next = new ListNode(first.value);
                first = first.next;
            } else {
                current.next = new ListNode(second.value);
                second = second.next;
            }
            current = current.next;
        }
        if (first != null) {
            current.next = first;
        }
        if (second != null) {
            current.next = second;
        }
        return fake.next;
    }

    private ListNode getLastNodeOfMid(ListNode head) {
        if (head.next == null)
            return head;
        ListNode slow = head;
        ListNode lastOfslow = null;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            lastOfslow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return lastOfslow;
    }
    
    public static void main(String[] args) {
        Solution1 s1 = new Solution1();
        ListNode n1 = s1.new ListNode(5);
        ListNode n2 = s1.new ListNode(4);
        ListNode n3 = s1.new ListNode(1);
        ListNode n4 = s1.new ListNode(2);
        ListNode n5 = s1.new ListNode(6);
        ListNode n6 = s1.new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        
        ListNode ret = s1.mergeSort(n1);
        System.out.println("test");
    }
}
