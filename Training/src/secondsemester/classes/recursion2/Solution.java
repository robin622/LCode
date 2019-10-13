package secondsemester.classes.recursion2;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<Integer> spiral(int[][] matrix) {
    List<Integer> list = new ArrayList<>();
    if(matrix.length == 0) {
      return list;
    }
    traverse(list, matrix, 0, matrix.length);
    return list;
  }

  private void traverse(List<Integer> list, int[][] matrix, int left, int length) {
    if(length <=0) { 
      return;
    }
    //top
    for(int i = left; i < left + length - 1; i++) { 
      list.add(matrix[left][i]);
    }
    //right
    for(int i = left; i < left + length - 1; i++) {
      list.add(matrix[i][length-1+left]);
    }
    //bottom
    for(int i = left + length - 1; i > left ; i--) {
      list.add(matrix[length-1+left][i]);
    }
    //left
    for(int i = left + length - 1; i > left ; i--) {
      list.add(matrix[i][left]);
    }
    traverse(list, matrix, left+1, length-2);
  }
  
  public static void main(String[] args) {
      Solution s = new Solution();
      int[][] matrix = {
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15},
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}, 
              {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}};
      List<Integer> lst = s.spiral(matrix);
      //System.out.println(lst);
      int[] test = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 11, 10, 9, 8, 7, 6, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11, 11, 11, 11, 11, 10, 9, 8, 7, 6, 5, 5, 5, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 10, 9, 8, 7, 6, 6, 6, 6, 7, 8, 9, 9, 9, 8, 7, 7};
      
      for(int n = 1; n <=15; n++){
          int m = 0;
          for(int i = 0; i < test.length; i++) {
         
              if(test[i] == n){
                  m++;
              }
              
          }
          System.out.println(m);
      }
      
  }
  
}
