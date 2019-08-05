package old.class1.exercises;
public class Solution3 {
  
  public int search(int[] array, int target) {
    if(array==null||array.length==0) return -1;
    return search(array, target, 0, array.length-1);
  }
  
  private int search(int[] array, int target, int left, int right){
    if(left>right) return -1;
    if(left==right) return array[left] == target ? left : -1;
    int mid = left + ((right-left)>>1);//1
    if (array[mid]==target) {
      return mid;
    } else {
        if(array[mid]<array[right]){
            if(array[mid] < target && target<=array[right]){
                return search(array, target, mid+1, right);
            } else {
                return search(array, target, left, mid-1);
            }
        } else {
            if(array[mid] > target && target >= array[left]){
                return search(array, target, left, mid-1);
            } else {
                return search(array, target, mid+1, right);
            }
        }
        
//        if(array[mid] < target){
//      if(array[mid]<array[right] && target<=array[right]){
//        return search(array, target, mid+1, right);
//      } else {
//        return search(array, target, left, mid-1);
//      }
//    } else {
//      if(array[left]<array[mid] && target>=array[left]){
//        return search(array, target, left, mid-1);
//      } else {
//        return search(array, target, mid+1, right);
//      }
    }
  }
  
  public static void main(String[] args){
      int[] arr = new int[]{15,1,3,6,10};
      System.out.println(new Solution3().search(arr,1));
  }
}
