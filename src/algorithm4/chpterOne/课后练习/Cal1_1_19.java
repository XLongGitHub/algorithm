package algorithm4.chpterOne.课后练习;

/**
 * Created by Xulong on 2016/11/26.
 */
public class Cal1_1_19 {
    public static void main(String args[])
    {
        for (int N = 0; N < 100; N++  ) {
            System.out.println(N + " " + F(N));
        }
    }

    public static long F(int N)
    {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N-1) + F(N-2);
    }
}
