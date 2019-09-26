package secondsemester.classes.s1;

public class RemoveDuplicate {
    
    private int[] removeDuplicate(int[] array) {
        if(array == null || array.length < 2) {
            return array;
        }
        int[] result = null;
        int p1 = 1;
        for(int p2 = 1; p2 < array.length; p2++) {
            if(array[p1-1] != array[p2]){
                array[p1] = array[p2];
                p1++;
            }
        }
        result = new int[p1];
        for(int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] input = new int[]{1,2,3,4,5,5};
        int[] result = new RemoveDuplicate().removeDuplicate(input);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
