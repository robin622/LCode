package old.class1.exercises;
public class Solution2 {
  
  public int[] kClosest(int[] array, int target, int k) {
    if(array.length==0) return null;
    int idx = getLargestSmallerOrEqualIndex(array, target);
    int[] result = new int[k];
    //method two, search kth element in the array
    searchKthElement(array, idx, idx+1, k, target, result, 0);
    return result;
  }
  
  private void searchKthElement(int[] array, int aLeft, int bLeft, int k, int target, int[] result, int index){
    //base case               //aleft = 1, bleft = 2
    if(aLeft<0){
      for(int i=index;i<result.length;i++){
        result[i] = array[bLeft++];
      }
      return;
    }
    if(bLeft>=array.length){
      for(int i=index;i<result.length;i++){
        result[i] = array[aLeft--];
      }
      return;
    }
    if(k==1){
      if(target - array[aLeft] >= array[bLeft] - target){
        result[index] = array[bLeft];
      } else {
        result[index] = array[aLeft];
      }
      return;
    }
    
    int aVal = aLeft-k/2+1 < 0 ? Integer.MAX_VALUE : target - array[aLeft-k/2+1];
    int bVal = bLeft+k/2-1 > array.length-1 ? Integer.MAX_VALUE : array[bLeft+k/2-1] - target;
      
    if(aVal<=bVal){
      int temp = aLeft;
      for(int i=index;i<index+k/2;i++){
        result[i] = array[temp--];
      }
      searchKthElement(array, aLeft-k/2, bLeft, k-k/2, target, result, index+k/2);
    } else {
      int temp = bLeft;
      for(int i=index;i<index+k/2;i++){
        result[i] = array[temp++];
      }
      searchKthElement(array, aLeft, bLeft+k/2, k-k/2, target, result, index+k/2);
    } 
  }
  
  private int getLargestSmallerOrEqualIndex(int[] array, int target){
    int left = 0;
    int right = array.length-1;
    while(left+1<right){
      int mid = left + ((right-left)>>1);
      if(array[mid]==target){
        left = mid;
      } else if(array[mid]<target){
        left = mid;
      } else {
        right = mid -1;
      }
    }
    if(array[right]<=target){
      return right;
    }
    if(array[left]<=target){
      return left;
    }
    return -1;
  }
  
  public static void main(String[] args){
      int[] arr = new int[]{1,3,3,6,9,9,12,15};
      new Solution2().kClosest(arr, 10, 5);
  }
}
