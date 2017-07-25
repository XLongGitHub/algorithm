package ctrip;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/11.
 */
public class Sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "";
        while (sc.hasNextInt()) {
            string += sc.nextInt() + " ";
        }
        string = string.substring(0, string.length() - 1);
        String[] strings =string.split(" ");
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        for (int i = 0; i < ints.length; i+=2) {
            sum(ints[i], ints[i+1]);
        }
    }

    public static void sum(int n, int m) {
        double[] ints = new double[m];
        ints[0] = n;
        for (int i = 1; i < m; i++) {
            ints[i] = Math.sqrt(ints[i-1]);
        }
        output(ints);

    }

    public static void output(double[] m) {
        double sum = 0;
        for (int i = 0; i < m.length; i++)
            sum += m[i];
        System.out.printf("%.2f", sum);
    }
}
