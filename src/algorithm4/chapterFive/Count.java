package chapterFive;

import edu.princeton.cs.algs4.Alphabet;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Count {
	public static void main(String[] args) {
		Alphabet  alpha = new Alphabet("ABCDR");
		int R = alpha.R();
		int[] count = new int[R];
		StdOut.println("nihao");
		//String s = StdIn.readAll();
		String s = new In("abra.txt").readAll();
		
		int N = s.length();
		StdOut.println(s);
		for (int i = 0; i < N; i++)
			if (alpha.contains(s.charAt(i)))
				count[alpha.toIndex(s.charAt(i))]++;
		
		for (int c = 0; c < R; c++)
			StdOut.println(alpha.toChar(c) + " " + count[c]);
		
	}
}
