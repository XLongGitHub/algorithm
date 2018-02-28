package leetcode;

import java.util.Arrays;

public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int n = 0;
        while (n < nums.length && nums[n++] <= 0);
        return  0;

    }

    public static void main(String[] args) {

    }
}
