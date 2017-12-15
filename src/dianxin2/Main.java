package dianxin2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 获取整数
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        List list = new LinkedList();

        for (int i = 0; i < str.length() ; i++) {
            String tmp = "";
            for (int j = i; j < str.length(); j++, i++) {
                char ch = str.charAt(j);
                if (isNum(ch)) {
                    tmp += ch;
                } else {
                    if (tmp.length() > 0) {
                        list.add(tmp);
//                        System.out.println(tmp);
                    }
                    break;
                }
            }
        }
        /**
         * 未数字
         */
        String tmp = "";
        char[] chars;
        for (int j = str.length() - 1; j >= 0; j-- ) {
            if (isNum(str.charAt(j))) tmp+= str.charAt(j);
            else break;
        }
        int len = tmp.length();
        if (len > 0) {
            chars = new char[len];
            for (int i = 0; i < tmp.length(); i++) {
                chars[len - i - 1] = tmp.charAt(i);
            }
            list.add(new String(chars));
        }

        int size = list.size();
        if (size >0) {
            if (size > 1) {
                for (int i = 0; i < size - 1; i++) {
                    System.out.print(list.get(i)+ " ");
                }
            }
            System.out.println(list.get(size-1));
        }
    }

    public static boolean isNum(char ch) {
        if (ch >= '0' && ch <= '9') return true;
        return false;
    }
}
