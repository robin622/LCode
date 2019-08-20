package regularclass.firstsemester.recursion1;

import java.util.Stack;

public class OneAddionalStack {

    //one stack solution
    public Stack<Integer> selectionSort(Stack<Integer> stack){
        Stack<Integer> result = new Stack<Integer>();
        int ele = 0;
        int size = stack.size();
        while(ele < size){
            int min = Integer.MAX_VALUE;
            while(!stack.isEmpty()){
                Integer itg = stack.pop();
                result.push(itg);
                min = Math.min(min, itg);
            } 
            while(result.size()>ele){
                Integer itg = result.pop();
                if(itg==min) continue;
                stack.push(itg);
            }
            ele++;
            result.push(min);
        }
        return result;
    }
    
    public static void main(String[] args) {
        OneAddionalStack ss = new OneAddionalStack();
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
