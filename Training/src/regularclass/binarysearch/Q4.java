package regularclass.binarysearch;

public class Q4 {

    // this is OK
//    public int getFirstTarget(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start < end) {
//            int middle = start + (end - start) / 2; //this is becuase for java, a/b will get
//            if (arr[middle] == target) {           // integer without considering the fraction. 
//                end = middle;
//            } else if (arr[middle] < target) {
//                start = middle + 1;
//            } else {
//                end = middle - 1;
//            }
//        }
//        return arr[end] == target ? end : -1;
//    }
    
    
    public int getFirstTarget(int[] arr, int target) {
        if(arr==null || arr.length==0) return -1;
        int left = 0;
        int right = arr.length;
        while(left+1<right){
            int mid = left + ((right-left)>>1);
            if(arr[mid]==target){
                right = mid;
            } else if(arr[mid]<target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(arr[left]==target){
            return left;
        }
        if(arr[right]==target){
            return right;
        }
        return -1;
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        int[] arr = new int[] {2,3,3,4,4,4};
        System.out.println(q4.getFirstTarget(arr, 4));
    }

    // first time
    // public int getFirstTarget(int[] arr, int target) {
    // int start = 0;
    // int end = arr.length - 1;
    // while (start +1 < end) {
    // int middle = start + (end - start) / 2;
    // if (arr[middle] == target) {
    // end = middle;
    // } else if (arr[middle] < target) {
    // start = middle + 1;
    // } else {
    // end = middle - 1;
    // }
    // }
    // if(arr[start]==target){
    // return start;
    // }
    // if(arr[end]==target){
    // return end;
    // }
    // return -1;
    // }
    
//    public int getFirstTarget(int[] arr, int target) {
//        if (arr == null || arr.length == 0)
//            return -1;
//        int left = 0;
//        int right = arr.length - 1;
//        while (left + 1 < right) {
//            int mid = left + ((right - left) >> 1);
//            if (arr[mid] == target) {
//                right = mid;
//            } else if (arr[mid] < target) {
//                left = mid + 1;
//            } else {
//                right = mid - 1;
//            }
//        }
//        if (arr[left] == target) {
//            return left;
//        }
//        if (arr[right] == target) {
//            return right;
//        }
//        return -1;
//    }

}
