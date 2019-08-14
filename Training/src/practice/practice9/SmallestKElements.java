package practice.practice9;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class SmallestKElements {
    
    public int[] smallestKElements(int[] array, int k) {
        if(array == null || k == 0) {
            return null;
        } 
        int[] retArray = new int[k];
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(16, new Comparator<Integer>(){
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1 == o2) {
//                    return 0;
//                } else if(o1 < o2) {
//                    return 1;
//                } else {
//                    return -1;
//                }
//            }
//        });
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(16, Collections.reverseOrder());
        for(int i = 0; i < array.length; i++) {
            if(i < k) {
                maxHeap.offer(array[i]);
            } else {
                if(array[i] < maxHeap.peek()) {
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        for(int i = k-1; i >=0; i--) {
            retArray[i] = maxHeap.poll();
        }
        return retArray;
    }
    
    public static void main(String[] args) {
        SmallestKElements obj = new SmallestKElements();
        int[] arr = obj.smallestKElements(new int[]{5,2,1,7,6,9}, 3);
        for(int m : arr) {
            System.out.println(m);
        }

    }

}
