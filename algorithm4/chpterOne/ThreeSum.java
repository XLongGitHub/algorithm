package chpterOne;

import edu.princeton.cs.algs4.In;

public class ThreeSum {
	public static int count(int[] a) {
		int N  = a.length;
		int cnt = 0;
		for (int i=0; i<N; i++) {
			for (int j=i; j<N; j++) {
				for (int k=j; j<N; j++) {
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
	//	int[] a = In.readInts(""),
	}
}
