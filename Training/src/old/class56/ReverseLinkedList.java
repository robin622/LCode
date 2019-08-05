package old.class56;

public class ReverseLinkedList {
    
    static class ListNode {
      public int value;
      public ListNode next;
      public ListNode(int value) {
          this.value = value;
          next = null;
      }
    }
    
    public ListNode reverse(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
    
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        
        ListNode nn = new ReverseLinkedList().reverse(n1);
        while(nn != null) {
            System.out.println(nn.value+",");
            nn = nn.next;
        }
    }

}
