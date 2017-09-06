package algorithm4.chpterOne.课后练习;

import java.util.Scanner;

/**
 * Created by Xulong on 2016/11/26.
 * 
 */

public class Cal1_1_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String aim = "abcdgjkil";
        String dec = sc.nextLine();
        char [] aimarr = aim.toCharArray();
        char [] decarr = dec.toCharArray();
        for (int i=0; i<decarr.length; i++) {
            if (aim.indexOf(decarr[i]) != -1) {
                int flag = rank(decarr[i], aimarr);
                char out = (flag > -1 && flag < decarr.length) ? '+' : '-';  //返回的类型应当匹配。
                System.out.print(out);
            } else {
                System.out.print("-");
            }
        }
    }

   public static int rank(char key, char[]a) {
       return rank(key, a, 0, a.length-1);
   }

   public static int rank(char key , char[] a, int lo, int hi) {
       int mid = (lo + hi) / 2;
       if (mid < 0) return -1;
       else if (a[mid] > key) return rank(key, a, lo, mid-1);
       else if (a[mid] < key) return rank(key, a, lo+1,  hi);
       else return mid;
   }
}
