package regularclass.firstsemester.recursion1;
public class QuckSort {
  
  //second attempts after reviewing the answer
  public int[] quickSort(int[] array) {
    if(array==null || array.length==0) return array;
    quickSort(array, 0, array.length-1);
    return array;
  }
  
  private void quickSort(int[] array, int left, int right){
    if(left>=right) return;
    int pivotIndex = partition(array, left, right);
    quickSort(array, left, pivotIndex-1);
    quickSort(array, pivotIndex+1, right);
  }
  
  private int partition(int[] array, int left, int right){
    int pivot = getPivot(left, right);
    //swap with last
    swap(array, pivot, right);
    
    int leftIndex = left;
    int rightIndex = right-1;
    int pivotIndex = right;
    while(leftIndex<=rightIndex){
      if(array[leftIndex]<array[pivotIndex]){
        leftIndex++;
      } else if(array[rightIndex]>=array[pivotIndex]){
        rightIndex--;
      } else {
        swap(array, leftIndex++, rightIndex--);
      }
    }
    //last swap
    swap(array, leftIndex, right);
    return leftIndex;
  }
  
  private void swap(int[] array, int first, int second){
    int temp = array[first];
    array[first] = array[second];
    array[second] = temp;
  }
  
  private int getPivot(int left, int right){
    return left + (int)(Math.random() * (right-left+1));
  }
  
  public static void main(String[] args) {
      QuckSort qs = new QuckSort();
      int[] array = new int[]{214,3,5,0,2,4,6,9,14};
      qs.quickSort(array);
      for(int i=0;i<array.length;i++){
          System.out.println(array[i]);
      }
  }
}