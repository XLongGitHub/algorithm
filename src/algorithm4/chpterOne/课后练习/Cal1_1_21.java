package algorithm4.chpterOne.课后练习;

import java.util.Scanner;

/** * Created by Xulong on 2016/11/26.
 */
public class Cal1_1_21 {
    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String [] st2 = st1.split(" ");
//        System.out.println(st2.length);
        int num1 = Integer.parseInt(st2[1]);
        int num2 = Integer.parseInt(st2[2]);
        double num3 = num1/ num2;
        for (int i=0; i<st2.length; i++) {
           System.out.print(st2[i] + "   ");
        }
       // System.out.print(num3);
        System.out.printf("%.3f", num3);
    }
}
