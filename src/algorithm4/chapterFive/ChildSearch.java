package chapterFive;

public class ChildSearch {
	public static int ButeSearch(String pat, String txt) {
		int N = txt.length();
		int M = pat.length();
		
		for (int i = 0; i < N - M; i++) {
			int j;
			for (j = 0; j < M; j++) 
				if (txt.charAt(i) != pat.charAt(j))
					break;
			if (j == M) return i;   //找到匹配
		}
		return N;					//未找到匹配,按约定返回N的值
	}
	
	public static int BackSearch(String pat, String txt) {
		int j, M = pat.length();
		int i, N = txt.length();
		
		for (i = 0, j = 0; i < N && j < M; i++) {
			if (txt.charAt(i) == pat.charAt(j)) j++;
			else {
				i = -j; j = 0; 					//显示回滚
			}
		}
		if (j == M) return i - M;
		else return N;
	}
}
