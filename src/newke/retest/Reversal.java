package newke.retest;

import java.util.Scanner;

public class Reversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.next();
            System.out.println(reversal(str));
//            System.out.println(str);
        }
    }

    public static String reversal(String str) {
        int len = str.length();
        char[] chars = str.toCharArray();
        char[] chars1 = new char[len];
        for (int i = 0; i < len; i++) {
            chars1[len - i - 1] = chars[i];
        }
//        return chars1.toString();
        return new String(chars1);
    }
}
