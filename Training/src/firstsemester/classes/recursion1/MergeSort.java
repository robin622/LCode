package firstsemester.classes.recursion1;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    
//    public List<Integer> mergetSort(int[] arr){
//        return mergeSort(arr, 0, arr.length);
//    }
    
//    public List<Integer> mergeSort(int[] arr, int left, int right){
//        if(left>right) return null;
//        if(left==right){
//            List<Integer> lst = new ArrayList<Integer>();
//            lst.add(left);
//            return lst;
//        }
//        int mid = left + ((right - left)>>1);
//        List<Integer> leftArray = mergeSort(arr, left, mid);
//        List<Integer> rightArray = mergeSort(arr, mid+1, right);
//        return combine(leftArray, rightArray);
//    }
//    
//    private List<Integer> combine(List<Integer> leftArray, List<Integer> rightArray){
//        if(rightArray==null) return leftArray;
//        List<Integer> lst = new ArrayList<Integer>();
//        //merge
//        int idxOfLeft = 0;
//        int idxOfRight = 0;
//        for(int i=0;i<leftArray.size()+rightArray.size();i++){
//            if(idxOfLeft<0 || (idxOfRight>=0 && rightArray.get(idxOfRight) <= leftArray.get(idxOfLeft))){
//                lst.add(rightArray.get(idxOfRight++));
//            } else {
//                lst.add(leftArray.get(idxOfLeft++));
//            }
//        }
//        return lst;
//    }
    
    public int[] mergeSort(int[] array){
        if(array==null) return array;
        int[] helper = new int[array.length];
        mergeSort(array, helper, 0, array.length-1);
        return array;
    }
    
    private void mergeSort(int[] array, int[] helper, int left, int right){
        System.out.println("left is: " + left + ", right is: " + right);
        if(left>=right) return;
        int mid = left+(right-left)/2;
        mergeSort(array, helper, left, mid);
        mergeSort(array, helper, mid+1, right);
        merge(array, helper, left, mid, right);
    }
    
    private void merge(int[] array, int[] helper, int left, int mid, int right){
        System.out.println("merge, left is: " + left + ", right is: " + right);
        for(int i=left; i<=right;i++){
            helper[i]=array[i];
        }
        int leftIndex = left;
        int rightIndex = mid + 1;
        while(leftIndex<=mid && rightIndex <=right){
            if(helper[leftIndex] <= helper[rightIndex]){
                array[left++] = helper[leftIndex++];
            } else {
                array[left++] = helper[rightIndex++];
            }
        }
        
        while(leftIndex <= mid){
            array[left++] = helper[leftIndex++];
        }
    }


    public static void main(String[] args) {
        MergeSort ss = new MergeSort();
        int[] array = new int[]{214,3,5,0,2,4,6,9,14};
        ss.mergeSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }

}
