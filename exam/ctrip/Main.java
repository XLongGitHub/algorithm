package exam.ctrip;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ints = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ints[i][j] = sc.nextInt();
            }
        }
        System.out.println(judge(ints));
    }

    public static int judge(int[][] ints) {
        if (ints[0][0] == 1 &&
                ints[0][1] == 2 &&
                ints[0][2] == 3 &&
                ints[1][0] == 4 &&
                ints[1][1] == 5 &&
                ints[1][2] == 6 &&
                ints[2][0] == 7 &&
                ints[2][1] == 8 &&
                ints[2][2] == 0
                )
            return 0;

        return -1;
    }
}
