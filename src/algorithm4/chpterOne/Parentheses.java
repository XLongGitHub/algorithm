package algorithm4.chpterOne;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses {
	
	public static void main(String[] args) {
		boolean flag = true;
		String[] s = In.readStrings("Parentheses.txt");
		String ss ="";
		for (String s1 : s)
			ss += s1;
			//StdOut.println(s1);
		StdOut.println(s.length);
		StdOut.println(ss);
		String[] sss  = ss.split("");
		Stack<String> sta = new Stack<String>();
/*		for (String s1 : sss)
			sta.push(s1);*/
		if (0 != sss.length % 2) flag = false;
		for (int i=0; i<sss.length; i++) {
			String temp = sss[i];
			if (temp.equals("{")) sta.push(temp);
			else if (temp.equals("[")) sta.push(temp);
			else if (temp.equals("(")) sta.push(temp);
			else if (temp.equals("}")) {
				if (!sta.pop().equals("{")) {
					flag = false;
					break;
				}
					
			} else if (temp.endsWith("]")) {
				if (!sta.pop().equals("[")) {
					flag = false;
					break;
				}
			} else if (temp.equals(")")) {
				if (!sta.pop().equals("(")) {
					flag = false;
				}
			}
 		}
		
		StdOut.println("flag = : " + flag);
		/*FileInputStream fis = null;
		Stack<Character> par = new Stack<Character>();
		boolean flag = true;
		
		try {
			fis = new FileInputStream("Parentheses.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			char c = 0;
			String[] arr = In.readStrings("Parenteses.txt"));
			
			while((c = ) != -1) {
				char cc = (char) c;
				StdOut.println(cc);
				if (cc == '}') {
					par.pop();
					if ('{' != par.pop()) {
						flag = false;
						break;
					}
				}
				else if (cc == ']') {
					par.pop();
					if ('[' != par.pop()) {
						flag = false;
						break;
					}
				}
				else if (cc == ')'){
					par.pop();
					if ('(' != par.pop()) {
						flag = false;
						break;
					}
				} 
			}
			StdOut.println(flag);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
	}
}
