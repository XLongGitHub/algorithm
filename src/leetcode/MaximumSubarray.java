package leetcode;

public class MaximumSubarray {
    public static void main(String[] args) {

    }

    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < nums.length;i++) {
            // 保证了数组必为正数开头
            if (sum  < 0) {    
                sum = nums[i];
            } else {
                sum += nums[i];
            }
            max = max > sum ? max : sum;
        }
        return max;
    }
}