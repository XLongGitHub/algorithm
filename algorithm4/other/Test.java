package algorithm4.other;

import edu.princeton.cs.algs4.StdOut;

public class Test {
	public static void main(String[] args) {
		boolean a = false;
		boolean b = true;
		int c = 1;
		
		StdOut.println(a | (2 == c++));
		StdOut.println(a || b);
	}
}
