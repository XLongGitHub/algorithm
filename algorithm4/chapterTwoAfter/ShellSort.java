package algorithm4.chapterTwoAfter;

import edu.princeton.cs.algs4.StdOut;
/**
 * 以不同的步长分别进行排序
 * @author Xulong
 *
 */
public class ShellSort {
	public static void main(String[] args) {
		//Comparable[] a = "EASYSHELLSORTQUESTION".split("");
		Comparable[] a = {9,8,7,6,5,4,3,2,1,0};
		
		sort(a);
		show(a);
		StdOut.print(less(2,1));
	}
	
	public static void sort(Comparable[] a) {
		int N = a.length;
		int hi = 1;
		while ( hi < N/3) 
			hi = hi*3 + 1;
		
		while (hi >=1) {
			for (int i=hi; i<N; i++) {
				for (int j=i; j>=hi && less(a[j], a[j-hi]); j-=hi) 
					exch(a,j, j-hi );
				show(a);
			}
			hi = hi / 3; 
		}
		
	}
	
	public static void exch(Comparable[] a, int m, int n) {
		Comparable temp = a[m];
		a[m] = a[n];
		a[n] = temp;
	}
	
	public static boolean less(Comparable a, Comparable b) {
		return a.compareTo(b) < 0;
	}
	
	public static void show(Comparable [] a) {
		for (int i=0; i<a.length; i++) 
			StdOut.print(a[i]+" ");
		StdOut.println();
	}

}
