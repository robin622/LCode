package practice.practice10;

public class MinHeap {
    
    private int[] array;
    private int size;
    
    public MinHeap(int[] array) {
        if(array == null || array.length == 0) {
            throw new IllegalArgumentException("input is empty");
        }
        this.array = array;
        size = array.length;
        heapify();
    }
    
    private void heapify() {
       //find the n/2 -1 element, do percolate down
       for(int m = size / 2 -1; m >= 0; m--) {
           percolateDown(m);
       }
    }

    public MinHeap(int cap) {
        if(cap <= 0) {
            throw new IllegalArgumentException("capacity can not be <= 0");
        }
        this.array = new int[cap];
        size = 0;
    }
    
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == array.length;
    }
    
    private void percolateUp(int index) {
        if(index <= 0) {
            return;
        }
        int parent = (index - 1) / 2;
        if(array[parent] > array[index]) {
            swap(parent, index);
            percolateUp(parent);
        }
    }
    
    private void percolateDown(int index) { // problem here, leftChild and rightChild are out of border
        if(index > size / 2 + 1) {
            return;
        }
        int leftChild = index * 2 + 1;
        int rightChild = index * 2 + 2;
        int idx = array[leftChild] < array[rightChild] ? leftChild : rightChild;
        swap(idx, index);
        percolateDown(idx);
    }
    
    public Integer peek() {
        if(size == 0) {
            return null; 
        }
        return array[0];
    }
    
    public Integer poll() {
        if(size == 0) {
            return null; 
        }
        int ret = array[0];
        array[0] = array[size-1];
        size--;
        percolateDown(0);
        return ret;
    }
    
    public void offer(int ele) {
        array[size++] = ele;
        percolateUp(size-1);
    }
    
    public void update(int index, int ele) {
        if(index < 0 || index >= size) {
            return;
        }
        if(array[index] == ele){
            return;
        } else if(array[index] < ele) {
            array[index] = ele;
            percolateDown(index);
        } else {
            array[index] = ele;
            percolateUp(index);
        }
    }
    
    private void swap(int l, int r) {
        int temp = array[l];
        array[l] = array[r];
        array[r] = temp; 
    }
    
    public static void main(String[] args) {

    }

}
