package chpterOne;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
/**
 * 括号匹配
 * @author Xulong
 *
 */
public class Brackets {
	public static void main(String[] args) {
		String exp = StdIn.readLine();
		String[] arrexp = exp.split(" ");
		Stack<String> nStack = new Stack<String>();
		Stack<String> oStack = new Stack<String>();
		int count = 0;
		for (String s : arrexp) 
			StdOut.print(s+" ");
		StdOut.println();
		
		
		for (int i=0; i<arrexp.length; i++) {
			if (isNumber(arrexp[i]) && isOneOperator(arrexp[i+1])) {
				nStack.push("(");
				nStack.push(arrexp[i]);
				nStack.push(arrexp[i+1]);
				i++;
			}
			else 
				nStack.push(arrexp[i]);
		}
		// 1 +  2 ) * 3 - 4 ) * 5 - 6 ) ) ) 
		/*for (String s2 : nStack)
			StdOut.print(s2);*/
		//清空nStack
		for (String s3 : nStack)
			oStack.push(s3);
		
		for (String s3 : oStack)
			StdOut.print(s3+" ");
		StdOut.println();
		
		for(String s : oStack) {
			if (s.equals("("))
				count--;
			else if (s.equals(")"))
				count++;
		}
		
		StdOut.println(count);
		while(!nStack.isEmpty())
			nStack.pop();
		while (!oStack.isEmpty() ) {
			String s = oStack.pop();
			if (s.equals("(") && count>0) {
				count--;
				nStack.push("(");
				
			}
			nStack.push(s);
		}
		
		for (String s : nStack)
			oStack.push(s);
		
		for (String s3 : oStack)
			StdOut.print(s3+"  ");
		StdOut.println();
	}
	
	public static boolean isOneOperator(String s) {
		if (s.equals("+")) return true;
		else if (s.equals("-")) return true;
		return false;
	}
	
	public static boolean isTwoOperator(String s) {
		if (s.equals("*")) return true;
		else if (s.equals("/")) return true;
		return false;
	}
	
	public static boolean isNumber(String s) {
		try {
			int n = Integer.parseInt(s);
			if (0<= n && n <= 9) return true;
		} catch (NumberFormatException e) {
			return false;
		}
		int n = Integer.parseInt(s);
		if (0<= n && n <= 9) return true;
		return false;
	}
}
