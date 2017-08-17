package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum4 {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> lists = new LinkedList<>();
        Arrays.sort(nums);
        for (int i = 0; i <= nums.length - 4; i++) {
            for (int j = i + 1; j <= nums.length - 3; j++) {
                int start = j + 1, end = nums.length - 1;
                while (start < end) {
                    int sum = nums[i] + nums[j] + nums[start] + nums[end];
                    if (sum > target) {
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        lists.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));
                        if (nums[i] + nums[j] + nums[start + 1] + nums[end] == 0) {
                            start++;
                        } else if (nums[i] + nums[j] + nums[start] + nums[end - 1] == 0) {
                            end--;
                        } else if(nums[i] + nums[j] + nums[start+1] + nums[end - 1] == 0) {
                            while (nums[start] == nums[start + 1]) start++;
                            while (nums[end] == nums[end - 1]) end--;
                            start++;
                            end--;
                        }

//                        while (nums[start] == nums[start + 1]) start++;
//                        while (nums[end] == nums[end - 1]) end--;
                        break;
                        //还有错
                    }
                }
            }
        }
        return lists;
    }

    public static void main(String[] args) {
        Sum4 sum4 = new Sum4();
//        int[] ints = {1, 0, -1, 0, -2, 2};
//        int[] ints = {0, 0, 0, 0};
        int[] ints = {-3, -2, -1, 0, 0, 1, 2, 3};
        int target = 0;
        List list = sum4.fourSum(ints, target);
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < ((List) list.get(i)).size(); j++) {
                System.out.print(((List) list.get(i)).get(j) + "  ");
            }
            System.out.println();
        }
    }
}
