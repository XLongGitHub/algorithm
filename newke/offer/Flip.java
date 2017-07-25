package newke.offer;
/*
���ӣ�https://www.nowcoder.com/practice/0b5ab6cc51804dd59f9988ad70d8c4a0?tpId=49&tqId=29282&rp=1&ru=/ta/2016test&qru=/ta/2016test/question-ranking
��Դ��ţ����

��4x4�������ϰ����˺ڰ����ӣ��ڰ���ɫ��λ�ú���Ŀ����������Ͻ�����Ϊ(1,1),���½�����Ϊ(4,4),����������һЩ��ת������Ҫ��һЩ����֧������Ϊ���ĵ����������ĸ����ӵ���ɫ���з�ת����������ת���������ɫ��
������������A��f,�ֱ�Ϊ��ʼ���̺ͷ�תλ�á����з�תλ�ù���3�����뷵�ط�ת������̡�
����������
[[0,0,1,1],[1,0,1,0],[0,1,1,0],[0,0,1,0]],[[2,2],[3,3],[4,4]]
���أ�[[0,1,1,1],[0,0,1,0],[0,1,1,0],[0,0,1,0]]
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
