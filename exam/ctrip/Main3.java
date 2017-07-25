package ctrip;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/11.
 */
public class Main3 {

    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        String string = "";
        while (sc.hasNextInt()) {
            string += sc.nextInt() + " ";
        }
        string = string.substring(0, string.length() - 1);
        String[] strings = string.split(" ");
        int[] ints = new int[strings.length -1];
        for (int i = 0; i < ints.length - 1; i++)
            ints[i] = Integer.parseInt(strings[i]);

        int max = 0;

//        int sum = ints[0];
//        for (int i = 0; i < ints.length; i++) {
//            if (ints[i] > ints[i+1]) {
//
//
//            }
//
//        }
        for (int i = 0; i < ints.length; i++) {
            max += ints[i] - ints[i+1];
        }
        System.out.println(max);
    }
}
