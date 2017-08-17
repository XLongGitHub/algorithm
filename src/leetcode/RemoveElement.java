package leetcode;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement re = new RemoveElement();
//        int[] nums = {3,2,2,3};
        int[] nums = {5, 4};
        int len = re.removeElement(nums, 5);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + "  ");
        }
        System.out.println(len);
    }

    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int i = 0;  //等于val元素位置
        int j = 0;  //不等于val元素位置
        for (; j < length; j++) {
            if (nums[j] != val) break;
        }
        for (; i < length; i++) {
            if (j == length) break; //完成
            if (nums[i] == val) {
                swap(nums, i, j);
                for (; j < length; j++) {
                    if (nums[j] != val) break;
                }
            }
        }
        int k = length - 1;
        for (; k >= 0; k--) {
            if (nums[k] != val) break;
        }
        //数组中不存在给定值
//        if ( length <= 0) {
//            return 0;
//        } else {
//            return j - i;
//        }
        return k + 1;

//        return (j - i) > 0 ? (j - i) : 0;
    }

    /**
     * 交换数组中两个元素的位置
     *
     * @param arr
     * @param i
     * @param j
     */
    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
