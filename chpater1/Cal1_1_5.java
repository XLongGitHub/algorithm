import java.util.Scanner;

/**
 * Created by Xulong on 2016/11/18.
 */
public class Cal1_1_5 {
    static double LOW = (double)0;
    static double HIGH = (double)1;

    public static void main(String args[]) {

        print(LOW);
        print(HIGH);
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        print(compare(x) && compare(y));
    }

    public static boolean compare(double x) {
         if (x >= LOW && x <= HIGH){
            return true;
        } else {
            return false;
        }
    }

    static void print(Object o) {
        System.out.println(o);
    }
}
