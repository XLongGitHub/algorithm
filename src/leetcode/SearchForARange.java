package leetcode;

import java.util.Arrays;

public class SearchForARange {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = 0;
        int[] poss = {-1, -1};
        int pos = Arrays.binarySearch(nums, target);
        if (pos < 0) return poss;

        for (start = pos; start >=0; start--) {
            if (nums[start] != target) {
                start++;
                break;
            }
        }
        for (end = pos; end < nums.length; end++) {
            if (nums[end] != target) {
                end--;
                break;
            }
        }
        if (start == -1 && nums[0] == target) start = 0;
        if (end == nums.length && nums[nums.length - 1] == target) end = nums.length - 1;
        poss[0] = start;
        poss[1] = end;
        return poss;
    }

    public static void main(String[] args) {
        SearchForARange sf = new SearchForARange();
//        int[] ints = {5, 7, 7, 8, 8, 10};
//        int target = 8;
        int[] ints = {1};
        int target = 1;
        int[] re = sf.searchRange(ints, target);
        for (Integer i : re) {
            System.out.print(i + "  ");
        }

    }
}
