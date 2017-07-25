package algorithm4.chapterTwoAfter;

import edu.princeton.cs.algs4.StdOut;

public class Insert {

	public static void sort(Comparable[] a) {
		int N = a.length;
		for (int i=0; i<N; i++) {
			for (int j=i; j>0  && !less(a[j-1], a[j]); j--) {
				exch(a, j-1, j);
			}
			show(a);
		}
	}
	
	private static boolean less( Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
	
	private static void exch(Comparable[]a, int m, int n) {
			Comparable temp = a[m];
			a[m]  = a[n];
			a[n] = temp;
	}
	
	private static void show(Comparable[] a) {
		for(int i=0; i<a.length; i++)
			StdOut.print(a[i]+" ");
		StdOut.println();
	}
	public static void main(String[] args) {
		Comparable[] a = "EASYQUESTION".split("");
		sort(a);
		show(a);
		
	}
}
