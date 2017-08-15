package leetcode;

public class RemoveElement {
    public  static void main(String[] args) {
        RemoveElement re = new RemoveElement();
        int[] nums = {3,2,2,3};
        re.removeElement(nums, 3);
    }

    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                len--;
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j+1];
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
        return len;
    }

}
