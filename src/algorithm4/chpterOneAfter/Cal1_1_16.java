package algorithm4.chpterOneAfter;

/**
 * Created by Xulong on 2016/11/22.
 */
public class Cal1_1_16 {
    public static void main(String agrs[]) {
        System.out.println(exR2(3));
    }

    public static String exR1(int n) {
        if (n <=0) return "";
        return  exR1(n-3) + n + exR1(n-2) + n;
    }
    public static String exR2(int n) {
        String s = exR2(n-3) + n + exR2(n-2) + n;    //此处在不断地分配内存，不能访问到后一句判断条件
        if (n <=0) return "";
        return s;
    }
}
