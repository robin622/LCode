package class8;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Q2_1 {

    //TC: 
    // implement a stack with two queues
    //TC: push: O(1), pop: O(n)
    Deque<Integer> inAndOut;
    Deque<Integer> out;
    public Q2_1() {
        inAndOut = new ArrayDeque<Integer>();
        out = new ArrayDeque<Integer>();
    }
    
    public Integer pop() {
        if(isEmpty()){
            return null;
        }
        if(inAndOut.size()!=0){
            return inAndOut.pollFirst();
        } else {
            move(out, inAndOut);
            return out.pollFirst();
        }
    }
    
    public void push(int element) {
        inAndOut.offerLast(element);
        if(inAndOut.size()>1){
            move(inAndOut, out);
        }
    }
    
    private void move(Deque<Integer> from, Deque<Integer> to){
        while(from.size()>1){
            to.offerLast(from.pollFirst());
        }
    }
    
    public Integer peek() {
        if(isEmpty()){
            return null;
        }
        if(inAndOut.size()!=0){
            return inAndOut.peekFirst();
        } else {
            move(out, inAndOut);
            return out.peekFirst();
        }
    }
    
    public Integer size() {
        return inAndOut.size() + out.size();
    }
    
    public boolean isEmpty() {
        return size()==0 ? true : false;
    }
    
    public static void main(String[] args) {
        Q2_1 q1_2 = new Q2_1();
        q1_2.push(1);
        q1_2.push(3);
        q1_2.push(2);
        System.out.println(q1_2.pop());
        System.out.println(q1_2.pop());
        System.out.println(q1_2.pop());
    }

}
