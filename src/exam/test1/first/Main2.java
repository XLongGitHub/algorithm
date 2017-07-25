package exam.test1.first;


import java.util.Scanner;

/**
 * Created by Xulong on 2017/3/23.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] strs = new String[N];
        sc.nextLine();
        for (int i = 0; i < N; i++) {
            strs[i] = sc.nextLine();
        }

        for (int i = 0; i < N; i++) {
            char[] as = strs[i].toCharArray();
            char[] temp = sort(as);
//            strs[i] = temp.toString();
            String s = "";
            for (int j = 0; j < temp.length; j++)
                s += temp[j];
            strs[i] = s;
        }

        strs = sort(strs);
        int count = 1;
        for (int i = 0; i < N-1; i++) {
//            if (strs[i] != strs[i+1])
            if (!strs[i].equals(strs[i+1]))
                count++;
        }

        System.out.println(count);
    }

    public static char[] sort(char[] c) {
        int len = c.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (c[i] > c[j]) {
                    char temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
        return c;
    }

    public static String[] sort(String[] s) {
        int len = s.length;
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (s[i].compareTo(s[j]) > 0 ) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        return s;
    }
}
