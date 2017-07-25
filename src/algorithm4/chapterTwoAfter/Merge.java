package chapterTwoAfter;

import edu.princeton.cs.algs4.StdOut;

public class Merge {
	private static Comparable[] aux;
	
	public static void main(String[] args) {
		Comparable[] a = {9,8,7,6,5,4,3,2,1};
		sort(a);
		show(a);
	}

	private static void sort(Comparable[] a) {
		aux = new Comparable[a.length];
		sort(a, 0, a.length-1);
	}
	
	private static void sort(Comparable[] a, int lo, int hi) {
		if (hi <= lo) return;
		int mid = lo+(hi - lo) / 2;
		sort(a, lo, mid);
		sort(a, mid+1, hi);
		merge(a, lo, mid, hi);
	}

	private static void merge(Comparable[] a, int lo, int mid, int hi) {
		int i = lo, j = mid + 1;
		for (int k = lo; k<=hi; k++)
			aux[k] = a[k];
		
		for (int k=lo; k<=hi; k++) {
			if (i>mid) a[k] = aux[j++];
			else if (j>hi) a[k] = aux[i++];
			else if (less(a[j], a[i])) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
		
		show(a);
	}

	private static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}

	private static void show(Comparable[] a) {
		for(int i=0; i<a.length; i++)
			StdOut.print(a[i]+" ");
		StdOut.println();
	}

}
