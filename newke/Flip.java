package newke;
/*
链接：https://www.nowcoder.com/practice/0b5ab6cc51804dd59f9988ad70d8c4a0?tpId=49&tqId=29282&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
来源：牛客网

在4x4的棋盘上摆满了黑白棋子，黑白两色的位置和数目随机其中左上角坐标为(1,1),右下角坐标为(4,4),现在依次有一些翻转操作，要对一些给定支点坐标为中心的上下左右四个棋子的颜色进行翻转，请计算出翻转后的棋盘颜色。
给定两个数组A和f,分别为初始棋盘和翻转位置。其中翻转位置共有3个。请返回翻转后的棋盘。
测试样例：
[[0,0,1,1],[1,0,1,0],[0,1,1,0],[0,0,1,0]],[[2,2],[3,3],[4,4]]
返回：[[0,1,1,1],[0,0,1,0],[0,1,1,0],[0,0,1,0]]
*/
public class Flip {
	public static void main(String[] args) {
		
		int[][] A = {{0, 0, 1, 1},
					{1, 0, 1, 0},
					{0, 1, 1, 0},
					{0, 0, 1, 0}};
		
		int[][] f = {{2, 2}, {3, 3}, {4, 4}};
		//int[][] f = {{2, 2}};
		
		A = flipChess(A, f);
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) 
				System.out.print(A[i][j]+"  ");
			System.out.println();
		}
	}
	
	public static int[][] flipChess(int[][] A, int[][] f) {
		for (int i = 0 ; i < f.length; i++) {
			int row = f[i][0] - 1;
			int clo = f[i][1] - 1;
			
			if (row - 1 >= 0) {
				if (A[row - 1][clo] == 1) {
					A[row - 1][clo] = 0;
				} else {
					A[row - 1][clo] = 1;
				}
			}
			
			if (row + 1 < A.length) {
				if (A[row + 1][clo] == 1) {
					A[row + 1][clo] = 0;
				} else {
					A[row + 1][clo] = 1;
				}
			}
			
			if (clo - 1 >= 0) {
				if (A[row][clo - 1] == 1) {
					A[row][clo - 1] = 0;
				} else {
					A[row][clo - 1] = 1;
				}
			}
			
			if (clo + 1 < A.length) {
				if (A[row][clo + 1] == 1) {
					A[row][clo + 1] = 0;
				} else {
					A[row][clo + 1] = 1;
				}
			}
		}
		return A;
	}
}
