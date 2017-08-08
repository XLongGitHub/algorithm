package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
//        int a = 9646324351;
        int a = 1534236469;
        System.out.println(reverse(a));
    }

    public static int reverse(int x) {

        boolean flag = (x >= 0) ? true : false;
        String str = "" + x;
        if (!flag) {
            str = str.substring(1);
        }
        char[] chars = str.toCharArray();
        int num = 0;
        for (int i  = 0; i < chars.length; i++)
            num += ((int)chars[i] - 48) * Math.pow(10, i);
        if (num >= 2147483647) return 0; //处理边界问题
        if (!flag)
            num *= -1;
        return num;

    }


}
