package class8;

import java.util.LinkedList;

public class Q1_2 {

    public void sort(LinkedList<Integer> s1) {
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        int count = 0;
        int totalSize = s1.size();
        while(count < totalSize){
            int globalMin = Integer.MAX_VALUE;
            int counter = 0; //in case duplication
            while(!s1.isEmpty()) {
                int curr = s1.pollFirst();
                if(curr < globalMin) {
                    globalMin = curr;
                    counter = 1;
                } else if(curr == globalMin) {
                    counter++;
                }
                s2.offerFirst(curr);
            }
            
            while(!s2.isEmpty() && s2.size() > count){
                int curr = s2.pollFirst();
                if(curr != globalMin) {
                    s1.offerFirst(curr);
                }
            }
            
            for(int i=0; i < counter; i++) {
                s2.offerFirst(globalMin);
            }
            count = s2.size();
        }
        for(int i=0; i < totalSize; i++) {
            s1.offerFirst(s2.pollFirst());
        }
    }

    public static void main(String[] args) {
        Q1_2 q1 = new Q1_2();
        LinkedList<Integer> s1 = new LinkedList<>();
        s1.add(1);
        s1.add(4);
        s1.add(4);
        s1.add(2);
        s1.add(6);
        s1.add(5);
        q1.sort(s1);
        System.out.println("s1 is:");
    }

}
