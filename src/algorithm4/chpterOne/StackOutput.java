package chpterOne;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class StackOutput {
	public static void main(String[] args) {
		Stack<String> str = new Stack<String>();
		String strin = "it was - the best - of times - - - it was - the - - ";
		String[] arrstr = strin.split(" ");
		
		for (String s : arrstr) {
			if (s.equals("-")) StdOut.print(str.pop()+" ");
			else str.push(s);
		}
		
		
	}
}
