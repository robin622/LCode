package class10;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class FindSmallestKElements {

    // public int[] findSmallestKElements(int[] arr, int k) {
    // int[] result = new int[k];
    // if(k==0) {
    // return result;
    // } else if(arr.length < k) {
    // return arr;
    // }

    // method 1, sort the whole array in ascending order and get the first k
    // elements
    // TC: O(nlogn + k), SC: O(n)
    // quickSort(arr);
    // for(int i=0; i < k; i++) {
    // result[i] = arr[i];
    // }

    // method 2, build a min heap and get top 5 elements
    // TC: O(n + klogn), SC: O(n)
    // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
    // for(int i = 0; i < arr.length; i++) {
    // pq.add(arr[i]);
    // }
    // for(int j = 0; j < k; j++) {
    // result[j] = pq.remove();
    // }
    // return result;

    // method 3, build a max heap with 5 elements
    // TC: O((n-k)logk) ,SC: O(k)
    // PriorityQueue<Integer> pq = new PriorityQueue<Integer>(k, new
    // Comparator<Integer>(){
    // public int compare(Integer itg1, Integer itg2) {
    // if(itg1 < itg2) {
    // return 1;
    // } else if(itg1 > itg2) {
    // return -1;
    // }
    // return 0;
    // }
    // });
    // for(int i=0; i<arr.length; i++) {
    // if(pq.size()<k) {
    // pq.add(arr[i]);
    // } else if(arr[i] < pq.peek()){
    // pq.remove();
    // pq.add(arr[i]);
    // }
    // }
    // for(int j = 0; j < k; j++) {
    // result[j] = pq.remove();
    // }
    // return result;

    // method 4, quick selection (iteration)
    // TC:worst: O(n^2), average: O(n) SC:(1

    // int size = 0;
    // int le private int partition(int[] arr, int left, int right) {
    // int randomIdx = getRandom(left, right);
    // swap(arr, randomIdx, right);
    //
    // int leftIdx = left;
    // int rightIdx = right -1;
    // while(leftIdx <= rightIdx){
    // if(arr[leftIdx] < arr[right]) {
    // leftIdx ++;
    // } else if(arr[rightIdx] > arr[right]) {
    // rightIdx --;
    // } else {
    // swap(arr, leftIdx++, rightIdx--);
    // }
    // }
    // //last swap
    // swap(arr, leftIdx, right);
    // return leftIdx;
    // }
    //
    // private void swap(int[] arr, int randomIdx, int right) {
    // int temp = arr[randomIdx];
    // arr[randomIdx] = arr[right];
    // arr[right] = temp;
    // }
    //
    //
    // private int getRandom(int left, int right) {
    // return left + (int)(Math.random() * (right - left+1));
    // }ft = 0;
    // int right = arr.length - 1;
    //
    // int remain = k; //how many elements are left
    //
    // while(size < k) {
    // int pivot = partition(arr, left, right);
    // if(pivot == remain-1) {
    // int elements = copy(arr, left, pivot, result, size);
    // remain -= elements;
    // size += elements;
    // break;
    // } else if(pivot < remain-1) {
    // int elements = copy(arr, left, pivot, result, size);
    // remain -= elements;
    // size += elements;
    // arr = getNewArr(arr, pivot);
    // right = arr.length - 1;
    // } else {
    // right=pivot;
    // }
    // }
    //
    // return result;

    // quickSelect(arr, 0, arr.length-1, k-1);
    // result = Arrays.copyOf(arr, k);
    // Arrays.sort(result);
    // return result;
    // }
    //
    //
    // private void quickSelect(int[] arr, int left, int right, int target) {
    // int pivot = partition(arr, left, right);
    // if(pivot == target) {
    // return;
    // } else if(pivot > target) {
    // quickSelect(arr, left, pivot - 1, target);
    // } else {
    // quickSelect(arr, pivot + 1, right, target);
    // }
    //
    //
    // }

    // private int[] getNewArr(int[] arr, int pivot) {
    // int[] newArr = new int[arr.length - pivot - 1];
    // for(int i = 0; i < newArr.length; i++) {
    // newArr[i] = arr[pivot+1];
    // pivot++;
    // }
    // return newArr;
    // }
    //
    // private int copy(int[] arr, int left, int right, int[] result, int size)
    // {
    // //size = size + 1;
    // int length = right - left + 1;
    // for(int i = left; i <= left + right; i++) {
    // result[size] = arr[i];
    // size++;
    // }
    // return length;
    // }

    // private int partition(int[] arr, int left, int right) {
    // int randomIdx = getRandom(left, right);
    // swap(arr, randomIdx, right);
    //
    // int leftIdx = left;
    // int rightIdx = right -1;
    // while(leftIdx <= rightIdx){
    // if(arr[leftIdx] < arr[right]) {
    // leftIdx ++;
    // } else if(arr[rightIdx] > arr[right]) {
    // rightIdx --;
    // } else {
    // swap(arr, leftIdx++, rightIdx--);
    // }
    // }
    // //last swap
    // swap(arr, leftIdx, right);
    // return leftIdx;
    // }
    //
    // private void swap(int[] arr, int randomIdx, int right) {
    // int temp = arr[randomIdx];
    // arr[randomIdx] = arr[right];
    // arr[right] = temp;
    // }
    //
    //
    // private int getRandom(int left, int right) {
    // return left + (int)(Math.random() * (right - left+1));
    // }

    // private void quickSort(int[] arr) {
    // quickSort(arr, 0, arr.length-1);
    // }
    //
    // private void quickSort(int[] arr, int start, int end) {
    // if(start >= end) {
    // return;
    // }
    // int pivot = partition(arr, start, end);
    // quickSort(arr, start, pivot-1);
    // quickSort(arr, pivot+1, end);
    // }
    //
    // private int partition(int[] arr, int start, int end) {
    // int randomIndex = getRandom(start, end);
    // swap(arr, randomIndex, end);
    //
    // int left = start;
    // int right = end - 1;
    // while(left <= right) {
    // if(arr[left] <= arr[end]) {
    // left ++;
    // } else if(arr[right] >= arr[end]) {
    // right--;
    // } else {
    // swap(arr, left, right);
    // left++;
    // right--;
    // }
    // }
    // //swap last
    // swap(arr, left, end);
    // return left;
    // }
    //
    //
    //
    // private void swap(int[] arr, int randomIndex, int end) {
    // int temp = arr[randomIndex];
    // arr[randomIndex] = arr[end];
    // arr[end] = temp;
    // }
    //
    // private int getRandom(int start, int end) {
    // return start + (int)(Math.random() * (end - start +1));
    // }
    
    public int[] kSmallest(int[] array, int k) {
        int[] result = new int[k];
        quickSelection(result, array, 0, array.length - 1, k - 1);
        return result;
    }

    private void quickSelection(int[] result, int[] array, int left, int right,
            int target) {
        int pivot = partition(array, left, right);
        if (pivot == target) {
            // add elements from left to result
            for (int i = 0; i < result.length; i++) {
                result[i] = array[i];
            }
        } else if (pivot < target) {
            quickSelection(result, array, pivot + 1, right, target);
        } else {
            quickSelection(result, array, left, pivot - 1, target);
        }
    }

    private int partition(int[] array, int left, int right) {
        int start = left;
        int end = right - 1;
        while (start <= end) {
            if (array[start] < array[right]) {
                start++;
            } else if (array[end] > array[right]) {
                end--;
            } else {
                swap(array, start++, end--);
            }
        }
        // swap last
        swap(array, start, right);
        return start;
    }

    private void swap(int[] array, int start, int end) {
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 8, 6, 2, 1, 5, 7 };
        FindSmallestKElements sfke = new FindSmallestKElements();
        int[] result = sfke.kSmallest(arr, 6);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
