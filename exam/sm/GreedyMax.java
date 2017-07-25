package exam.sm;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/9.
 * 1.硬币找零~~
 * 问题描述：
 * 现存在一堆面值为 V1、V2、V3 … 个单位的硬币，问最少需要多少个硬币才能找出总值为 T 个单位的零钱？
 * 解题思路：
 * 1，找出面值最接近T的硬币V
 * 2，将f(T)问题的求解转换成f(T-V)+1问题的求解，以此出现递归
 */
public class GreedyMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    //面值数
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        String b[] = new String[n];
        for (int i = 0; i < n; i++) {
            //将整型转换成字串
            b[i] = Integer.toString(a[i]);
        }
        String temp = "";
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (b[j].compareTo(b[j + 1]) <= 0) {
                    temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }
        String max = "";
        for (int i = 0; i < n; i++) {
            max = max + b[i];
        }
        System.out.println(max);
    }
}
