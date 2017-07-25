package algorithm4.chpterOne.课后练习;
import java.util.Scanner;

/**
 * Created by Xulong on 2016/11/15.
 */
public class Cal1_1_3 {
    public static void main(String args[]){
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a == b && a == c) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
