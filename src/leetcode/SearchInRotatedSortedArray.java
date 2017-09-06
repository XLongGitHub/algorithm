package leetcode;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1 ;
        if (nums[0] == target) return 0;
        if (nums.length == 1) return -1;
        if (nums[1] == target) return 1;
        if (nums.length == 2) return -1;
        int minPos = 0;
        //找到数组中最小元素的位置
        for (int i = 0 ; i < nums.length - 2; i++) {
            if (nums[i] > nums[i + 1]) {
                minPos = i + 1;
                break;
            }
        }
        int len = nums.length;
        int start = minPos;
        int end = (start + len - 1) % len;
        int mid = (start + (len - 1) / 2) % len;
        while (start != end) {
            if (nums[mid] > target) {
                end = (mid - 1) % len;
            } else if(nums[mid] < target) {
                start = (mid + 1) % len;
            } else {
                return mid;
            }
            int distance = (end - start + len) % len;
            mid = (start + distance / 2) % len;
        }
        if (nums[start] == target) {
            return mid;
        }else{ return -1;}

    }

    public static void main(String[] args) {
        int[] nums = { 7, 8, 9, 1, 3, 5};
//        int[] nums = {3,5,1};
        int target = 1;
        SearchInRotatedSortedArray sisa = new SearchInRotatedSortedArray();
        int pos = sisa.search(nums, target);
        System.out.println(pos);
    }
}
