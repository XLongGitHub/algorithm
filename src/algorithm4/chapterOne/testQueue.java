package algorithm4.chapterOne;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class testQueue {
	
	public static void main(String[] args) {
		String[] inStr = In.readStrings("tinyT.txt");
		int k = StdIn.readInt();
		StdOut.println(inStr[inStr.length-k]);
	}
}
