package firstsemester.classes.binarysearch;

public class Q7 {

    public int getSmallestLargerThanTarget(int[] arr, int target){
        if(arr==null || arr.length==0) return -1;
        int left = 0;
        int right = arr.length-1;
        while(left+1<right){
            int mid = left + ((right-left)>>1);
            if(arr[mid]==target){
                left = mid+1;
            } else if(arr[mid]>target){
                right = mid;
            } else {
                left = mid+1;
            }
        }
        
        if(arr[left]>target){
            return left;
        }
        if(arr[right]>target){
            return right;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Q7 q4 = new Q7();
        int[] arr = new int[]{5,7,8};
        int val = q4.getSmallestLargerThanTarget(arr, 6);
        System.out.println(val);
    }
    
    
    
    //second time 
//    public int getSmallestLargerThanTarget(int[] arr, int target){
//        if(arr==null||arr.length==0){
//            return -1;
//        }
//        int left = 0;
//        int right = arr.length-1;
//        while(left<right){
//            int mid = left + ((right-left)>>1);
//            if(arr[mid]==target){
//                left = mid+1;
//            } else if(arr[mid]<target){
//                left = mid+1;
//            } else {
//                right = mid;
//            }
//        }
//        if(arr[left]>target){
//            return left;
//        }
//        return -1;
//    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //first time
//    public int getSmallestLargerThanTarget(int[] arr, int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start < end){
//            int middle = start + (end-start)/2;
//            if(arr[middle]<=target){
//                start = middle+1;
//            } else {
//                end = middle;
//            }
//        }
//    }

}
