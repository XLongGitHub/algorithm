package newke.offer;

import java.util.TreeSet;

/**
 * Created by Xulong on 2017/3/26.
 * 丑数
 */
public class GetUglyNumber {
    public static void main(String[] args) {
        GetUglyNumber ugly = new GetUglyNumber();
//        System.out.println(ugly.isUglyNumber(0));
//        System.out.println(ugly.isUglyNumber(1));
//        System.out.println(ugly.isUglyNumber(2));
//        System.out.println(ugly.isUglyNumber(3));
//        System.out.println(ugly.isUglyNumber(4));
//        System.out.println(ugly.isUglyNumber(5));
//        System.out.println(ugly.isUglyNumber(14, 14, 0, 0, 0));
//        for (int i = 0 ; i < 20; i++)
//            System.out.println(i + " : " + ugly.GetUglyNumber_Solution(i));
        int i = 6;
        System.out.println(i + " : " + ugly.GetUglyNumber_Solution(i));
//        System.out.println(min(1, 3, 5));

    }

    public int GetUglyNumber_Solution(int index) {
        if (index == 1) return 1;
        if (index == 2) return 2;
        if (index == 3) return 3;
        if (index == 4) return 4;
        if (index == 5) return 5;
        int[] ints = new int[index];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        ints[4] = 5;

        int cnt2 = 0;
        int cnt3 = 0;
        int cnt5 = 0;

        int mul2 = 1;
        int mul3 = 1;
        int mul5 = 1;
        int tmp2 = 1;
        int tmp3 = 1;
        int tmp5 = 1;
        for (int i = 5; i < index; i++) {
//            tmp2 = ints[i-1] * 2;
//            tmp3 = ints[i-1] * 3;
//            tmp5 = ints[i-1] * 5;
            for (int j = 0; j < i; j++) {
                tmp2 = ints[j] * 2;
                if (tmp2 > ints[i - 1]) break;
            }
            for (int j = 0; j < i; j++) {
                tmp3 = ints[j] * 3;
                if (tmp3 > ints[i - 1]) break;
            }
            for (int j = 0; j < i; j++) {
                tmp5 = ints[j] * 5;
                if (tmp5 > ints[i - 1]) break;
            }

            ints[i] = min(tmp2, tmp3, tmp5);
            if (ints[i] == tmp2) cnt2++;
            if (ints[i] == tmp3) cnt3++;
            if (ints[i] == tmp5) cnt5++;
        }

        return ints[index - 1];
    }

    public static int min(int a, int b, int c) {
        return a < b ? c < a ? c : a : c < b ? c : b;
    }

//    /**
//     * 求第n个丑数
//     * @param index
//     * @return
//     */
//    public int GetUglyNumber_Solution(int index) {
//
//        //此方法运算量过大
//        TreeSet<Integer> result = new TreeSet<>();
//        result.add(0);
//        int i = result.last(); //下个一个丑数的起点，从上一个丑数开始运算+
//        while (index > 0) {
//            if (isUglyNumber(i, i, 0, 0, 0, result))  {
//                if (--index == 0) break;
//            }
//            i++;
//        }
//        return i;
//    }
//
//    /**
//     *
//     * @param nn  当前需要判断的数据
//     * @param num 每次分解因子后得到的数据
//     * @param a 因子中2的个数
//     * @param b 因子中3的个数
//     * @param c 因子中4的个数
//     * @param result  当前丑数集合
//     * @return
//     */
//    public boolean isUglyNumber(int nn, int num, int a, int b, int c, TreeSet<Integer> result) {
//        if (num <= 0) return false;
//        if (num == 1) {
//            int ugly = (int) (Math.pow(2, a) * Math.pow(3, b) * Math.pow(5, c));
//            if (nn == ugly) {
//                result.add(nn);
//                return true;
//            }
//        }
//        //若分解后得到的数为丑数，则该数为丑数
//        if (nn != num) {
//            if (result.contains(num)) return true;
//        }
//
//        if (num / 2 >  0 || num / 3 > 0 || num / 5 > 0) {
//            if (num % 2 == 0) return isUglyNumber(nn,num / 2, a+1, b, c, result);
//            if (num % 3 == 0) return isUglyNumber(nn,num / 3, a, b+1, c, result);
//            if (num % 5 == 0) return isUglyNumber(nn,num / 5, a, b, c+1, result);
//        }
//
//        return false;
//    }
//
////    public boolean isUglyNumber(int nn, int num, int a, int b, int c) {
////        if (num <= 0) return false;
////        if (num == 1) {
////            int ugly = (int) (Math.pow(2, a) * Math.pow(3, b) * Math.pow(5, c));
////            if (nn == ugly)
////                return true;
//////            return false;
////        }
////
////        if (num / 2 > 0) return isUglyNumber(nn,num / 2, a+1, b, c);
////        if (num / 3 > 0) return isUglyNumber(nn,num / 3, a, b+1, c);
////        if (num / 5 > 0) return isUglyNumber(nn,num / 5, a, b, c+1);
////        return false;
////    }
//
//    //运行超时:您的程序未能在规定时间内运行结束，请检查是否循环有错或算法复杂度过大。
////    public boolean isUglyNumber(int nn, int num, int a, int b, int c) {
////        if (num <= 0) return false;
////        if (num == 1) {
////            int ugly = (int) (Math.pow(2, a) * Math.pow(3, b) * Math.pow(5, c));
////            if (nn == ugly)
////                return true;
//////            return false;
////        }
////
////        if (num / 2 >  0 || num / 3 > 0 || num / 5 > 0) {
////            if (num % 2 == 0)return isUglyNumber(nn,num / 2, a+1, b, c);
////            if (num % 3 == 0) return isUglyNumber(nn,num / 3, a, b+1, c);
////            if (num % 5 == 0) return isUglyNumber(nn,num / 5, a, b, c+1);
////        }
////
////        return false;
////    }
}
