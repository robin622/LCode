package old.class9;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  
  class Pair {
    int value;
    int counter;
    Pair(int value, int counter) {
      this.value = value;
      this.counter = counter;
    }
  }

  //TC: O(m + n + nlogm) SC: O(m+n)
  public List<Integer> common(int[] A, int[] B) {
    List<Integer> result = new ArrayList<>();
    if(A == null || B == null || A.length == 0 || B.length == 0) {
      return result;
    }
    List<Pair> listOfA = new ArrayList<>();
    addElementsToList(listOfA, A);
    List<Pair> listOfB = new ArrayList<>();
    addElementsToList(listOfB, B);

    List<Pair> arrForBinarySearch = listOfA;
    List<Pair> arrForTraversal = listOfB;
    if(listOfA.size() < listOfB.size()) {
      arrForBinarySearch = listOfB;
      arrForTraversal = listOfA;
    } 
    for(Pair p : arrForTraversal) {
      Pair pair = binarySearch(p, arrForBinarySearch);
      if(pair != null) {
        for(int i = 0; i < pair.counter; i++) {
          result.add(pair.value);
        }
      }
    }
    return result;
  }

  private Pair binarySearch(Pair p, List<Pair> arr) {
    int start = 0;
    int end = arr.size() - 1;
    while(start <= end) {
      int mid = start + ((end - start) >> 1);
      Pair curr = arr.get(mid);
      if(curr.value == p.value) {
        return new Pair(p.value, Math.min(curr.counter, p.counter));
      } else if(curr.value < p.value) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return null;
  }


  private void addElementsToList(List<Pair> listOfA, int[] A) {
    int counter = 1;
    int prev = A[0];
    for(int i = 1; i < A.length; i++) {
      if(A[i] != prev) {
        listOfA.add(new Pair(prev, counter));
        prev = A[i];
        counter = 1;
      } else {
        counter++;
      }
    }
    if(counter != 0) {
      listOfA.add(new Pair(prev, counter));
    }
  }
  
  public static void main(String[] args){
      Solution s = new Solution();
      s.common(new int[]{1,2,3,4,5}, new int[]{2,3,5,9});
  }
}
