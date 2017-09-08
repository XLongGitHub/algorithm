package algorithm4.chapterTwo;

/**
 * @author Xulong
 */
public class Sort {

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) <= 0;
    }

    /**
     * 遍历输出数组
     *
     * @param a
     */
    public static void show(Comparable[] a) {
        for (Comparable c : a)
            System.out.print(c + " ");
        System.out.println();
    }

    /**
     * 判断数组是否为有序数组
     *
     * @param a
     * @return
     */
    public static boolean isSorted(Comparable[] a) {
        int N = a.length;
        if (N == 0 || N == 1) return true;
        for (int i = 1; i < N; i++) {
            if (!less(a[i - 1], a[i])) return false;
        }
        return true;
    }

    /**
     * 交换数组中的两个元素
     *
     * @param a 数组
     * @param i 索引
     * @param j 索引
     */
    public static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * 选择排序
     *
     * @param a
     */
    public static void sectionSort(Comparable[] a) {
        int N = a.length;
        if (N == 0 || N == 1) return;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i; j < N; j++) {
                if (less(a[j], a[min])) min = j;
            }
            exch(a, i, min);
        }
    }

    /**
     * 插入排序
     * @param a
     */
    public static void insertionSort(Comparable[] a) {
        int N = a.length;
        if (N == 0 || N == 1) return;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j-1);
        }
    }

    /**
     * 希尔排序
     * 选择合适的递增序列
     * @param a
     */
    public static void shellSort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N/3) h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++) {
                for (int j = i; j > 0 && less(a[j], a[j - h]); j -= h)
                    exch(a, j, j-h);
            }
            h /= 3;
        }
    }

    /**
     * 有哨兵的插入排序
     * @param a
     */
    public static void SelectInsertSort(Comparable[] a) {
        int N = a.length;
        if (N == 0 || N == 1) return;
        //寻找哨兵
        int min = 0;
        for (int i = 1; i < N; i++) {
            if (less(a[i], a[min])) min = i;
        }
        exch(a, 0, min);
        for (int i = 1; i < N; i++) {
            for (int j = i; less(a[j], a[j - 1]); j--)
                exch(a, j, j-1);
        }
    }

    public static void main(String[] args) {
        int[] ints = {7, 8, 1, 6, 1, 3, 8, 4, 9};
        String string = "hope is a good thing";
        String[] strings = string.split(" ");
//        sectionSort(strings);
//        insertionSort(strings);
//        shellSort(strings);
        SelectInsertSort(strings);
        show(strings);

    }
}
