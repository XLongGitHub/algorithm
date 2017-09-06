package algorithm4.chpterOne.课后练习;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
/**
 * 利用栈，将十进制转化为二进制
 * @author Xulong
 *
 */
public class ShiToBinary {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		int N = 2;
		if (N == 0) stack.push(N);
		
		while (N>0) {
			stack.push(N%2);
			N /= 2; 
		}
		
		for (int d : stack) 
			StdOut.print(d);
	}
}
