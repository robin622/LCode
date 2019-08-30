package firstsemester.summary;

public class MinHeap {
    
    public static final int DEFAULT_LENGTH = 16;
    private int size;
    private int[] arr;
    
    public MinHeap() {
        this(DEFAULT_LENGTH);
    }
    
    public MinHeap(int length) {
        arr = new int[length];
    }
    
    public void offer(int val) {
        arr[size] = val;
        pecolateUp(size);
        size++;
    }
    
    public Integer poll() {
        if(size ==0) {
            return null;
        }        
        int ret = arr[0];
        arr[0] = arr[size];
        pecolateDown(0);
        return ret;
    }
    
    private void pecolateDown(int node) {
        
    }
    
    private void pecolateUp(int child) {
        while(child > 0 && arr[(child - 1) / 2] < arr[child]) {
            swap((child - 1) / 2, child);
            child = (child - 1) / 2;
        }
    }

    private void swap(int parent, int child) {
        int temp = arr[parent];
        arr[parent] = arr[child];
        arr[child] = temp;
    }

    public static void main(String[] args) {
        
    }

}
