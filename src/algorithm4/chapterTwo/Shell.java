package chapterTwo;

import edu.princeton.cs.algs4.StdOut;

public class Shell {
	/**
	 * 希尔排序
	 * 
	 * @param a
	 */
	public static void sort(Comparable[] a) {
		int N = a.length;
		int h = 1;
		while (h < N / 3)
			h = 3 * h + 1;

		while (h >= 1) {
			for (int i = 0; i < N; i++) {
				for (int j = i; j >= h && less(a[j], a[j - h]); j -= h)
					exch(a, j, j - h);
			}
			h = h / 3;
		}
	}

	/**
	 * 小于
	 * 
	 * @param v
	 * @param w
	 * @return
	 */
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}

	/**
	 * 交换数组中，对应位置的元素
	 * 
	 * @param a
	 * @param i
	 * @param j
	 */
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	private static void show(Comparable[] a) {
		for (int i = 0; i < a.length; i++)
			StdOut.print(a[i] + " ");
		StdOut.println();
	}

	public static boolean isSorted(Comparable[] a) {
		for (int i = 1; i < a.length; i++) {
			if (less(a[i], a[i - 1]))
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Comparable[] a = { 45, 2, 15, 4, 9, 8, 4, 4, 9, 4, 1, 6, 4, 7, 8, 9, 4, 13, 6, 7, 9, 1, 6, 7, 9, 4, 1, 4, 9 };
		Shell sec = new Shell();
		sec.sort(a);
		sec.show(a);
		StdOut.println("eover");
	}
}
