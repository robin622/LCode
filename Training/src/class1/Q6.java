package class1;

public class Q6 {

    
    public int[] getCloestKTarget(int[] arr, int target, int K){
        if(arr==null || arr.length==0 || K==0) return null;
        int left = getLargestSmaller(arr, target);
        int right = left+1;
        int[] ret = new int[K];
        //inti 
        for(int i=0;i<ret.length;i++){
            ret[i] = -1;
        }
        int p = 0;
        for(int i=0;i<K;i++){
            if(right>arr.length-1 || (left>=0 && 
                    (Math.abs(arr[left]-target)) < (Math.abs(arr[right]-target)))){
                if(left>=0){ //assumption here: K's size is smaller than size of array
                    ret[p++] = left--;
                }
            } else {
                if(right<arr.length){
                    ret[p++] = right++;
                }
            }
        }
        return ret;
    }
    
    
    private int getLargestSmaller(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;
        while(left+1<right){
            int mid = left + ((right-left)>>1);
            if(arr[mid]==target){
                return mid;
            } else if(arr[mid]<target){
                left = mid;
            } else {
                right = mid -1;
            }
        }
        if(arr[right]<target){
            return right;
        }
        if(arr[left]<target){
            return left;
        }
        return -1;
    }


    public static void main(String[] args) {
        Q6 q4 = new Q6();
        //int[] arr = new int[]{1,2,3,4,5,7,8,10};
        int[] arr = new int[]{4,5,7};
        int[] arrs = q4.getCloestKTarget(arr, 5, 10);
        for(int i: arrs){
            System.out.println(i);
        }
    }
    
    
    // first time
//    public int[] getCloestKTarget(int[] arr, int target, int K){
//        int start = 0;
//        int end = arr.length-1;
//        int closest = -1;
//        boolean b = false;
//        int[] ret = new int[K];
//        int m = 0;
//        while(start+1<end){
//            int middle = start + (end-start)/2;
//            if(arr[middle]==target){
//                closest = middle;
//                b = true;
//                break;
//            } else if(arr[middle]<target){
//                start = middle;
//            } else {
//                end = middle;
//            }
//        }
//        if(!b){ 
//            if(Math.abs(arr[start]-target) > Math.abs(arr[end]-target)){
//                closest = end;
//            } else {
//                closest = start;
//            }
//            
//        }
//        //search two directions from closest point
//        ret[m++] = arr[closest];
//        int left = closest-1;
//        int right = closest+1;
//        while(m<K){
//            int leftDistance = Math.abs(arr[left]-target);
//            int rightDistance = Math.abs(arr[right]-target);
//            if( leftDistance > rightDistance){
//                ret[m++] = arr[right];
//                right++;
//            } else if (leftDistance < rightDistance){
//                ret[m++] = arr[left];
//                left--;
//            } else {
//                ret[m++] = arr[left];
//                if(m<K){
//                    ret[m++] = arr[right];
//                }
//                left--;
//                right++;
//            }
//        }
//        return ret;
//    }
    
      // second time
//    public int[] getCloestKTarget(int[] arr, int target, int K){
//        int[] result = new int[K];
//        
//        //get cloest one
//        int left = 0;
//        int right = arr.length-1;
//        while(left+1<right){
//            int mid = left + ((right-left)>>2);
//            if(arr[mid]==target){
//                left = mid;
//                right = mid+1;
//                break;
//            } else if(arr[mid]<target){
//                left = mid;
//            } else {
//                right = mid;
//            }
//        }
//        
//        int indexOfResult = 0;
//        while(indexOfResult<K){
//            if(Math.abs(arr[left]-target) < Math.abs(arr[right]-target)){
//                result[indexOfResult++] = arr[left--];
//            } else if(Math.abs(arr[left]-target) > Math.abs(arr[right]-target)){
//                result[indexOfResult++] = arr[right++];
//            } else {
//                result[indexOfResult++] = arr[left--];
//                if(indexOfResult==K){
//                    break;
//                } else {
//                    result[indexOfResult++] = arr[right++];
//                }
//            }
//        }
//        return result;
//    }

}
