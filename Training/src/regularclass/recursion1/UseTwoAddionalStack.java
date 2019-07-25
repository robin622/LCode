package regularclass.recursion1;

import java.util.Stack;

public class UseTwoAddionalStack {

    public Stack<Integer> selectionSort(Stack<Integer> stack){
        Stack<Integer> buffer = new Stack<Integer>();
        Stack<Integer> result = new Stack<Integer>();
        while(!stack.isEmpty() || !buffer.isEmpty()){
            int min = Integer.MAX_VALUE;
            if(stack.isEmpty()){
                while(!buffer.isEmpty()){
                    Integer itg = buffer.pop();
                    if(!result.isEmpty() && result.peek()==itg){
                        continue;
                    }
                    stack.push(itg);
                    min = Math.min(min, itg);
                }
            } else {
                while(!stack.isEmpty()){
                    Integer itg = stack.pop();
                    if(!result.isEmpty() && result.peek()==itg){
                        continue;
                    }
                    buffer.push(itg);
                    min = Math.min(min, itg);
                }
            }
            if(min!=Integer.MAX_VALUE){
                result.push(min);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        UseTwoAddionalStack ss = new UseTwoAddionalStack();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(1);
        stack.push(3);
        stack.push(4);
        Stack<Integer> result = ss.selectionSort(stack);
        while(!result.isEmpty()){
            System.out.println(result.pop());
        }
    }

}
