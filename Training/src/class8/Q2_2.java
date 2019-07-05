package class8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Q2_2 {

    // implement a stack with a queue
    //TC: push : O(1), pop: O(n), SC: O(1) 
    Deque<Integer> queue;
    
    public Q2_2() {
        queue = new ArrayDeque<Integer>();
    }
    
    public Integer pop() {
        if(isEmpty()){
            return null;
        }
        move(queue, size()-1);
        return queue.pollFirst();
    }
    
    public void push(int element) {
        queue.offerLast(element);
    }
    
    private int move(Deque<Integer> queue, int times){
        for(int i=0;i<times;i++){
            queue.offerLast(queue.pollFirst());
        }
        return queue.peekFirst();
    }
    
    public Integer peek() {
        if(isEmpty()){
            return null;
        }
        int lastValue = move(queue, size()-1);
        move(queue,1);
        return lastValue;
    }
    
    public Integer size() {
        return queue.size();
    }
    
    public boolean isEmpty() {
        return size()==0 ? true : false;
    }
    
    public static void main(String[] args) {
        Q2_2 q1_2 = new Q2_2();
        q1_2.push(1);
        q1_2.push(3);
        q1_2.push(2);
        System.out.println(q1_2.pop());
        System.out.println(q1_2.pop());
        System.out.println(q1_2.pop());
    }

}
