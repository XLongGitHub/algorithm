package chapterFive;

import edu.princeton.cs.algs4.StdOut;

public class KMP {
	private String pat;
	private int[][] dfa;
	
	public KMP(String pat) {
		//由模式字符串构造DFA
		this.pat = pat;
		int M = pat.length();
		int R = 256;
		dfa = new int[R][M];
		dfa[pat.charAt(0)][0] = 1;
		
		for (int X = 0, j = 1; j < M; j++) {
			//计算dfa[][j]
			for (int c = 0; c < R; c++)
				dfa[c][j] = dfa[c][X];
			dfa[pat.charAt(j)][j] = j + 1;
			X = dfa[pat.charAt(j)][X];
		}
	}
	
	public int search(String txt) {
		//在txt上模拟DFA的运行
		int i, j, N = txt.length(), M = pat.length();
		for (i = 0, j = 0; i < N && j < M; i++)
			j = dfa[txt.charAt(i)][j];
		if (j == M) return i - M;
		else return N;
	}
	
	public static void main(String[] args) {
		String pat = "AACAA";
		String txt = "AABRAACADABRAACAADABRA";
		KMP kmp = new KMP(pat);
		StdOut.println("text: " + txt);
		int offset = kmp.search(txt);
		StdOut.print("pattern: ");
		for (int i = 0; i < offset; i++)
			StdOut.print(" ");
		StdOut.println(pat);
		StdOut.println(offset);
	}
}
