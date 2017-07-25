package ctrip;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/11.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(mul(number));
    }

    public static long mul(int number) {
        if (number <= 1)
            return number;
        int[] nums = {2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29};
        int[] ans = new int[20];
        int sum = 0;
       // ans[0] = 2;
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (number - sum < nums[i]) {
//                sum += number - sum;//
                ans[pos++] = number - sum;
                break;
            } else {
                sum += nums[i];
                ans[pos++] = nums[i];
            }
        }
        if (ans[pos-1] <= ans[pos-2]) {
            ans[pos-2] += ans[pos-1];
            ans[pos-1] = 0;
        }
        long mul = 1;
        for (int i = 0; i < pos; i++) {
            if (ans[i] != 0)
                mul *= ans[i];
        }
        return mul;
    }
}
