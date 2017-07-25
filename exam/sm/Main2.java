package exam.sm;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/8.
 */
public class Main2 {

    public static void main(String[] args) {
//        Main2 m2 = new Main2();
        Scanner sc = new Scanner(System.in);
        String file = sc.nextLine();
        char[] chars = file.toCharArray();
        int pos1 = 0;
        int pos2 = 0;
        for (pos1  = chars.length - 1 ; pos1 >= 0; pos1--) {
            if (chars[pos1] == ' ') continue;
            break;
        }

        for (pos2 = pos1; pos2 >= 0; pos2--) {
            if (chars[pos2] != '.') continue;
            break;
        }
        String type = "";
        for (int i = pos2+1; i <= pos1; i++)
            type += chars[i];
        System.out.println(type);

    }

}
