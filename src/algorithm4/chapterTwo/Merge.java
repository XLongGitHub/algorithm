package algorithm4.chapterTwo;

import edu.princeton.cs.algs4.StdOut;
/**
 * 归并排序
 * @author Xulong
 *
 */
public class Merge {
	private static Comparable[] aux;

	public static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length - 1);
	}
	/**
	 * 自顶向下
	 * @param a
	 * @param lo
	 * @param hi
	 */
	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo)
			return;
		int mid = lo + (hi - lo) / 2;
		sort(a, lo, mid);
		sort(a, mid + 1, hi);
		merge(a, lo, mid, hi);
		show(a);
	}

	/**
	 * 自底向上
	 * @param a
	 */
	private static void UDsort(Comparable[] a) {
		int N = a.length;
		aux = new Comparable[N];
		for (int sz = 1; sz < N; sz = sz + sz) {
			for (int lo = 0; lo < N-sz; lo += sz+sz)
				merge(a, lo, lo+sz-1, Math.min(lo+sz+sz-1, N-1));
		}
 	}
	
	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		int i = lo;
		int j = mid + 1;
		for (int k=lo; k<=hi; k++)
			aux[k] = a[k];
		
		for (int k=lo; k<=hi; k++) {
			if (i>mid) a[k] = aux[j++];     //  左半边元素用尽，取右半边元素
			else if (j > hi) a[k] = aux[i++];    //右半边元素用尽，取左半边元素
			else if (less(aux[j], aux[i])) a[k] = aux[j++];   //右边元素小，取右边元素
			else a[k] = aux[i++];      //左边元素小，取左边元素
		}
	}
	
	public static void show(Comparable [] a) {
		for (int i=0; i<a.length; i++) 
			StdOut.print(a[i]+" ");
		StdOut.println();
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	public static void main(String[] args) {
//		Comparable[] a = {14,12,13,11,10,6,8,7,9,5,4,3,2,1,0};
		Comparable[] a = {0,3, 5, 4, 9, 2};
		//UDsort(a);
		sort(a);
		//show(a);
	//	StdOut.print(less(2,1));
	}
}
