package algorithm4.chapterTwo;

import static algorithm4.chapterTwo.Sort.exch;

public class PQsort {
    public static void srot(Comparable[] a) {
        int N = a.length;
        for (int k = N / 2; k >= 1; k--) {
            sink(a, k, N);
        }
        while (N > 1) {
            exch(a, 1, N--);
            sink(a, 1, N);
        }
    }

    private static void sink(Comparable[] a, int k, int n) {

    }

}
