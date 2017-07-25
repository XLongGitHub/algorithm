package newke.offer;

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
        int[] coinUsed = new int[ints.length + 1];
        System.out.println(judge(ints,ints.length,  money, coinUsed));

    }

    public static int judge(int[] ints, int length, int money, int[] coinUsed) {
        coinUsed[0]  = 0;
        for (int cents = ints[length-1]; cents < money; cents += ints[length -1]) {
            int minCoin = ints[length-1];
            for (int kind = 0; kind < length; kind++) {
                if (ints[kind] <= cents) {
                    int temp = coinUsed[cents - ints[kind]] + 1;
                    if (temp < minCoin)
                        minCoin = temp;
                }
            }
            coinUsed[cents] = minCoin;
            System.out.println("��ֵΪ " + (cents) + " ����СӲ���� : "
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
}