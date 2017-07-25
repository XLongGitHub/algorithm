package algorithm4.chpterOne;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * 二分查找，白名单
 * @author Xulong
 *
 */
public class Bianry {
	public static int rank(int key, int[] a) {
		int lo = 0; 
		int hi = a.length - 1;
		
		while(lo <= hi) {
			int mid = (lo + hi) / 2;
			if (key < a[mid]) lo = mid + 1;
			if (key > a[mid]) hi = mid - 1;
			else return mid;
		}
		return -1;
	}
	//记录查找的次�?
	public static int rank(int key, int[] a, Counter c) {
		int lo = 0; 
		int hi = a.length - 1;
		
		while(lo <= hi) {
			int mid = (lo + hi) / 2;
			if (key < a[mid]) lo = mid + 1;
			if (key > a[mid]) hi = mid - 1;
			else return mid;
			c.increment();
		}
		StdOut.println(c);
		return -1;
	}
	
	public static void main(String[] args) {
		int[] whitelist = In.readInts("algorithm4/tinyT.txt");
		Counter cnt = new Counter("cnt");
		
		for (Integer i: whitelist) 
			StdOut.println(i);
		Arrays.sort(whitelist);
		
		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if (rank(key, whitelist, cnt) < 0) {
				StdOut.println(key);
			}
		} 
	}

}
