package exam.toutiao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Xulong on 2017/4/18.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = sc.nextInt();
        }
        List list = new ArrayList();
        Arrays.sort(arr1);
        for (int i = 0; i < n; i++) {
            if (Arrays.binarySearch(arr1, arr2[i]) >= 0)
                list.add(arr2[i]);
        }
        for (int i = 0; i < list.size() -1; i++)
            System.out.print(list.get(i) + " ");
        System.out.print(list.get(list.size() - 1));
    }
}
