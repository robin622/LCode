package class6;

import class6.InsertANodeForCircularSorted.ListNode;

public class RemoveNode {

    class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value = value;
        }
    }
    
    public ListNode removeNodes(ListNode head, int target){
        //if(head==null || (head.value==target && head.next==null)){
        //    return null;
        //}
//        ListNode dummyHead = new ListNode(-1);
//        ListNode curr = dummyHead;
//        curr.next = head;
//        while(curr!=null && curr.next!=null){
//            if(curr.next.value==target){
//                curr.next = curr.next.next;
//            }
//            curr = curr.next;
//        }
//        return dummyHead.next;
        
        ListNode dummyHead = new ListNode(-1);
        ListNode curr = dummyHead;
        while(head!=null){
            if(head.value!=target){
                curr.next = head;
                curr = curr.next;
            }
            head = head.next;
        }
        //unlink
        curr.next = null;
        return dummyHead.next;
    }
    
    public static void main(String[] args) {
        RemoveNode sf = new RemoveNode();
        ListNode n1 = sf.new ListNode(5);
        ListNode n2 = sf.new ListNode(2);
        ListNode n3 = sf.new ListNode(5);
        ListNode n4 = sf.new ListNode(4);
        ListNode n5 = sf.new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        
        ListNode nd =sf.removeNodes(n1, 5);
        System.out.println(nd);

    }

}
