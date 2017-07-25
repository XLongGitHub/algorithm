package algorithm4.chpaterThree;

import java.util.HashSet;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class DeDup { 
	public static void main(String[] args) {
		HashSet<String> set;
		set = new HashSet<String>();
		while (!StdIn.isEmpty()) {
			String key = StdIn.readString();
			if (!set.contains(key)) {
				set.add(key);
				StdOut.println(key);
			}
		}
	}
}
