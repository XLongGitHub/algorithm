package algorithm4.chapterTwo;

/**
 * 自底向上的归并排序
 * @author Xulong
 */
public class MergeBU {
    private static Comparable[] aux;
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) <= 0;
    }

    public static void merge(Comparable[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++)
            aux[k] = a[k];
        /**
         * 从当前可操作位置移动到下一个可操作位置
         */
        for (int k = lo; k <= hi; k++) {
            if (k > mid) a[k] = aux[j++];
            else if (k > hi ) a[k] = aux[i++];
            else if (less(a[i], a[j])) a[k] = aux[i++];
            else a[k] = aux[j++];
        }
    }

    public static void sort(Comparable[] a) {
        int N = a.length;
        aux = new Comparable[N];
        sort(a, 0, a.length - 1);
    }

    /**
     * 归并
     * @param a
     * @param lo
     * @param hi
     */
    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        merge(a, lo, mid, hi);
    }
}
