package old.class1.exercises;

public class Solution6 {
    public int sqrt(int x) {
        if (x == 0)
            return 0;
        int left = 0;
        int right = getBorder(x);
        System.out.println("right is:"+right);
        while (left + 1 < right) {
            int mid = left + ((right - left) >> 1); // 3
            if ((mid + 1) == x/(mid+1)) {
                return mid + 1;
            } else if ((mid + 1) < x/(mid+1)) {
                left = mid;
            } else {
                right = mid;
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

    private int getBorder(int x) {
        int border = 1;
        while (border < (x/border)) {
            border *= 10;
        }
        return border;
    }
    
    public static void main(String[] args) {
        Solution6 s5 = new Solution6();
        System.out.println(s5.sqrt(2147395600));
    }
}
