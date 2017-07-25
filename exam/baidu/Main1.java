package exam.baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/27.
 */
public class Main {
    public static  void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ints = new int[N];
        for (int i = 0; i < N; i++)
            ints[i] = sc.nextInt();
        int thr = three(ints);
        System.out.println(thr);

    }

    public static int three(int[] ints) {
        if (ints.length <= 2)
            return -1;
        int[] thr = new int[3];
        thr[0] = ints[0];
        thr[1] = ints[1];
        thr[2] = ints[2];
        for (int i = 0; i < 3; i++) {
            for (int j = i;  j < 3; j++) {
                if (thr[i] < thr[j]) {
                    int a = thr[i];
                    thr[i] = thr[j];
                    thr[j] = a;
                }
            }
        }
        Arrays.sort(thr);
        for (int i = 3; i < ints.length; i++) {
            if (thr[2] < ints[i]) {
                thr[2] = ints[i];
                if (thr[1] < thr[2]) {
                    int tmp = thr[1];
                    thr[1] = thr[2];
                    thr[2] = tmp;
                    if (thr[0] < thr[1]) {
                        int tmp0 = thr[0];
                        thr[0] = thr[1];
                        thr[1] = tmp0;
                    }
                }
            }
        }
        return thr[2];
    }
}
