package sm;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/8.
 */
public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        String snum = ""+num;
        int back = m.db(num);
        if (back == num && back < 9) {
            System.out.println( ++back);
        } else if (back == num ) {
            System.out.println( back+2);
        } else {
            System.out.println( back);
        }
    }

    public int db(int num) {
        int i = num;
        for (; ;i++) {
            if (!isDb(i)) continue;
            break;
        }
        return i;
//        char[] chars = snum.toCharArray();
//        int len = chars.length;
//        if (len % 2 == 1) {
//            int mid = len / 2;
//            if (chars[mid] < '9') {
//                chars[mid] += '1';
//            } else {
//                chars[mid] += '0';
//                chars[mid + 1] += '1';
//                chars[mid - 1] += '1';
//            }
//        } else {
//
//        }
    }

    public boolean isDb(int num) {
        String snum = "" + num;
        char[] chars = snum.toCharArray();
        int len = chars.length;
        if (len % 2 == 0) {
            for (int i = 0; i < len / 2 ; i++)
                if (chars[i] != chars[len - 1 - i])
                    return false;
        } else {
            for (int i = 0; i < len / 2; i++)
                if (chars[i] != chars[len - 1 - i])
                    return false;
        }
        return true;
    }
}
