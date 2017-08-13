package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Sum3 {

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        Sum3 sum3 = new Sum3();
        sum3.threeSum(nums);
    }

    class Sum {
        private int x;
        private int y;
        private int z;

        public Sum(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Sum sum = (Sum) o;

            if (x != sum.x) return false;
            if (y != sum.y) return false;
            return z == sum.z;
        }

        @Override
        public int hashCode() {
            int result = x;
            result = 31 * result + y;
            result = 31 * result + z;
            return result;
        }
    }

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List list = new LinkedList();
        List list2 = new LinkedList();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                for (int k = j; k < nums.length; k++) {
                    List list1 = new LinkedList();
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        if (!list2.contains(new Sum(nums[i], nums[j], nums[k])))
                            list.add(list1);
                        list2.add(new Sum(nums[i], nums[j], nums[k]));
                    }
                }
            }
        }
        return list;
    }
}
