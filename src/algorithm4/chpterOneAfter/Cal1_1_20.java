package algorithm4.chpterOneAfter;

import java.util.Scanner;

/**
 * Created by Xulong on 2016/11/26.
 */
public class Cal1_1_20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double sum = 0;
        for (int i=2; i<N; i++) {
            sum += ln(i);
        }
        System.out.println(sum);
        System.out.println(ln2(N));
    }

    public static double ln( double num) {
        return Math.log(num)/Math.log(2);
    }

    public static double ln2(double num) {
        if (num == 1) return 0;
        if (num == 0) return 0;
        else return ln2(num-1) + ln2(num-2);
    }
}
