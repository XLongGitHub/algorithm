package saima.prac;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 约德尔测试
 */
public class YD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yd = sc.nextLine();
        String hg = sc.nextLine();
        int same = 0;
        char[] chars = new char[yd.length()];
        for (int i = 0; i <yd.length(); i++) {
            if (isNum(yd.charAt(i)) || isChar(yd.charAt(i))){
                chars[i] = '1';
            } else {
                chars[i] = '0';
            }
            if (chars[i] == hg.charAt(i)) same++;

        }
        System.out.println(Arrays.toString(chars));
        System.out.println(same);
        System.out.println(yd.length());
//        System.out.println(same / yd.length());
//        double bilv = (double) (int)((double) same / yd.length() * 10000) / 100;
        double bilv = (double)same / yd.length();
        DecimalFormat df = new DecimalFormat("#.00");
//        System.out.println(String.format("%.2f/%", bilv));
        System.out.printf("%.2f%%", bilv * 100);
    }

    public static boolean isNum(char c) {
        if ('0' <= c && '9' >= c) return true;
        return false;
    }

    public static boolean isChar(char c) {
        if ('a' <= c && c <= 'z' || 'A' <= c && c <= 'Z') return true;
        return false;
    }
}
