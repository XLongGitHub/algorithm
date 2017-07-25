package algorithm4.chpaterThree;

import java.util.HashSet;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
/**
 * 白名单和黑名单
 * @author Xulong
 *
 */
public class WhiteFilter {
	public static void main(String[] args) {
		HashSet<String> set;
		set = new HashSet<String>();
		In in= new In(args[0]);
		while (!in.isEmpty()) 
			set.add(in.readString());
		while (!StdIn.isEmpty()) {
			String word = StdIn.readString();
			if (set.contains(word))
				StdOut.println(word);
		}
	}
}
