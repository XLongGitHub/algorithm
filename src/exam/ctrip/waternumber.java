package ctrip;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/11.
 */
public class waternumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "";

        while (sc.hasNextInt()) {
            string += sc.nextInt() + " ";
        }
        string = string.substring(0, string.length() - 1);
        String[] strings = string.split(" " );
        int[] ints = new int[strings.length];
        for (int i = 0; i < ints.length; i++)
            ints[i] = Integer.parseInt(strings[i]);
        List[] lists = new LinkedList[ints.length / 2];

        for (int i  = 0; i < ints.length; i+=2) {
           //     lists[i/2] = waterNum(ints[i], ints[i+1]);
                printf(waterNum(ints[i], ints[i+1]));
        }
    }

    public static void printf(List list) {
        int len = list.size();
        for (int i = 0; i < len - 1; i++)
            System.out.print(list.get(i) + " ");
        System.out.println(list.get(len -1));
    }

    public static List waterNum(int lo, int hi) {
        List list = new LinkedList();
        for (int i = lo; i <= hi; i++)
            if (isWater(i))
                list.add(i);
        if (list.size() == 0)
            list.add("no");
        return list;

    }

    public static boolean isWater(int num) {
        String strnum = num+"";
        int len = strnum.length();
        char[] chars = strnum.toCharArray();
        int sum = 0;
        for (int i = 0; i < len; i++)
            sum += (chars[i] - '0') * (chars[i] - '0') * (chars[i] - '0');
        return sum == num;
    }

}
