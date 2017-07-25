package offer;

/**
 * Created by Xulong on 2017/3/24.
 * 二进制中一的个数
 */
public class Solution1 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        System.out.println(s.NumberOf1(2));
    }

    public int NumberOf1(int n) {
//        System.out.println(Integer.toBinaryString(n));
//        int len = Integer.toBinaryString(n).length();
//        System.out.println(Integer.toBinaryString(n).substring(0, len));
//        return 0;

        int num = 0;

        char[] chars = Integer.toBinaryString(n).toCharArray();
        for (int i = 0; i < chars.length; i++ )
            if (chars[i] == '1')
                num++;

        return num;
    }
}
