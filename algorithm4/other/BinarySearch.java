package algorithm4.other;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class BinarySearch {
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
	
	public static void main(String[] args) {
		int[] whitelist = In.readInts("tinyT.txt");
		for (Integer i: whitelist) 
			StdOut.println(i);
		Arrays.sort(whitelist);
		while(!StdIn.isEmpty()){
			int key = StdIn.readInt();
			if (rank(key, whitelist) < 0) {
				StdOut.println(key);
			}
		} 
	}
	
	/*public static void main(String[] args) throws Exception {
		System.out.println("12");
		int[] whitelist ; //= In.readInts(args[0]);
		FileInputStream fis ;// = null;
		fis = new FileInputStream("E:/javajava/tinyT.txt");
		
		int c;
		int i = 0;
		BufferedInputStream bis = new BufferedInputStream(fis);
		//bis.mark(100);
		for (; (c=bis.read())!= -1; i++) {
			System.out.println(c);
		}
		whitelist = new int[i];
		System.out.println("len =" + i);
		//bis.reset();
		for (i=0; (c=bis.read())!= -1; i++) {
			whitelist[i] = c;
		}
		int cnt = 0;
		Arrays.sort(whitelist);
		for (Integer a : whitelist)
			StdOut.println(a+" "+cnt++);
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if (rank(key, whitelist) < 0)
				StdOut.println(key);
		}
		StdOut.print("hw");
		
	}*/
}
