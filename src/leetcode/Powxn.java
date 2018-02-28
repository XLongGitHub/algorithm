package leetcode;

public class Powxn {
    public double myPow(double x, int n) {
        double result = 1;
        if (n == 0) {
            return result;
        } else {
            if (n < 0) {
                for (int i = 0; i < -n; i++)
                    result *= x;

                    result = 1 / result;
            } else {
                for (int i = 0; i < n; i++) {
                    result *= x;
                    if (result == 0)
                        return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        double x = 0.00001;
        int n = 2147483647;
        double result = new Powxn().myPow(x, n);
        System.out.println(result);

    }

}
