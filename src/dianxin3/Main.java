package dianxin3;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * 排序次序
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] nums = new int[count];
        Set set = new TreeSet();
        for (int i= 0 ; i < count; i++) {
            nums[i] = sc.nextInt();
            set.add(nums[i]);
        }
        Object[] p = set.toArray();
        int[] poss = new int[p.length];
        for (int i  =0; i < poss.length; i++) {
            poss[i] = (int) p[i];
        }
        for (int i = 0; i < nums.length - 1; i++) {
            System.out.print((Arrays.binarySearch(poss, nums[i]) + 1) + " ");
        }
        System.out.print(Arrays.binarySearch(poss, nums[nums.length - 1]) + 1);



    }
}
