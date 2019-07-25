package regularclass.recursion1;

public class RainBowSort2 {
    // TC: O(n), SC:O(1)
    public int[] rainbowSortII(int[] array) {
        if (array.length <= 1)
            return array;
        int red = 0;
        int green = 0;
        int blue = 0;
        int black = array.length - 1;
        while (blue <= black) {
            if (array[blue] == 0) {
                swap(array, red, blue);
                red++;
                if(green<red){
                    green++;
                }
                if(blue<red){
                    blue++;
                }
            } else if (array[blue] == 1) {
                swap(array, blue, green);
                green++;
                blue++;
            } else if (array[blue] == 2) {
                blue++;
            } else {
                swap(array, blue, black);
                black--;
            }
        }
        return array;
    }

    private void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }

    public static void main(String[] args) {
        RainBowSort2 rs2 = new RainBowSort2();
        //int[] array = new int[]{2,0,0,1,1};
        int[] array = new int[]{0,3,1,2};
        rs2.rainbowSortII(array);
        for(int i:array){
            System.out.println(i);
        }

    }

}
