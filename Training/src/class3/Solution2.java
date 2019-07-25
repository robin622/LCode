package class3;

import class3.Solution.ListNode;

/**
 * class ListNode { public int value; public ListNode next; public ListNode(int
 * value) { this.value = value; next = null; } }
 */
public class Solution2 {

    class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
            next = null;
        }
    }

    public ListNode quickSort(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode lastPartitionNode = getLastPartition(head);
        ListNode next = lastPartitionNode.next;
        lastPartitionNode.next = null;
        ListNode firstHalf = quickSort(head);
        ListNode secondHalf = quickSort(next);
        ListNode current = firstHalf;
        while (current != null && current.next != null) {
            current = current.next;
        }
        current.next = secondHalf;
        return firstHalf;
    }

    private ListNode getLastPartition(ListNode head) {
        int length = getLength(head);
        int partition = getPartition(length);
        ListNode lastNode = switchWithLast(head, partition);
        ListNode i = head; // always point to the index which is larger than
                           // parition point
        int m = 0;
        ListNode j = i;
        int n = m;
        while (m < length - 1 && n < length - 1) {
            while (i.value < lastNode.value) {
                m++;
                i = i.next;
            }
            if (m == length - 1)
                break;
            j = i.next;
            n = m + 1;
            while (j.value > lastNode.value) {
                n++;
                j = j.next;
            }
            if (n == length - 1)
                break;
            swap(i, j);
        }
        // last swap
        swap(i, lastNode);

        return getPartitionNode(head, partition);
    }

    private ListNode getPartitionNode(ListNode head, int partition) {
        int tmp = 0;
        while (head != null) {
            if (tmp == partition) {
                return head;
            }
            tmp++;
            head = head.next;
        }
        return null;
    }

    private ListNode switchWithLast(ListNode head, int partition) {
        ListNode partitionNode = null;
        ListNode current = head;
        int idx = 0;
        while (current != null && current.next != null) {
            if (idx == partition) {
                partitionNode = current;
            }
            idx++;
            current = current.next;
        }
        swap(current, partitionNode);
        return current;
    }

    private void swap(ListNode n1, ListNode n2) {
        int temp = n1.value;
        n1.value = n2.value;
        n2.value = temp;
    }

    private int getPartition(int length) {
        return (int) (Math.random() * (length + 1));
    }

    private int getLength(ListNode head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }
    
    public static void main(String[] args){
        Solution2 s = new Solution2();
        ListNode n1 = s.new ListNode(5);
        ListNode n2 = s.new ListNode(4);
        ListNode n3 = s.new ListNode(1);
        ListNode n4 = s.new ListNode(2);
        ListNode n5 = s.new ListNode(6);
        ListNode n6 = s.new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        
        s.quickSort(n1);
    }

}
