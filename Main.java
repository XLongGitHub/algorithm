
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by Xulong on 2017/4/8.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = new int[1000];
        for (int i = 0; i < ints.length; i++)
            ints[i] = -1;
        int pos = 0;
        while (sc.hasNext()) {
            ints[pos++] = sc.nextInt();System.out.println("out");
        }
     System.out.println("out2323");
        int[][] ints1 = new int[pos / 3 ][3];
        int [][] output = merge(ints1);
        for (int i = 0; i < output.length-1; i++) {
            System.out.print("["+output[i][0] +","+ output[i][1]+","+output[i][2]+"],");
        }
        System.out.print("["+output[output.length-1][0] +","+ output[output.length-1][1]+","+output[output.length-1][2]+"],");
    }

        public static int[][] merge(int[][] dataRangePrices) {
            Map map = new TreeMap();
            for (int i = 0; i < dataRangePrices.length; i++) {
                    map.put(dataRangePrices[0], dataRangePrices[2]);
                    map.put(dataRangePrices[1], dataRangePrices[2]);
            }

            int[][] output = new int[map.size() / 2 - 1][3];

            int[] segment = new int[dataRangePrices.length * 2];
            int pos = 0;
            for (int i = 0; i< dataRangePrices.length; i++) {
                segment[pos++] = dataRangePrices[i][0];
                segment[pos++] = dataRangePrices[i][1];
            }
            Arrays.sort(segment);
            int [] seg = new int[segment.length];
            int pos1 = 0;
            for (int i = 0; i < segment.length - 1; i++) {
                if (segment[i] != segment[i+1]) {
                    seg[pos1++] = segment[i];
                }
            }
            int pos2 = 0;
            for (int i = 0; i < output.length; i++)  {
                output[i][0] = seg[pos2];
                output[i][1] = seg[++pos2];
                output[i][2] = (int) map.get(seg[pos2]);
            }

            return output;
        }

//    public static int[][] merge(int[][] dataRangePrices) {
//        int start = dataRangePrices[0][0];
//        int end = dataRangePrices[0][1];
//        for (int i = 0; i < dataRangePrices.length; i++) {
//            if (start > dataRangePrices[i][0])
//                start = dataRangePrices[i][0];
//            if (end < dataRangePrices[i][1])
//                end = dataRangePrices[i][1];
//        }
//
//        int[] segment = new int[dataRangePrices.length * 2];
//        int pos = 0;
//        for (int i = 0; i< dataRangePrices.length; i++) {
//            segment[pos++] = dataRangePrices[i][0];
//            segment[pos++] = dataRangePrices[i][1];
//        }
//        Arrays.sort(segment);
//        int [] seg = new int[segment.length];
//        int pos1 = 0;
//        for (int i = 0; i < segment.length - 1; i++) {
//            if (segment[i] != segment[i+1]) {
//                seg[pos1++] = segment[i];
//            }
//        }
//    }
}
