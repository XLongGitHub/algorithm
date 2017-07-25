package newke.offer;
//package newke.offer;
///*
//���ӣ�https://www.nowcoder.com/practice/12cbdcdf5d1e4059b6ddd420de6342b6?tpId=49&tqId=29283&rp=1&ru=%2Fta%2F2016test&qru=%2Fta%2F2016test%2Fquestion-ranking
//��Դ��ţ����
//
//������һ���������۾�����Ҫ�ӹ�˾������ȥ�ݷ����ڵ��̼ң���֪����λ���Լ��̼ҵ�λ�ã��������ڳ��е�·��ͨ��ԭ����ֻ����������ѡ��һ��������������ѡ��һ���������������ж����ַ��������̼ҵ�ַ��
//����һ����ͼmap�����ĳ���n��m������1������λ�ã�2�����̼�λ�ã�-1�����ܾ����ĵ�����0������Ծ����ĵ������뷵�ط���������֤һ�����ںϷ�·������֤����ĳ���С�ڵ���10��
//����������
//[[0,1,0],[2,0,0]],2,3
//���أ�2
//*/
//
//public class Visit {
//	public static void main(String[] args) {
//
//	}
//
//	public int countPath(int[][] map, int n, int m) {
//		int manRow = 0;
//		int manClo = 0;
//		int storeRow = 0;
//		int storeClo = 0;
//
//		boolean left = false;
//		boolean up = false;
//		boolean right = false;
//		boolean down = false;
//
//		int[][] cc = new int[map.length][map[0].length];
//
//		for (int i = 0; i < map.length; i++) {
//			for (int j = 0; j < map[i].length; j++) {
//				if (map[i][j] == 1) {
//					manRow = i;
//					manClo = j;
//				}
//				if (map[i][j] == 2) {
//					storeRow = i;
//					storeClo = j;
//				}
//			}
//
//
//			if (manRow < storeRow)
//				down = true;
//			if (manRow > storeRow)
//				up = true;
//			if (manClo < storeClo)
//				right = true;
//			if (manClo > storeClo)
//				left = true;
//
//			for (int i = 0; i < storeRow - manRow + 1; i++) {
//				for (int j = 0; j < storeClo - manRow + 1; j++) {
//
//				}
//			}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//			/*if ((manRow == storeRow) && (manClo > storeClo )) {
//				left = true;
//			}
//			if ((manRow == storeRow) && (manClo < storeClo )) {
//				right = true;
//			}
//			if ((manRow > storeRow) && (manClo == storeClo )) {
//				up = true;
//			}
//			if ((manRow < storeRow) && (manClo < storeClo )) {
//				 down = true;
//			}
//			if ((manRow == storeRow) && (manClo > storeClo )) {
//				left = true;
//			}
//			if ((manRow == storeRow) && (manClo < storeClo )) {
//				right = true;
//			}
//			if ((manRow > storeRow) && (manClo == storeClo )) {
//				up = true;
//			}
//			if ((manRow < storeRow) && (manClo == storeClo )) {
//				 down = true;
//			}*/
//
//		}
//
//		public int path(int[][] a, int row, int clo) {
//			if (row -1 == storeRow && clo == storeClo) return 1;
//			if (row == storeRow && clo + 1 == storeClo) return 1;
//
//		}
//    }
//}
