package exam.test1.first;

import java.util.Scanner;

/**
 * Created by Xulong on 2017/3/23.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int len = str.length();

        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int arr[] = new int[N];
        for (int i = 0; i <= M - 2; i++) {
            arr[i] = (int) Math.pow(26, (i + 2) / 2) * (N - 1 - i);
        }
        if (arr[M - 2] > K) {
            System.out.println(arr[M - 2]);
        } else {
            System.out.println(0);
        }
    }
}
