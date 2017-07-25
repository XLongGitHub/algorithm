/**
 * Created by Xulong on 2016/11/26.
 */
public class Cal1_1_22 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 3;
        int pos = rank(key, a);
        System.out.println(pos);
    }

    public static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, 1);
    }

    public static int rank(int key, int[] a, int lo, int hi, int deep) {
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        int lon = deep;
        System.out.println(lon);
        while (lon > 0) {
            lon--;
            System.out.print("*- ");
        }
        System.out.println(" " + hi + " " + lo);
        if (key < a[mid]) return rank(key, a, lo, mid - 1, ++deep);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi, ++deep);
        else return mid;
    }
}
