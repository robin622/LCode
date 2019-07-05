package class8;

import java.util.LinkedList;

public class Q1 {

    public void sort(LinkedList<Integer> s1) {
        LinkedList<Integer> s2 = new LinkedList<Integer>();
        LinkedList<Integer> s3 = new LinkedList<Integer>();
        if(s1==null || s1.size()<=2){
            return;
        }
        sort(s1, s2, s3, s1.size());
    }
    
    //question ?
    // how to make order elements free of affection ? 
    // Length can limit the depth it goes, so no problem. 
    // s1 is the original which will be ordered later. 
    // s2 is the second half which will be ordered. 
    // s3 is the cache 
    private void sort(LinkedList<Integer> s1, LinkedList<Integer> s2, LinkedList<Integer> s3, int length){
        if(length<=1){
            return;
        }
        
        int leftNum = length/2;
        int rightNum = length - length/2;
        for(int i=0;i<leftNum;i++) {
            s2.offerFirst(s1.pollFirst());
        }
        
        sort(s1, s2, s3, rightNum);
        sort(s2, s1, s3, leftNum);
        
        int i = 0; //s2
        int j = 0; //s1
        while(i<leftNum && j<rightNum){
            if(s1.peekFirst() < s2.peekFirst()) {
                s3.offerFirst(s1.pollFirst());
                j++;
            } else {
                s3.offerFirst(s2.pollFirst());
                i++;
            }
        }
        while(i<leftNum) {
            s3.offerFirst(s2.pollFirst());
            i++;
        }
        while(j<rightNum) {
            s3.offerFirst(s1.pollFirst());
            j++;
        }
        
        for(int m = 0; m <length; m++) {
            s1.offerFirst(s3.pollFirst());
        }
    }
    
    //TC: O(n^2), SC: O(1)
//    public void sort(LinkedList<Integer> s1) {
//      if(s1==null || s1.size() < 2) {
//        return;
//      }
//      LinkedList<Integer> s2 = new LinkedList<Integer>();
//      LinkedList<Integer> s3 = new LinkedList<Integer>();
//      int totalSize = s1.size();
//      while(s3.size() < totalSize) {
//        int globalMin = Integer.MAX_VALUE; 
//        int count = 0;
//        //get globalmax
//        while(!s1.isEmpty()) {
//          int curr = s1.pollFirst();
//          if(curr < globalMin){
//            globalMin = curr;
//            count = 1;
//          } else if(curr == globalMin) {
//            count++;
//          }
//          s2.offerFirst(curr);
//        }
//        //save to s3
//        for(int i = 0; i < count; i++){
//          s3.offerFirst(globalMin);
//        }
//        //save back to s1 from s2
//        while(!s2.isEmpty()) {
//          int curr = s2.pollFirst();
//          if(curr != globalMin) {
//            s1.offerFirst(curr);
//          }
//        }
//      }
//      
//      //save to S1
//      for(int i=0; i < totalSize; i++) {
//        s1.offerFirst(s3.pollFirst());
//      }
//    }
    
    
    
    // first time
//    public void sort(LinkedList<Integer> s1) {
//        LinkedList<Integer> s2 = new LinkedList<Integer>();
//        LinkedList<Integer> s3 = new LinkedList<Integer>();
//        sort(s1, s2, s3, s1.size());
//    }
    
//    private void sort(LinkedList<Integer> s1, LinkedList<Integer> s2, LinkedList<Integer> s3, int length){
//        if(length<=1){
//            return;
//        }
//        int mid1 = length/2;
//        int mid2 = length - length/2;
//        for(int i=0; i < mid1; i++) {
//            s2.offerFirst(s1.pollFirst());
//        }
//        
//        sort(s1, s2, s3, mid2);
//        sort(s2, s1, s3, mid1);
//        int i=0;
//        int j=0;
//        while(i < mid1 && j < mid2) {
//            if(s2.peekFirst() < s1.peekFirst()) {
//                s3.offerFirst(s2.pollFirst());
//                i++;
//            } else {
//                s3.offerFirst(s1.pollFirst());
//                j++;
//            }
//        }
//        while(i < mid1){
//            s3.offerFirst(s2.pollFirst());
//            i++;
//        }
//        while(j < mid2){
//            s3.offerFirst(s1.pollFirst());
//            j++;
//        }
//        
//        for(int index=0; index < length; index++){
//            s1.offerFirst(s3.pollFirst());
//        }
//    }

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        LinkedList<Integer> s1 = new LinkedList<>();
        s1.add(1);
        s1.add(4);
        s1.add(2);
        s1.add(6);
        s1.add(5);
        q1.sort(s1);
        System.out.println("s1 is:");
    }

}
