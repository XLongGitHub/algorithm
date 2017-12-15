package pinduoduo1;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * 气温采样
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String[] strings = new String[n];
        sc.nextLine();
        for (int i = 0; i < strings.length; i++) {
            strings[i] = sc.nextLine();
        }
        //寻找可信数
        List<Integer> list = new LinkedList();
//        String[][] ss = new String[n][2];
        int[][] ints = new int[n][2];
        for (int i = 0; i < strings.length; i++) {
            String[] strs1 = strings[i].split(" ");
//            System.out.println(strs1);
            ints[i][0] = Integer.parseInt(strs1[0]);
            ints[i][1] = Integer.parseInt(strs1[1]);
        }
        int minNum = ints[0][0];
        int maxNum = ints[0][1];
        for (int i = 0; i < ints.length; i++) {
            if (minNum > ints[i][0]) minNum = ints[i][0];
            if (maxNum < ints[i][1]) maxNum = ints[i][1];
        }

        for (int i = minNum; i <= maxNum; i++) {
            if(isBelieve(ints, k, i)) list.add(i);
        }
        if (list.size() > 1) {

            int min = list.get(0);
            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) {
                if (min > list.get(i)) min = list.get(i);
                if (max < list.get(i)) max = list.get(i);
            }
            System.out.println(min + " " + max);
        } else {
            System.out.println("error");
        }

    }


    public static boolean isBelieve(int[][] ints, int k, int num) {
        int count = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i][0] <= num && num <= ints[i][1])
                count++;
        }
        return count == k;
    }

    public static boolean isBelieve(String[] strs, int k, int num) {
        int count = 0;
        for (int i = 0; i < strs.length; i++) {
            String[] strs1 = strs[i].split(" ");
            int num1 = Integer.parseInt(strs1[0]);
            int num2 = Integer.parseInt(strs1[1]);
            if (num1 <= num && num <= num2)
                count++;
        }
        return count == k;
    }
}
