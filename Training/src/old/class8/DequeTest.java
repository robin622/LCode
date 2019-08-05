package old.class8;

import java.util.ArrayDeque;
import java.util.Deque;

//ref: http://blog.jrwang.me/2016/java-collections-deque-arraydeque/

public class DequeTest {
    // for queue, (offer(), poll(), peek())
    // offerLast(), pollFirst(), peekFirst()
    
    //for stack (push, pop, peek)
    // offerFirst(), pollFirst(), peekFirst()
    
    // This class is likely to be faster than Stack when used as a stack,
    // and faster than LinkedList when used as a queue. 
    
    public static void main(String[] args){
        //Queue
        Deque<Integer> queue = new ArrayDeque<Integer>();
        queue.offerLast(1);
        queue.offerLast(2);
        while(!queue.isEmpty()){
            System.out.println(queue.peekFirst());
            queue.pollFirst();
        }
        
        //Stack
        Deque<Integer>  stack = new ArrayDeque<Integer>();
        stack.push(3);
        stack.push(4);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }
    
}
