package sm;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/10.
 */
public class CoinsChange {
    /**
     * 硬币找零：动态规划算法
     *
     * @param values
     *            :保存每一种硬币的币值的数组
     * @param valueKinds
     *            :币值不同的硬币种类数量，即coinValue[]数组的大小
     * @param money
     *            :需要找零的面值
     * @param coinsUsed
     *            :保存面值为i的纸币找零所需的最小硬币数
     */
    public static void makeChange(int[] values, int valueKinds, int money,
                                  int[] coinsUsed) {

        coinsUsed[0] = 0;
        //最下面值的金币
        //int cent = values[valueKinds-1];
        int cent = 1;


        // 对每一分钱都找零，即保存子问题的解以备用，即填表
        for (int cents = cent; cents <= money; cents += cent) {
            int sum = 0;
            // 当用最小币值的硬币找零时，所需硬币数量最多
            int minCoins = cents / cent;

            // 遍历每一种面值的硬币，看是否可作为找零的其中之一
            for (int kind = 0; kind < valueKinds; kind++) {
                // 若当前面值的硬币小于当前的cents则分解问题并查表
                if (values[kind] <= cents) {
                    int temp = coinsUsed[cents - values[kind]] + 1;
                    sum += values[kind];
                    if (temp < minCoins) {
                        minCoins = temp;
                    }
                }
            }

            if (sum == money) {
//                // 保存最小硬币数
//                coinsUsed[cents] = minCoins;
//
//                System.out.println("面值为 " + (cents) + " 的最小硬币数 : "
//                        + coinsUsed[cents]);
                System.out.println(coinsUsed[cents]);
                System.exit(0);
            }
        }
        System.out.println(-1);
        System.out.println(0);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String string = "";
        while (sc.hasNextInt()) {
            string += sc.nextInt() + " ";
        }
        System.out.println(string);
        string = string.substring(0, string.length() - 1);
        String[] strings = string.split(" ");
        int[] coinValue = new int[strings.length - 1];
        for (int i = 0; i < coinValue.length; i++)
            coinValue[i] = Integer.parseInt(strings[i]);
        int money = Integer.parseInt(strings[strings.length - 1]);
        for (int i = 0; i < coinValue.length; i++) {
            for (int j = i; j < coinValue.length; j++) {
                if (coinValue[i] < coinValue[j]) {
                    int temp = coinValue[i];
                    coinValue[i] = coinValue[j];
                    coinValue[j] =temp;
                }
            }
        }

        // 硬币面值预先已经按降序排列
//        int[] coinValue = new int[] { 25, 21, 10, 5, 1 };
        // 需要找零的面值
//        int money = 63;
        // 保存每一个面值找零所需的最小硬币数，0号单元舍弃不用，所以要多加1
        int[] coinsUsed = new int[money + 1];

        makeChange(coinValue, coinValue.length, money, coinsUsed);
    }
}
