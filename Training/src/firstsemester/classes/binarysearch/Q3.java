package firstsemester.classes.binarysearch;

public class Q3 {
    
    public int searchClosestElement(int[] arr, int target){
        if(arr==null || arr.length==0) return -1;
        int left = 0;
        int right = arr.length-1;
        while(left+1<right){
            int mid = left + ((right-left)>>1);
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]<target){
                left = mid;
            } else {
                right = mid;
            }
        }
        return Math.abs(arr[left]-target) > Math.abs(arr[right]-target) ? right: left;
    }
    
    public static void main(String[] args) {
        Q3 q3 = new Q3();
        int[] arr = new int[]{1,2,3,7,14};
        System.out.println(q3.searchClosestElement(arr, 4));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    //first time
//    public int searchClosestElement(int[] arr, int target){
//        int start = 0;
//        int end = arr.length-1;
//        while(start+1<end){
//            int middle = start + (end-start)/2;
//            if(arr[middle]==target){
//                return middle;
//            } else if(arr[middle]<target){
//                start = middle;
//            } else {
//                end = middle;
//            }
//        }
//        return Math.abs(arr[start]-target) < Math.abs(arr[end]-target) ? start:end;
//    }
    
      //second time
//    public int searchClosestElement(int[] arr, int target){
//        if(arr==null || arr.length==0) return -1;
//        int left = 0;
//        int right = arr.length-1;
//        while(left+1<right){
//            int mid = left + ((right-left)>>1);
//            if(arr[mid]==target){
//                return mid;
//            } else if(arr[mid]<target){
//                left = mid;
//            } else {
//                right = mid;
//            }
//        }
//        
//        return Math.abs(arr[left]-target) > Math.abs(arr[right]-target) ? arr[right]: arr[left];
//    }

}
