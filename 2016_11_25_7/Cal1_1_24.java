import java.util.Scanner;

/**
 * Created by Xulong on 2016/11/26.
 */
public class Cal1_1_24 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(gcd(num1 ,num2, 0));
    }

    /**
     * 添加深度表示
     * /
    public static int gcd(int p, int q, int deep) {
        System.out.println(deep + ":   " + p + "   "+ q);
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r, ++deep);
    }
}
