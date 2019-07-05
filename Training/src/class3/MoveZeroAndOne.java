package class3;
public class MoveZeroAndOne {
  
  public int[] moveZero(int[] array) {
    if(array.length<=1) return array;
    int leftIndex = 0;
    int rightIndex = array.length-1;
    while(leftIndex < rightIndex){
      if(leftIndex!=0){
        leftIndex++;
      } else if(rightIndex==0){
        rightIndex--;
      } else {
        swap(array, leftIndex++, rightIndex--);
      }
    }
    return array;
  }
  
  private void swap(int[] array, int leftIndex, int rightIndex){
    int temp = array[leftIndex];
    array[leftIndex] =  array[rightIndex];
    array[rightIndex] = temp;
  }
  
  public static void main(String[] args) {
      MoveZeroAndOne mz =  new MoveZeroAndOne();
      int[] array = new int[]{0,0,1,1,0,1,0};
      mz.moveZero(array);
      for(int i : array){
          System.out.println(i);
      }
  }
}
