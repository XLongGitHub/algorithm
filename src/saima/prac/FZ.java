package saima.prac;

import java.util.Scanner;

/**
 * 翻转数组
 * @author Xulong
 */
public class FZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
        }
        int start = 0;

        for (int i = 0; i < N; i++) {
            if (nums[start] > nums[i]) break;
            start = i;
        }
        int end = start + 1;
        for (int i = start + 1; i < N; i++) {
            if (nums[end] < nums[i]) break;
            end = i;
        }
        if (start == 0) {
            if (nums[start] < nums[end + 1] && isSorted(nums, start, end) && isSorted(nums, end + 1, nums.length - 1)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            if (nums[end] > nums[start - 1] && nums[start] < nums[end + 1] && isSorted(nums, 0, start - 1)
                    && isSorted(nums, start, end) && isSorted(nums, end + 1, nums.length - 1)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }

    /**
     * 判断数组是否有序
     * @param a 数组
     * @param i 起始索引
     * @param j 终点索引
     * @return
     */
    public static boolean isSorted(int[] a, int i, int j) {
        if (i == j) return true;
        if (a[i] > a[i + 1]) {
            for (int k = i; k < j; k++) {
                if (a[k]  < a[k + 1]) return false;
            }
        } else {
            for (int k = i; k < j; k++) {
                if (a[k] > a[k + 1]) return false;
            }
        }
        return true;
    }
}
