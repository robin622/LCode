package regularclass.firstsemester.recursion1;

public class SelectionSort {

    //TC: O(n^2), SC: O(1)
    public void selectionSort(int[] array){
        for(int i=0;i<array.length;i++){
            int minIndex = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[minIndex]){
                    minIndex = j;
                }
            }
            //swap
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }
    
    public static void main(String[] args) {
        SelectionSort ss = new SelectionSort();
        int[] array = new int[]{1,3,5,0,2,4,6};
        ss.selectionSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
