package leetcode;

import java.util.Arrays;

public class Sum3Closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[nums.length - 1];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum - target > 0) {
                    k--;
                } else {
                    j++;
                }
                if ( Math.abs(result - target) > Math.abs(sum - target)) {
                    result = sum;
                }
            }
        }
        return result;
    }
}
