package class1;

public class Q5 {

//    public int getLastTarget(int[] arr, int target){
//        if(arr==null ||arr.length==0) return -1;
//        int left = 0;
//        int right = arr.length;
//        while(left<right){
//            int mid = left + ((right-left)>>1);
//            if(arr[mid]==target){
//                left = mid;   //may form infinite loop if mid is always equal to left. 
//            } else if(arr[mid]<target){
//                left = mid+1;
//            } else {
//                right = mid-1;
//            }
//        }
//        return arr[right]==target? right: -1;
//    }
    
    public int getLastTarget(int[] arr, int target){
        if(arr==null || arr.length==0) return -1;
        int left = 0;
        int right = arr.length-1;
        while(left+1<right){
            int mid = left + ((right-left)>>1);
            if(arr[mid]==target){
                left = mid;
            } else if(arr[mid]<target){
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        
        if(arr[right]==target){
            return right;
        }
        if(arr[left]==target){
            return left;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Q5 q4 = new Q5();
        int[] arr = new int[]{4, 4, 5, 5};
        System.out.println(q4.getLastTarget(arr, 5));
    }
    
    
    //first time
//    public int getLastTarget(int[] arr, int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start+1<end){
//            int middle = start + (end-start)/2;
//            if(arr[middle]==target){
//                start = middle;
//            } else if(arr[middle]<target){
//                start = middle+1;
//            } else {
//                end = middle-1;
//            }
//        }
//        if(arr[end]==target){
//            return end;
//        }
//        if(arr[start]==target){
//            return start;
//        }
//        return -1;
//    }
    
      // second time
//    public int getLastTarget(int[] arr, int target){
//        if(arr==null ||arr.length==0) return -1;
//        int left = 0;
//        int right = arr.length-1;
//        while(left+1<right){
//            int mid = left + ((right-left)>>1);
//            if(arr[mid]==target){
//                left = mid;   
//            } else if(arr[mid]<target){
//                left = mid+1;
//            } else {
//                right = mid-1;
//            }
//        }
//        
//        if(arr[right]==target){
//            return right;
//        }
//        if(arr[left]==target){
//            return left;
//        }
//        return -1;
//    }

}
