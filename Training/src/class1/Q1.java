package class1;

public class Q1 {
    
    //binary search method
    public int binarySearch(int[] arr, int target){
        if(arr==null||arr.length==0) return -1;
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            int mid = left + ((right-left)>>1);
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]<target){
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return -1;
    }
    
    //main method
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,5,6,8};
        Q1 q1 = new Q1();
        System.out.println(q1.binarySearch(arr, 4));
        System.out.println(q1.binarySearch(arr, 2));
    }

}








//return index or -1 if you can not find it
// 1, search space decreases
// 2, target should not be ruled out
//public int binarySearch(int[] arr, int target){
//    if(arr==null || arr.length==0) return -1;
//    int left = 0;
//    int right = arr.length-1;
//    while(left <= right){
//        int middle = left + ((right-left)>>1);
//        if(arr[middle]==target){
//            return middle;
//        } else if(arr[middle]<target){
//            left = middle+1;  
//        } else {
//            right = middle-1;
//        }
//    }
//    return -1;
//}



//First time

//public int binarySearch(int[] arr, int target){
//    if(arr==null || arr.length==0) return -1;
//    int start = 0;
//    int end = arr.length-1;
//    while(start<=end){  //why, one element
//        int middle = start + (end-start)/2;
//        if(arr[middle]==target){
//            return middle;
//        }else if(arr[middle]<target){
//            start = middle+1;    //why not middle, one element, arr[7], target=5
//        } else {
//            end = middle-1;      //why not middle, one element, arr[2], target=5
//        }
//    }
//    return -1;
//}