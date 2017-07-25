package sm;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/9.
 */
public class Main9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = "";
        while (sc.hasNextInt()) {
            string += sc.nextInt() + " ";
        }
        System.out.println(string);
        string = string.substring(0, string.length() - 1);
        String[] strings = string.split(" ");
        int[] ints = new int[strings.length - 1];
        for (int i = 0; i < ints.length; i++)
            ints[i] = Integer.parseInt(strings[i]);
        int money = Integer.parseInt(strings[strings.length - 1]);
        for (int i = 0; i < ints.length; i++) {
            for (int j = i; j < ints.length; j++) {
                if (ints[i] < ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] =temp;
                }
            }
        }
        int[] coinUsed = new int[ints[0] + 1];
        System.out.println(judge(ints,ints.length,  money, coinUsed));

    }

    public static int judge(int[] ints, int length, int money, int[] coinUsed) {
        coinUsed[0]  = 0;
        for (int cents = ints[length-1]; cents < money; cents += ints[length -1]) {
//            int minCoin = ints[length-1];
            int minCoin = money / ints[length - 1];
            for (int kind = 0; kind < length; kind++) {
                if (ints[kind] <= cents) {
                    int temp = coinUsed[cents - ints[kind]] + 1;
                    if (temp < minCoin)
                        minCoin = temp;
                }
            }
            coinUsed[cents] = minCoin;
            System.out.println("面值为 " + (cents) + " 的最小硬币数 : "
                    + coinUsed[cents]);
        }

        return sum(coinUsed) == 0? -1 : sum(coinUsed);
    }

    public static int sum(int[] ints) {
        int sum = 0;
        for (int i = 0; i < ints.length; i++)
            sum += ints[i];
        return sum;
    }
//        1.构建最小步数，然后逐渐累加上去
//    public int judge(int[] ints, int money) {
//        int len = ints.length;
//        int[] days = new int[ints.length];
//        Arrays.sort(ints);
//        if (money %  ints[0] != 0) return -1;
//        for (int i = 0; i  < len; i++) {
//            if (money - ints[i] >= 0)
//                days[i] += 1;
//        }
//
////      return min(judge(ints, ))
//    }

    public int min(int[] ints) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (min > ints[i])
                min = ints[i];
        }
        return min;
    }
//    public int min(int a, int b) {
//        return a > b ? a : b;
//    }

//    public static int judge(int[] ints, int money) {
//        int len = ints.length;
//        Arrays.sort(ints);
//        if (ints[0] > money) return -1;
//        int day = money / ints[len - 1];
//        if (day * ints[len - 1] == money)
//            return day;
//
//        return 0;
//    }
}
