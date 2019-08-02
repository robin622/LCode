
package regularclass.stackQueue;

import java.util.LinkedList;
import java.util.List;

public class SortWith2Stacks {

    public void sort(LinkedList<Integer> s1) {
        if(s1 == null || s1.size() == 0) {
          return;
        } 
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        int size = s1.size();
        for(int i = 0; i < size; i++) {
          //1, pop up from s1 and push it into s2 and find the global min
          int globalMin = Integer.MAX_VALUE;
          int counter = 0;
          while(!s1.isEmpty()) { //1,2,3,4
            int currNum = s1.pop();
            if(currNum < globalMin) {
              globalMin = currNum;
              counter = 1;
            } else if(currNum == globalMin) {
              counter++;
            }
            s2.push(currNum); // 4, 3, 2, 1 g = 1
          }
          //2, pop up from s2 and push it back to s1
          while(!s2.isEmpty() && s2.peek() >= globalMin) {  //[4, 5, 3, 5, 2] g = 5, c = 2
            int currNum = s2.pop();
            if(currNum != globalMin) {
              s1.push(currNum); // 2, 3, 4
            }
          }
          //3, push the min to s2
          for(int j = 0; j < counter; j++) {
            s2.push(globalMin); // 1
          }
        }
        // push it back to s1
        while(!s2.isEmpty()) {
          s1.push(s2.pop());
        }
      }
    
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        SortWith2Stacks s = new SortWith2Stacks();
        s.sort(list);
        int size = list.size();
        for(int i = 0; i < size; i++) {
            System.out.println(list.pop());
        }
    }

}
