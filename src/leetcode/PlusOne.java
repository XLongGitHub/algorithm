package leetcode;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne po = new PlusOne();
//        int[] digits = {1, 2, 3};
        int[] digits = {2, 2, 2};
        int[] nums = po.plusOne(digits);
        for (int num : nums)
            System.out.print(num + "  ");
    }

    public int[] plusOne(int[] digits) {
        int[] nums = new int[digits.length + 1];
        for (int i = 0; i < nums.length; i++) nums[i] = -1;
        //数组为0
        if (digits.length == 1 && digits[0] == 0) {
            digits[0] = 1;
            return  digits;
        }
        if (digits.length == 1 && digits[0] == 9) {
            int[] tmp = {1, 0};
            return tmp;
        }
        //处理数据中9+1赋0的情况
        int i = digits.length - 1;
        for (; i >= 0; i--) {
            if (digits[i] == 9) {
                nums[i + 1] = 0;
            } else {
                break;
            }
        }
        // 处理高位剩余数据
        //全为9
        if (i == 0 && nums[i + 1] == 0) nums[0] = 1;
        //首位不为9
        else if (i == 0 && nums[i + 1] != 0) {
            nums[i + 1] = digits[i] + 1;
            nums[i] = 0;
        } else if (i > 0 && nums[i + 1] == 0) {
            nums[i + 1] = digits[i] + 1;
            for (int j = i - 1; j >= 0; j--) {
                nums[j + 1] = digits[j];
            }
            nums[0] = 0;
        } else {
            for (int j = i; j >= 0; j--) {
                nums[j + 1] = digits[j];
            }
            nums[0] = 0;
        }
        if (nums[0] != 0){
            return nums;
        } else {
            System.arraycopy(nums, 1, digits, 0, digits.length);
            return digits;
        }
    }

}