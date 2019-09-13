package secondsemester.classes.recursion2;

public class ReverseLinkedListWithTwo {
    
    static class Node {
        int value;
        Node next;
        public Node(int val){
            this.value = val;
        }
    }
    
    public Node reverseLinkedListByTwo(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        Node subHead = reverseLinkedListByTwo(head.next.next);
        Node newHead = head.next;
        newHead.next = head;
        head.next = subHead;
        return newHead;
    }
    
    public static void main(String[] args) {
        ReverseLinkedListWithTwo t = new ReverseLinkedListWithTwo();
        ReverseLinkedListWithTwo.Node n1 = new ReverseLinkedListWithTwo.Node(1);
        ReverseLinkedListWithTwo.Node n2 = new ReverseLinkedListWithTwo.Node(2);
        ReverseLinkedListWithTwo.Node n3 = new ReverseLinkedListWithTwo.Node(3);
        n1.next = n2;
        n2.next = n3;
        ReverseLinkedListWithTwo.Node nd = t.reverseLinkedListByTwo(n1);
        while(nd != null) {
            System.out.println(nd.value);
            nd = nd.next;
        }
    }

}
