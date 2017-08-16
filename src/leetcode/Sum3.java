package leetcode;

import java.util.*;

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
        List<List<Integer>> list = new LinkedList();  //结果集
        Set<Sum> set = new HashSet();
//        int start = 0;
//        for (; start < nums.length; start++) {
//            if (nums[start] > 0) break;
//        }
//        int i = 0;
//        if (start >= 2)
//            i = start - 2;
        for (int i = 0; i < nums.length - 2; i++) {
//            int sum = 0;  //导致了叠加
//            sum += nums[i];
//            if (sum > 0) break;
            if (nums[i+2] < 0) continue;
            if (nums[i] > 0) break;
            for (int j = i + 1; j < nums.length - 1; j++) {
//                sum += nums[j];
                if ((nums[i] + nums[j]) > 0) break;
                for (int k = j + 1 ; k < nums.length; k++) {
//                    sum += nums[k];
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum < 0) continue;
                    if (sum > 0) break;
                    if (sum == 0) {
                        List tmp = new LinkedList();
                        tmp.add(nums[i]);
                        tmp.add(nums[j]);
                        tmp.add(nums[k]);
                        Sum s = new Sum(nums[i], nums[j], nums[k]);
                        if (set.add(s)) {
                            list.add(tmp);
                        }
                    }
                }
            }
        }
        return list;
    }
}

/*public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList();  //结果集
        Set<Sum> set = new HashSet();
        for (int i = 0; i < nums.length - 2; i++) {
            int sum = 0;
            sum += nums[i];
            if (sum > 0) break;   //第一个元素已经比0大
            for (int j = i + 1; j < nums.length - 1; j++) {
                sum += nums[j];
                if (sum > 0) break;   //第二个元素之和大于0
                for (int k = j + 1; k < nums.length; k++) {
                    sum += nums[k];
                    if (sum < 0) continue;
                    if (sum > 0) break;
                    if (sum == 0) {
                        Sum s = new Sum(nums[i], nums[j], nums[k]);
                        if (set.add(s)) {  //不含有该元素，且添加成功，返回true
                            List tmp = new LinkedList();
                            tmp.add(nums[i]);
                            tmp.add(nums[j]);
                            tmp.add(nums[k]);
                            list.add(tmp);
                        }
                    }
                }
            }
        }
        return list;
    }*/
