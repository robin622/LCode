package class3;
/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
    
  class ListNode {
      public int value;
      public ListNode next;
      public ListNode(int value) {
         this.value = value;
         next = null;
      }
  }
  public ListNode selectionSort(ListNode head) {
    if(head==null || head.next==null) return head;
    ListNode current = head;
    while(current!=null){
      int max = current.value;
      ListNode maxNode = current;
      ListNode next = current.next;
      while(next!=null){
        if(next.value>max){
          max = next.value;
          maxNode = next;
        }
      }
      swap(current, maxNode);
      current = current.next;
    }
    return head;
  }
  
  private void swap(ListNode n1, ListNode n2){
    int temp = n1.value;
    n1.value = n2.value;
    n2.value = temp;
  }
  
  public static void main(String[] args){
      Solution s = new Solution();
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
      
      s.selectionSort(n1);
  }
}
