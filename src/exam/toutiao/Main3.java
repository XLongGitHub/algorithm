package toutiao;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/18.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strings = str.split(" ");
//        int[] ints = new int[strings.length];
//        int count = 0;
        int num1 = Integer.parseInt(strings[0]);
        int num2 = Integer.parseInt(strings[2]);
//        double ans = 0.0;
        int ans = 0;

        if (strings[1].equals("+")) {
            ans = num1 + num2;
        }
        if (strings[1].equals("-")) {
            ans = num1 - num2;
        }
        if (strings[1].equals("*")) {
            ans = num1 * num2;
        }
        if (strings[1].equals("/")) {
            ans = num1 / num2;
        }
        char[][] nu = {{' ',' '},{' ',' '},{' ',' '},{' ',' '},{' ',' '}};
//        String sh = ints[0] +  strings[1] + ints[1] + "="+ans;
        String sh = ""+num1+strings[1]+num2+"="+ans;
//        System.out.println(sh);
//        System.out.println(sh.length());
        char[] chars = sh.toCharArray();
//        for (int i = 0; i < chars.length-1; i++) {
//            num(chars[i]);
//            print(nu);
//        }
//        num(chars[chars.length-1]);

        char[][] chars1 = new char[5][10000];
        int pos = 0;
        for (int i = 0; i < chars.length; i++) {
            char[][] temp =  num(chars[i]);

            for (int j = 0; j < temp.length; j++) {
                for (int k = 0; k < temp[0].length; k++) {
//                    pos = i*5+k;
                    chars1[j][pos+k] = temp[j][k];
                }
            }
            pos += temp[0].length;
            for (int j = 0; j < 5; j++) {
                for (int k = 0; k < 2; k++) {
                    chars1[j][pos+k] = ' ';
                }
            }
            pos += 2;

        }
        printf(chars1);

    }



    public static char[][] num(char ch) {

        char[][] one = {{'*'},{'*'},{'*'}, {'*'}, {'*'}};
        char[][] two = {{'*','*','*'},{' ', ' ','*'},{'*','*','*'}, {'*',' ', ' '}, {'*','*','*'}};
        char[][] three = {{'*','*','*'},{' ', ' ','*'},{'*','*','*'}, {' ',' ', '*'}, {'*','*','*'}};
        char[][] four = {{'*',' ', '*'},{'*',' ','*'},{'*','*','*'}, {' ', ' ', '*'}, {' ', ' ', '*'}};
        char[][] five = {{'*','*','*'},{ '*', ' ',' '},{'*','*','*'}, {' ',' ', '*'}, {'*','*','*'}};
        char[][] six = {{'*','*','*'},{ '*', ' ',' '},{'*','*','*'}, {'*',' ', '*'}, {'*','*','*'}};
        char[][] seven = {{'*','*','*'},{ ' ', ' ','*'},{' ',' ','*'}, {' ',' ', '*'}, {' ',' ','*'}};
        char[][] eight = {{'*','*','*'},{ '*', ' ','*'},{'*','*','*'}, {'*',' ', '*'}, {'*','*','*'}};
        char[][] nine = {{'*','*','*'},{ '*', ' ','*'},{'*','*','*'}, {' ',' ', '*'}, {'*','*','*'}};
        char[][] zero = {{'*','*','*'},{ '*', ' ','*'},{'*',' ','*'}, {'*',' ', '*'}, {'*','*','*'}};

        char[][] add = {{' ',' ',' '},{' ','*',' '},{'*','*','*'},{' ','*',' '},{' ',' ',' '}};
        char[][] jian = {{' ',' ',' '},{' ',' ',' '},{'*','*','*'},{' ',' ',' '},{' ',' ',' '}};
        char[][] mul = {{' ',' ',' '},{'*',' ','*'},{' ','*',' '},{'*',' ','*'},{' ',' ',' '}};
        char[][] div = {{' ',' ',' '},{' ',' ','*'},{' ','*',' '},{'*',' ',' '},{' ',' ',' '}};
        char[][] dian = {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '},{' ','*','*'},{' ','*','*'}};
        char[][] equ = {{' ',' ',' '},{'*','*','*'},{' ',' ',' '},{'*','*','*'},{' ',' ',' '}};


        if (ch == '0') return zero;
        else if (ch == '1') return one;
        else if (ch == '2') return two;
        else if (ch == '3') return three;
        else if (ch == '4') return four;
        else if (ch == '5') return five;
        else if (ch == '6') return six;
        else if (ch == '7') return seven;
        else if (ch == '8') return eight;
        else if (ch == '9') return nine;
        else if (ch == '+') return add;
        else if (ch == '-') return jian;
        else if (ch == '*') return mul;
        else if (ch == '/') return div;
        else if (ch == '.') return dian;
        else if (ch == '=') return equ;
        char[][] nu = {{ },{ },{ },{ },{ }};
        return nu;
    }

    public static char[][] print(char[][] chars) {
        return chars;
//        for (int i = 0; i  <chars.length; i++) {
//            for (int j = 0; j  < chars[0].length; j++)
//                System.out.print(chars[i][j]);
////            System.out.println();
//        }
    }

    public static void  printf(char[][] chars) {
        for (int i = 0; i  <chars.length; i++) {
            for (int j = 0; j  < chars[0].length - 2; j++)
                System.out.print(chars[i][j]);
            System.out.println();
        }
    }
}
