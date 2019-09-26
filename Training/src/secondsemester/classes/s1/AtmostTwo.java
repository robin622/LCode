package secondsemester.classes.s1;

public class AtmostTwo {
    
    private int[] removeDuplicateAtmostTwo(int[] array) {
        if(array == null || array.length < 3) {
            return array;
        }
        int p1 = 2;
        for(int p2 = 2; p2 < array.length; p2++) {
            if(array[p2] != array[p1-2]) {
                array[p1] = array[p2];
                p1++;
            }
        }
        int[] result = new int[p1];
        for(int i = 0; i < result.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
        int[] input = new int[]{1,1,1,1,2,3,3,4,5,5,5,5,5};
        int[] result = new AtmostTwo().removeDuplicateAtmostTwo(input);
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }

    }

}
