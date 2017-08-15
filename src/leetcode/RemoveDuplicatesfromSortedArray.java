package leetcode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 2, 4, 1};
        int[] nums = {1, 1, 2};

//        Arrays.sort(nums);
//        System.out.println(Arrays.asList(nums));
//        for (int i = 0; i < nums.length; i++)
//            System.out.print(nums[i] + "  ");
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                len--;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
            }
        }
        return len;
    }
}
