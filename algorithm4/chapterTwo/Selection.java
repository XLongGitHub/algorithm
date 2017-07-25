package chapterTwo;

import edu.princeton.cs.algs4.StdOut;

/**
 * 实现Comparable接口
 * 选择排序
 * @author Xulong
 *
 */
public class Selection {
	/**
	 * 选择排序
	 * 
	 * @param a
	 */
//	public static void sort(Comparable[] a) {
//		int N = a.length;
//		for (int i=0; i<N; i++) {
//			int min = i;
//			for (int j = i; j<N; j++) 
//				if (!less(a[min], a[j]))
//					min = j;
//			exch(a, i, min);
//		}
//		//StdOut.println("err");
//	}

	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i = 0; i < N ; i++) {
			int min = i; 
			for (int j = i; j < N; j++)
				if (less(a[j],a[min]))
					min = j;
			exch(a, i, min);
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
		
		Selection sec = new Selection();
		sec.sort(a);
		sec.show(a);
	}
}
