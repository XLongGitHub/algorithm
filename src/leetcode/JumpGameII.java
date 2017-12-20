package leetcode;

import java.util.*;

public class JumpGameII {
    public int jump(int[] nums) {
        int[] minStep = {nums.length -1 };
        path(0, nums, 0, minStep);
        return minStep[0];
    }

    public void path(int cur, int[] nums, int counter, int[] minStep) {
        if (counter > minStep[0]) return;
        if (cur == nums.length -1) {
            if (counter < minStep[0]) {
                minStep[0] = counter;
            }
            return;
        } else if (cur > nums.length - 1 || nums[cur] == 0) {
            return;
        } else {
            for (int i = nums[cur]; i >= 1  ; i--) {
                path(cur + i, nums, counter + 1, minStep);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        JumpGameII jg = new JumpGameII();
        int step = jg.jump(nums);
        System.out.println(step);
    }
}