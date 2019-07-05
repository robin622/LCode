package class3.practice;

public class Solution3 {

    public int[] mergeSort(int[] array) {
        int[] helper = new int[array.length];
        mergeSort(array, 0, array.length - 1, helper);
        return array;
    }

    private void mergeSort(int[] array, int start, int end, int[] helper) {
        if (start >= end) {
            return;
        }
        int middle = start + ((end - start) >> 1);
        mergeSort(array, start, middle, helper);
        mergeSort(array, middle + 1, end, helper);
        combine(array, start, middle, end, helper);
    }

    private void combine(int[] array, int start, int middle, int end,
            int[] helper) {
        for (int i = start; i <= end; i++) {
            helper[i] = array[i];
        }
        int first = start;
        int second = middle + 1;
        int arrPoint = start;
        while (first <= middle && second <= end) {
            if (helper[first] < helper[second]) {
                array[arrPoint++] = helper[first++];
            } else {
                array[arrPoint++] = helper[second++];
            }
        }
        while (first <= middle) {
            array[arrPoint++] = helper[first++];
        }
        while (second <= end) {
            array[arrPoint++] = helper[second++];
        }
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        s.mergeSort(new int[] { 2, 4, 1, 3});
    }

}
