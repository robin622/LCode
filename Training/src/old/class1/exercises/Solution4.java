package old.class1.exercises;

public class Solution4 {
    public int localMinimum(int[] array) {
        int left = 0;
        int right = array.length - 1;
        if(array.length>1){
            if(array[left]<array[left+1]){
                return left;
            }
            if(array[right]<array[right-1]){
                return right;
            }
        }
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            if (array[mid] < array[mid + 1] && array[mid] < array[mid - 1]) {
                return mid;
            } else if (array[mid] < array[mid + 1]
                    && array[mid] > array[mid - 1]) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return 0;
    }
    
    public static void main(String[] args) {
        Solution4 s4 = new Solution4();
        int[] array = new int[]{4,8,10,12};
        System.out.println(s4.localMinimum(array));
    }
}
