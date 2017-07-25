package sm;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/8.
 */
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        System.out.println(three(string));
    }

    public static char three(String string) {
        int[] ints = new int[256];
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') continue;
            if ('0' <= chars[i] && chars[i] <= '9')
                continue;
            if (ints[chars[i]] == 2) {
                return chars[i];
            } else {
                ints[chars[i]]++;
            }
        }
        return ' ';
    }
}
