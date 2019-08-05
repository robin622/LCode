package old.class1.exercises;

public class Solution {
    
    public int getSingleElement(int[] nums) {
        if (nums == null || nums.length == 0)
            return -1;
        int left = 0;
        int right = nums.length - 1; // 8
        while (left < right) {
            int mid = left + (right - left) / 2; // 7
            if (nums[mid] == nums[mid - 1] && mid - 1 >= 0) {
                int rightDistance = right - mid;
                if (rightDistance == 1) {
                    return nums[right];
                }
                if (rightDistance % 2 == 0) {
                    right = mid - 2;
                } else {
                    left = mid + 1;
                }
            } else if (nums[mid] == nums[mid + 1] && mid + 1 <= nums.length - 1) {
                int leftDistance = mid - left;
                if (leftDistance == 1) {
                    return nums[left];
                }
                if (leftDistance % 2 == 0) {
                    left = mid + 2; // 6
                } else {
                    right = mid - 1;
                }
            } else {
                return nums[mid];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] m = new int[]{2,2,3,3,4,5,5};
        System.out.println(s.getSingleElement(m));

    }

}
