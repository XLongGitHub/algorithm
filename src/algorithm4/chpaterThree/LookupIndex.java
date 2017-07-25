package chpaterThree;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.ST;

public class LookupIndex {

	public static void main(String[] args) {
		In in  = new In(args[0]);
		String sp = args[1];
		ST<String, Queue<String>> st = new ST<String, Queue<String>>();
		ST<String, Queue<String>> ts = new ST<String, Queue<String>>();
		while (in.hasNextLine()) {
			String[] a = in.readLine().split(sp);
			String key = a[0];
			for (int i = 1; i<a.length; i++) {
				String val = a[i];
			}
					
		}
		
	}

}
