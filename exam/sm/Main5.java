package sm;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/8.
 */
class Pos {
    int pos;
    int price;
    public Pos(int pos, int price) {
        this.pos = pos;
        this.price = price;
    }
}
public class Main5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str  = "";
//        while (sc.hasNext()) {
//            str += sc.nextLine() + ",";
//        }
//        String[] strings = str.split(",");
//        for(int i = 0)

        int[] ints = new int[1000];
        for (int i = 0; i < ints.length; i++)
            ints[i] = -1;
        int pos = 0;
//        while (sc.hasNextInt()) {
//            ints[pos++] = sc.nextInt();System.out.println("out");
//        }
        for (int i = 0; i < 6; i++)
            ints[pos++] = sc.nextInt();
//        while ((ints[pos++] = sc.nextInt())
//     System.out.println("out2323");
        int p = 0;
        int[][] ints1 = new int[pos / 3][3];
        for (int i = 0; i < ints1.length; i++) {
            for (int j = 0; j < 3; j++)
                ints1[i][j] = ints[p++];
        }
        int[][] output = merge(ints1);
        for (int i = 0; i < output.length - 1; i++) {
            System.out.print("[" + output[i][0] + "," + output[i][1] + "," + output[i][2] + "],");
        }
        System.out.print("[" + output[output.length - 1][0] + "," + output[output.length - 1][1] + "," + output[output.length - 1][2] + "],");
    }

    public static int[][] merge(int[][] dataRangePrices) {
        int start = dataRangePrices[0][0];
        int end = dataRangePrices[0][1];
        for (int i = 0; i < dataRangePrices.length; i++) {
            if (start > dataRangePrices[i][0])
                start = dataRangePrices[i][0];
            if (end < dataRangePrices[i][1])
                end = dataRangePrices[i][1];
        }

        int[] prices = new int[end+1];

        for (int i = 0; i < dataRangePrices.length; i++) {
            for (int j = dataRangePrices[i][0]; j <= dataRangePrices[i][1]; j++) {
                prices[j] = dataRangePrices[i][2];
            }
        }
        Pos[] poss = new Pos[prices.length];
        for (int i = 0; i < prices.length; i++) {
            poss[i] = new Pos(i, prices[i]);
        }
//        for (int i : prices)
//            System.out.println(i + "  ");
        //时间点
        int count = 0;
        for (int i = 0; i < prices.length-1; i++)
            if (prices[i] != prices[i+1])
                count++;
//        if (prices.length-1 != prices.length)
//            count++;
        int[][] output = new int[count][2];
//        while (true) {
//            int i = 0;
//            output[i][0] =
//        }

//        for (int i = 0; i < prices.length; i++) {
//            if (prices[i] != prices[i+1])
//            output[j][0] = i;
//
//        }
        int pos4 = 0;
        for (int i = 0; i < prices.length - 1 ; i++) {
            if (prices[i] != prices[i+1]) {
                output[pos4][0] = i;
                output[pos4++][1] = prices[i];
            }
        }

        int[][] out = new int[output.length - 1][3];
        for (int i = 0; i < out.length; i++) {
            out[i][0] = output[i][0];
            out[i][2] = output[i][1];
            out[i][1] = output[i+1][0] - 1;
        }



        return out;
      //  return dataRangePrices;
    }
}
