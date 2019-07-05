package class1;

public class Q2 {
    
    public int[] binarySearchFor2D(int[][] arr, int target){
        if(arr==null || arr.length==0 || arr[0].length==0) return null;
        int left = 0;
        int rows = arr.length;
        int columns = arr[0].length;
        int right = rows * columns -1;
        while(left<=right){
            int mid = left + ((right-left)>>1);
            int row = mid/columns;
            int column = mid%columns;
            if(arr[row][column]==target){
                return new int[]{row, column};
            } else if(arr[row][column]<target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Q2 q2 = new Q2();
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int [] ret = q2.binarySearchFor2D(arr, 7);
        System.out.println(ret[0]);
        System.out.println(ret[1]);
    }
    
    
    
    //first time practice
//    public int[] binarySearchFor2D(int[][] arr, int target){
//        int start = 0;
//        int end = arr.length * arr[0].length -1;
//        while(start<=end){
//            int middle = start + (end-start)/2;
//            int row = middle/arr[0].length;
//            int column = middle%arr[0].length;
//            if(arr[row][column]==target){
//                return new int[]{row, column};
//            } else if(arr[row][column]<target){
//                start = middle+1;
//            } else {
//                end = middle-1;
//            }
//        }
//        return null;
//    }
    
//  public int[] binarySearchFor2D(int[][] arr, int target){
//  //binarysearch the first column
//  int start = 0;
//  int end = arr.length;
//  while(start<=end){
//      int middle = start + (end-start)/2;
//      if(arr[middle][0]==target){
//          return new int[]{0,middle};
//      } else if(arr[middle][0] < target){
//          if(arr[middle+1][0]>target){
//              int column = binarySearch(arr[middle], target);
//              return new int[]{middle, column};
//          }
//      } else {
//          if(arr[middle-1][0]<target){
//              int column = binarySearch(arr[middle-1], target);
//              return new int[]{middle-1, column};
//          }
//      }
//  }
//  return null;
//}
//
    
//  private int binarySearch(int[] arr, int target){
//  int start = 0;
//  int end = arr.length-1;
//  while(start<=end){
//      int middle = start + (end-start)/2;
//      if(arr[middle]==target){
//          return middle;
//      } else if(arr[middle]>target){
//          end = middle-1;
//      } else {
//          start = middle+1;
//      }
//  }
//  return -1;
//}
    
      //second time
//    public int[] binarySearchFor2D(int[][] arr, int target){
//        if(arr==null || arr.length==0 || arr[0].length==0) return null;
//        int left = 0;
//        int rows = arr.length;
//        int columns = arr[0].length;
//        int right = rows * columns -1;
//        while(left<=right){
//            int middle = left + ((right-left)>>1);
//            int row = middle/columns;
//            int column = middle%columns;
//            if(arr[row][column]==target){
//                return new int[]{row, column};
//            } else if(arr[row][column]<target){
//                left = middle+1;
//            } else {
//                right = middle-1;
//            }
//        }
//        return null;
//    }

}
