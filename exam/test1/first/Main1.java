package exam.test1.first;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/3/23.
 */
public class Main1 {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        int num = 1234;
        String str = "" + num;
        int[] nums = new int[str.length()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)str.charAt(i) - 48;
        }
        int j = 0;
        for ( ; j< nums.length-1; j++) {
            if (eq(nums, j)) {
                System.out.println("YES");
                break;
            }

        }

        if (j == nums.length-1)
            System.out.println("NO");


//        System.out.print(eq(nums, 1));
    }

    public static boolean eq(int [] a, int mid) {
//        System.out.println(mid);
        int len = a.length;
        int num1 = 1;
        int num2 = 1;
        for (int i = 0; i <= mid; i++) {
            num1 *= a[i];
        }
        for (int i=mid+1; i < len; i++) {
            num2 *= a[i];
        }
        return num1 == num2;
    }
}
