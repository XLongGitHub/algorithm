package chapterTwoAfter;

import edu.princeton.cs.algs4.StdOut;

public class Selection {
	public static int cnt = 0;
	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i=0; i<N; i++) {
			int min = i;
			for (int j=i; j<N; j++) {
				if (less(a[j], a[min]))
					min = j;
			}
			exch(a, i, min);
			show(a);
		}
	}
	
	
	private static void exch(Comparable[] a, int i, int min) {
		Comparable temp = a[i];
		a[i] = a[min];
		a[min] = temp;
	}


	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
	}
	

	private static void show(Comparable[] a) {
		StdOut.print(++cnt+": ");
		for (int i=0; i<a.length; i++)
			StdOut.print(a[i] + " ");
		StdOut.println();
	}

	public static boolean isSorted(Comparable[] a) {
		for (int i=0; i<a.length-1; i++) {
			if (a[i].compareTo(a[i+1]) > 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
//StdOut.println(less(0,1));
		Comparable[] a = "EASYQUESTION".split("");
		sort(a);
		//show(a);
		//StdOut.print(isSorted(a));
		
	}

}
