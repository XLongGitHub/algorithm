import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class BinaryBruteForce {
	//BruteForceSearch
	//暴力查找
	public static int rank1(int key, int[] a ) {
		for (int i=0; i<a.length; i++)
			if (a[i] == key) return i;
		return -1;
	}
	//二分查找
	public static int rank2(int key, int[] a) {
		int lo = 0; 
		int hi = a.length - 1;
		int mid = (hi + lo ) / 2;
		
		while(lo <= hi) {
			if (a[mid] < key) lo = mid + 1;
			if (a[mid] > key) hi = mid - 1;
			else return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] largeW = In.readInts("largeW.txt"); 
		StdOut.println(largeW.length);
		Arrays.sort(largeW);
		System.out.println("sort");
		/*for (Integer c: largeW)
			StdOut.println(c);*/
		long startTime = System.nanoTime();    //可构建一个计时器辅助类
		rank1(989866, largeW);
		long endTime = System.nanoTime();
		System.out.println("rank1 run time is : " + (endTime - startTime));
		
		long startTime1 = System.nanoTime();
//		Arrays.sort(largeW);
		rank2(989866, largeW);
		long endTime1 = System.nanoTime();
		System.out.println("rank2 run time is : " + (endTime1 - startTime1));
		System.out.println("end");
	}
}
