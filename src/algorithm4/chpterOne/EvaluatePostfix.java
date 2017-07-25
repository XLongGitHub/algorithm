package algorithm4.chpterOne;

import java.util.ArrayList;
import java.util.List;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;
/**
 * 中序遍历
 * @author Xulong
 *
 */
public class EvaluatePostfix {
	public static void main(String[] args) {
		String strold = "( ( 1 + 2 ) * ( ( 3 - 4 ) * ( 5 - 6 ) ) )";
		String[] str = strold.split(" ");
		for (String s : str)
			StdOut.print(s);
		StdOut.println();
		Stack<String> oper = new Stack<String>(); //存放操作�?
		List<String> list = new ArrayList<String>(); //存放数据
		
		for (int i=0; i<str.length; i++) {
			
			if (str[i].matches("^[1-9]\\d*$")) {
				list.add(str[i]);
			}else if (str[i].equals("(")) {
				oper.push(str[i]);
			} else if (str[i].equals(")")) {
				while (oper.size()>0 && !oper.peek().equals("(")) {
					String ss = oper.pop();
					list.add(ss);
				}
				oper.pop();
			} else {
				if (oper.isEmpty()) {
					oper.push(str[i]);
					continue;
				} else if (oper.peek().equals("(")) {
					oper.push(str[i]);
					continue;
					//此时栈顶元素为操作符
				} else if (priority(str[i]) > priority(oper.peek())) {
					oper.push(str[i]);
				} else {
					do {
						list.add(oper.pop());
					} 
					while(! (oper.isEmpty() || oper.peek().equals("(") || priority(str[i])>priority(oper.peek()) ) );
					oper.push(str[i]);
				}
			}
		}
		
		while(!oper.isEmpty()) {
			list.add(oper.pop());
		}
		for (int i=0; i<list.size(); i++) {
			StdOut.print(list.get(i)+" ");
		}
		StdOut.println();
		StdOut.println(calcauteAfterExpression(list));
	}

	private static int  priority(String temp) {
//StdOut.println("temp = "+temp);
		char ch = temp.charAt(0);
		int pri;
		switch(ch) {
		case '+': pri = 1; break;
		case '-': pri = 1; break;
		case '*': pri = 2; break;
		case '/': pri = 2; break;
		default :
			pri = 0;
			break;
		}
		return pri;
	}
	
	public static int calcauteAfterExpression(List<String> newExpression) {
		int result = 0;
		if (newExpression.size() > 1) {
			int i = 0;
			for (i=0; i<newExpression.size(); i++) {
				if (isOperator(newExpression.get(i))) {
					if (newExpression.get(i).equals("+")) {
						result = Integer.parseInt(newExpression.get(i-2)) + Integer.parseInt(newExpression.get(i - 1));
					}else if (newExpression.get(i).equals("-")) {
						result = Integer.parseInt(newExpression.get(i-2)) - Integer.parseInt(newExpression.get(i - 1));
					} else if (newExpression.get(i).equals("*")) {
						result = Integer.parseInt(newExpression.get(i-2)) * Integer.parseInt(newExpression.get(i - 1));
					} else if (newExpression.get(i).equals("/")) {
						result = Integer.parseInt(newExpression.get(i-2)) / Integer.parseInt(newExpression.get(i - 1));
					}
					break;
				}
			}
			newExpression.set(i, String.valueOf(result));
			newExpression.remove(i-1);
			newExpression.remove(i-2);
			calcauteAfterExpression(newExpression);
		}
		return Integer.parseInt(newExpression.get(0));
	}

	private static boolean isOperator(String str) {
		if (str.equals("+") ||str.equals("-") || str.equals("*") || str.equals("/"))
			return true;
		return false;
	}
}
