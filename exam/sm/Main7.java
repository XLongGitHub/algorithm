package exam.sm;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/9.
 */
public class Main7 {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isSqrt(num));
    }

    public static boolean isSqrt(int num) {
        if (num % 2 == 1) return false;
        if ( num == 2 ) return true;
        return isSqrt(num / 2);
    }
}
