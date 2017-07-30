package newke.retest;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Approximately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            System.out.println(quantity(num));
        }

    }

    public static int quantity(int num) {
        Set<Integer> set = new HashSet();
        if (num == 0) return 0;
        if (num > 0) {
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    set.add(i);
                    set.add(num / i);
                }
            }
            return set.size();
        }
        return 0;
    }
}
