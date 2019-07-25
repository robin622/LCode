package regularclass.binarysearch;

public class Q8 {
    //A[] = {2,5,7,10,13}
    //B[] = {1,3,4,13,20,29}
    //k = 5
   
    public int getKthSmallest(int[] A, int[] B, int k){
        return getKthSmallest(A, 0, B, 0, k);
    }

    private int getKthSmallest(int[] a, int aStart, int[] b, int bStart, int k) {
        if(aStart>=a.length){
            return b[bStart+k-1];
        }
        if(bStart>=b.length){
            return a[aStart+k-1];
        }
        if(k==1){
            return Math.min(a[aStart], b[bStart]);
        }
        
        int middleOfA = aStart + k/2 -1;
        int middleOfB = bStart + k/2 -1;
        
        int aval = middleOfA>=a.length ? Integer.MAX_VALUE : a[middleOfA];
        int bval = middleOfB>=b.length ? Integer.MAX_VALUE : b[middleOfB];
        
        if(aval<=bval){
            return getKthSmallest(a, middleOfA+1, b, bStart, k-k/2);
        } else {
            return getKthSmallest(a, aStart, b, middleOfB+1, k-k/2);
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    private int getKthSmallest(int[] A, int[] B, int aIndex, int bIndex, int k){
//       
//    }
    
    
    
//    private int getKthSmallest(int[] A, int[] B, int aIndex, int bIndex, int k){
//        if(aIndex>=A.length){
//            return B[bIndex+k-1];
//        }
//        if(bIndex>=B.length){
//            return A[aIndex+k-1];
//        }
//        if(k==1){
//            return A[aIndex]<B[bIndex]?A[aIndex]:B[bIndex];
//        }
//        
//        int amid = aIndex + k/2-1;
//        int bmid = bIndex + k/2-1;
//        
//        int aval = amid >= A.length ? Integer.MAX_VALUE : A[amid];
//        int bval = bmid >= B.length ? Integer.MAX_VALUE : B[bmid];
//        
//        if(aval < bval){
//            return getKthSmallest(A, B, amid+1, bIndex, k-k/2);
//        } else {
//            return getKthSmallest(A, B, aIndex, bmid+1, k-k/2);
//        }
//    }
}
