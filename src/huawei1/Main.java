package huawei1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean flag = true;  //标记是否为正数
        String str = "" + num;
        int length = str.length();
        if (str.charAt(0) == '-') {
            flag = false;
            str = str.substring(1);
            length = length - 1;
        }
        System.out.println(str.length()); //输出长度
        //空格间隔输出结果
        if (!flag) System.out.print("-");
        for (int i  = 0; i <= length - 2; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.print(str.charAt(length - 1));
        System.out.println();
        //逆序整数
        if (!flag) System.out.print("-");
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
