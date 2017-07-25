package offer;



/**
 * Created by Xulong on 2017/3/24.
 * 字符串，向整型数转换
 */
public class StrToInt {

    public static void main(String[] args) {
        int a = '1';
//        System.out.println(a);
        StrToInt sti = new StrToInt();
        String str = "-2147483648";  //整数的范围
        System.out.println(sti.StrToInt(str));
    }

    public int StrToInt(String str) {

        if (str.length() == 0) return 0;
        char[] chars = str.toCharArray();
        if (chars[0] == '0') return 0;
        if ( '0' <= str.charAt(0) && '9' >= str.charAt(0)) {
            for (int i = 0; i < chars.length; i++) {
                if (!('0' <= chars[i] && chars[i] <= '9'))
                    return 0;
            }

            int start = 0 ;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == 0)
                    start++;
                else break;
            }
            int[] ints = new int[chars.length-start];
            if (ints.length == 0) return 0;

            for (int i = start; i < chars.length; i++) {
                ints[i-start] = (int) chars[i] - 48;
            }

            int num = 0;

                for (int i = 0; i < ints.length; i++)
                    num += ints[i] * Math.pow(10,(ints.length - i - 1));
                return num;

        } else {
            if (!( str.charAt(0) == '+' || str.charAt(0) == '-'))
                return 0;

            for (int i = 1; i < chars.length; i++) {
                if (!('0' <= chars[i] && chars[i] <= '9'))
                    return 0;
            }

            int start = 0 ;
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == 0)
                    start++;
                else break;
            }
            int[] ints = new int[chars.length-start-1];
            if (ints.length == 0) return 0;

            for (int i = start+1; i < chars.length; i++) {
                ints[i-start-1] = (int) chars[i] - 48;
            }

//            int num = -2147483648;

            int num = 0;
            if (str.charAt(0) == '+') {
                for (int i = 0; i < ints.length; i++)
//            num *= ints[i];
                    num += ints[i] * Math.pow(10,(ints.length - i - 1));
                return num;
            } else {
                for (int i = 0; i < ints.length; i++)
//            num *= ints[i];
                    num += ints[i] * Math.pow(10,(ints.length - i - 1));
                if (ints[ints.length-1] == 8)
                    num = -num - 1;
                else num = - num;
                return num;

            }

        }

    }

}
