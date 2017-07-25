//package sm;
//
//import java.util.Arrays;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.TreeMap;
//
///**
// * Created by Xulong on 2017/4/8.
// */
//public class Main3 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////        String str  = "";
////        while (sc.hasNext()) {
////            str += sc.nextLine() + ",";
////        }
////        String[] strings = str.split(",");
////        for(int i = 0)
//
//        int[] ints = new int[1000];
//        for (int i = 0; i < ints.length; i++)
//            ints[i] = -1;
//        int pos = 0;
////        while (sc.hasNextInt()) {
////            ints[pos++] = sc.nextInt();System.out.println("out");
////        }
//        for (int i = 0; i < 6; i++)
//            ints[pos++] = sc.nextInt();
////        while ((ints[pos++] = sc.nextInt())
////     System.out.println("out2323");
//        int p = 0;
//        int[][] ints1 = new int[pos / 3][3];
//        for (int i = 0; i < ints1.length; i++) {
//            for (int j = 0; j < 3; j++)
//                ints1[i][j] = ints[p++];
//        }
//        int[][] output = merge(ints1);
//        for (int i = 0; i < output.length - 1; i++) {
//            System.out.print("[" + output[i][0] + "," + output[i][1] + "," + output[i][2] + "],");
//        }
//        System.out.print("[" + output[output.length - 1][0] + "," + output[output.length - 1][1] + "," + output[output.length - 1][2] + "],");
//    }
////
////        public static int[][] merge(int[][] dataRangePrices) {
////            Map map = new TreeMap();
////            for (int i = 0; i < dataRangePrices.length; i++) {
////                    map.put(dataRangePrices[i][0], dataRangePrices[i][2]);
////                    map.put(dataRangePrices[i][1], dataRangePrices[i][2]);
////            }
////
////            int[][] output = new int[map.size()  - 1][3];
////
////            int[] segment = new int[dataRangePrices.length * 2];
////            int pos = 0;
////            for (int i = 0; i< dataRangePrices.length; i++) {
////                segment[pos++] = dataRangePrices[i][0];
////                segment[pos++] = dataRangePrices[i][1];
////            }
////            Arrays.sort(segment);
////            int [] seg = new int[segment.length];
////            int pos1 = 0;
////            for (int i = 0; i < segment.length - 1; i++) {
////                if (segment[i] != segment[i+1]) {
////                    seg[pos1++] = segment[i];
////                }
////            }
////            if (segment[segment.length-1] != segment[segment.length-2])
////                seg[pos1++] = segment[segment.length-1];
////            int pos2 = 0;
////            for (int i = 0; i < output.length; i++)  {
////                output[i][0] = seg[pos2];
////                output[i][1] = seg[++pos2];
////                output[i][2] = (int) map.get(seg[pos2-1]);
////            }
////
////            return output;
////        }
//
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
//        int[] prices = new int[end - start];
//
//        for (int i = 0; i < dataRangePrices.length; i++) {
//            for (int j = dataRangePrices[i][0]; j < dataRangePrices[i][1]; j++) {
//                prices[j] = dataRangePrices[i][2];
//            }
//        }
//
//        for (int i : prices)
//            System.out.println(i + "  ");
//    }
//
//
//}
//
////        int[] segment = new int[dataRangePrices.length * 2];
////        int pos = 0;
////        for (int i = 0; i< dataRangePrices.length; i++) {
////            segment[pos++] = dataRangePrices[i][0];
////            segment[pos++] = dataRangePrices[i][1];
////        }
////        Arrays.sort(segment);
////        int [] seg = new int[segment.length];
////        int pos1 = 0;
////        for (int i = 0; i < segment.length - 1; i++) {
////            if (segment[i] != segment[i+1]) {
////                seg[pos1++] = segment[i];
////            }
////        }
////    }
////}
