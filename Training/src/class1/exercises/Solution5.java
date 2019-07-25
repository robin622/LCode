package class1.exercises;

import regularclass.recursion1.QuckSort;

public class Solution5 {
    public int sqrt(int x) {
        if (x == 0)
            return 0;
        int left = 0;
        int right = x >> 1;
        while (left + 1 < right) {
            int mid = left + ((right - left) >> 1);
            int val = (mid + 1) * (mid + 1);
            if (val == x) {
                return mid + 1;
            } else if (val < x) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }
        if ((right + 1) * (right + 1) < x) {
            return right + 1;
        }
        if ((left + 1) * (left + 1) < x) {
            return left + 1;
        }
        return 1; // x==1
    }

    public static void main(String[] args) {
        Solution5 s5 = new Solution5();
        s5.sqrt(10000001);
    }
}
