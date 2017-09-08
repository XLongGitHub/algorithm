package algorithm4.chapterTwo;
//
//import edu.princeton.cs.algs4.StdOut;
//import edu.princeton.cs.algs4.StdRandom;
//
//public class Quick {
//    public static void main(String[] args) {
//        Comparable[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
//        sort(a);
//        show(a);
//    }
//
//    private static void show(Comparable[] a) {
//        for (int i = 0; i < a.length; i++)
//            StdOut.print(a[i] + " ");
//        StdOut.println();
//    }
//
//    /*
//    private static void sort(Comparable[] a) {
//        StdRandom.shuffle(a);
//        sort(a, 0, a.length-1);
//    }
//
//    private static void sort(Comparable[] a, int lo, int hi) {
//        if (lo <= hi) return;
//        int j = partition(a, lo,  hi);
//        sort(a, lo, j-1);
//        sort(a, j+1, hi);
//    }
//    */
//    private static int partition(Comparable[] a, int lo, int hi) {
//        Comparable v = a[lo];
//        int i = lo;
//        int j = hi + 1;
//
//        while (true) {
//            while (less(a[++i], v)) if (i >= hi) break;
//            while (less(v, a[--j])) if (j <= lo) break;
//            if (i >= j) break;
//            exch(a, i, j);
//        }
//        exch(a, lo, j);
//        return j;
//    }
//
//    private static void sort(Comparable[] a) {
//        StdRandom.shuffle(a);
//        sort(a, 0, a.length - 1);
//    }
//
//    private static void sort(Comparable[] a, int lo, int hi) {
//        if (hi <= lo) return;
//        int j = partition(a, lo, hi);
//        sort(a, lo, j - 1);
//        sort(a, j + 1, hi);
//        show(a);
//
//    }
//
//    /*
//    private static int partition(Comparable[] a, int lo, int hi) {
//        int i = lo, j = hi + 1;
//        Comparable v = a[lo];
//        while(true) {
//            while(less(a[++i], v)) if (i>=hi) break;
//            while(less(v, a[--j])) if (j<=lo) break;
//            if (i >= j) break;
//            exch(a, i, j);
//        }
//        exch(a, lo, j);
//        return j;
//    }
//*/
//    private static void exch(Comparable[] a, int i, int j) {
//        Comparable temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }
//
//    private static boolean less(Comparable v, Comparable w) {
//        return v.compareTo(w) < 0;
//    }
//
//}

import edu.princeton.cs.algs4.StdRandom;

public class Quick {
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable v = a[i];
        a[i] = a[j];
        a[j] = v;
    }

    /**
     * 从两边往中间进行切分交换
     * @param a
     * @param lo
     * @param hi
     * @return
     */
    public static int partition(Comparable[] a, int lo, int hi) {
        int i = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true) {
            while (!less(a[++i], v)) if (i == hi) break;
            while (less(v, a[--j])) if (j == lo) break;
            if (i >= j) break;
            exch(a, i, j);
        }
        exch(a, lo, j);
        return j;
    }

    public static void sort(Comparable[] a) {
        StdRandom.shuffle(a);
        sort(a, 0, a.length - 1);
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        int j = partition(a, lo, hi);
        sort(a, lo, j - 1);
        sort(a, j + 1, hi);
    }
}