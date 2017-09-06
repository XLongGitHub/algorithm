package algorithm4.chpterOne.课后练习;

/**
 * Created by Xulong on 2016/11/22.
 */
public class Cal1_1_18 {
    public static void main(String [] args) {
         System.out.println(mystery(2, 25));
         System.out.println(mystery(3, 11));

    }

    public static int mystery(int a, int b) {
        if (b==0) return 0;
        if (b%2==0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }
}
