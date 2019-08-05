package old.class8;

import java.util.ArrayDeque;
import java.util.Deque;

public class Q2 {

    //TC: 
    // implement a queue with two stacks
    Deque<Integer> in;
    Deque<Integer> out;
    
    public Q2() {
        in = new ArrayDeque<Integer>();
        out = new ArrayDeque<Integer>();
    }

    public Integer poll() {
        if(out.isEmpty()){
            move();
        }
        return out.isEmpty() ? null : out.pollFirst();
    }

    private void move() {
        while(!in.isEmpty()){
            out.offerFirst(in.pollFirst());
        }
    }

    public void offer(int element) {
        in.offerFirst(element);
    }

    public Integer peek() {
        if(out.isEmpty()){
            move();
        }
        return out.isEmpty() ? null : out.peekFirst();
    }

    public int size() {
        return in.size()+out.size();
    }

    public boolean isEmpty() {
        return size()==0;
    }

    // public class Solution {
    // //insert into elements
    // Deque<Integer> in;
    // //take elements out
    // Deque<Integer> out;
    //
    // public Solution() {
    // in = new ArrayDeque<Integer>();
    // out = new ArrayDeque<Integer>();
    // }
    //
    // public Integer poll() {
    // if(out.isEmpty()){
    // move();
    // }
    // return out.isEmpty() ? null : out.pop();
    // }
    //
    // private void move(){
    // //load all elemnts from in
    // while(!in.isEmpty()){
    // out.push(in.pop());
    // }
    // }
    //
    // public void offer(int element) {
    // in.push(element);
    // }
    //
    // public Integer peek() {
    // if(out.isEmpty()){
    // move();
    // }
    // return out.isEmpty() ? null : out.peek();
    // }
    //
    // public int size() {
    // return in.size() + out.size();
    // }
    //
    // public boolean isEmpty() {
    // return size()==0 ? true: false;
    // }
    // }

}
