package newke.offer;

/**
 * Created by Xulong on 2017/4/3.
 */
public class InversePairs {
    public static void main(String[] args) {
        InversePairs ip = new InversePairs();
        int [] arr = {1,2,3,4,5,6,7,0};
        System.out.println(ip.InversePairs(arr));
    }

    public int InversePairs(int[] array) {
        int[] ints = new int[array.length];
        return 0;
    }

//    您的代码已保存
//    运行超时:您的程序未能在规定时间内运行结束，请检查是否循环有错或算法复杂度过大。
//    case通过率为0.00%
//    public int InversePairs(int [] array) {
//        int[] count = new int[array.length];
//        int  P = 1000000007;
//        for (int i = 0; i < array.length; i++) {
////            if (array[i] < array[i - 1]) {
////                count[i] = count[i - 1] + 1;
////                continue;
////            }
////            if (array[i] == array[i - 1]) {
////                count[i] = count[i - 1];
////                continue;
////            }
//            for (int j = i; j < array.length; j++) {
//                if (array[i] > array[j])
//                    count[i]++;
//            }
//        }
//        int sum = 0;
//        for (int c : count)
//            sum += c;
//        return sum % P;
//    }
}
