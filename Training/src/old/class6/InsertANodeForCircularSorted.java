package old.class6;

public class InsertANodeForCircularSorted {
    
    class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value = value;
        }
    }
    
    public ListNode insertANodeOnCircularLinkedList(ListNode head, int value){
        ListNode insertedNode = new ListNode(value);
        if(head==null || head.value >= value){
            insertedNode.next = head;
            return insertedNode;
        }
        ListNode curr = head;
        while(curr.next!=head && curr.next.value < value){
            curr = curr.next;
        }
        //insert
        insertedNode.next = curr.next;
        curr.next = insertedNode;
        return head;
    }
    
    public static void main(String[] args) {
        InsertANodeForCircularSorted sf = new InsertANodeForCircularSorted();
        ListNode n1 = sf.new ListNode(1);
        ListNode n2 = sf.new ListNode(2);
        ListNode n3 = sf.new ListNode(3);
        ListNode n4 = sf.new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n1;
        sf.insertANodeOnCircularLinkedList(n1, 4);

    }

}
