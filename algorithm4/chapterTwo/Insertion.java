package algorithm4.chapterTwo;

import edu.princeton.cs.algs4.StdOut;

public class Insertion {
	/**
	 * 插入排序，对部分有序的数组进行排序比较
	 * @param a
	 */
	public static void sort(Comparable[] a) {
		
//		int N = a.length;
//		for (int i=0; i<a.length; i++) {
//			for (int j = i; j>0 && less(a[j], a[j-1]); j--)
//				exch(a, j, j-1);
//		}
		
		
		int N = a.length;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j > 0; j--) {
				if (less(a[j], a[j-1])) 
					exch(a, j, j-1);
			}
		}
		
		
		
		
		/*int N = a.length;
		for (int i=0; i<N; i++) {
			for (int j=i; j>0 && less(a[j], a[j-1]); j--) {
				exch(a , j, j-1);
			}
		}*/
	}
	
	public static boolean less(Comparable v, Comparable w) {
		return v.compareTo(w) < 0;
 	}
	
	private static void exch(Comparable[] a, int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	private static void show(Comparable[] a) {
		for (int i=0; i<a.length; i++)
			StdOut.print(a[i] + " ");
		StdOut.println();
	}
	
	public static boolean isSorted(Comparable[] a) {
		for (int i=1; i<a.length; i++) {
			if (less(a[i], a[i-1])) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		//Comparable [] a = {45,2,15,4,9,8,4,4,9,4,1,6,4,7,8,9,4,13,6,7,9,1,6,7,9,4,1,4,9};
		Comparable [] a = {'s','o','r','t','e','x','a','m','p','l','e'};
		Insertion sec = new Insertion();
		sec.sort(a);
		sec.show(a);
	}
}
