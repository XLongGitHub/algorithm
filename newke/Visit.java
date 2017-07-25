package newke;
/*
链接：https://www.nowcoder.com/practice/12cbdcdf5d1e4059b6ddd420de6342b6?tpId=49&tqId=29283&rp=1&ru=%2Fta%2F2016test&qru=%2Fta%2F2016test%2Fquestion-ranking
来源：牛客网

现在有一个城市销售经理，需要从公司出发，去拜访市内的商家，已知他的位置以及商家的位置，但是由于城市道路交通的原因，他只能在左右中选择一个方向，在上下中选择一个方向，现在问他有多少种方案到达商家地址。
给定一个地图map及它的长宽n和m，其中1代表经理位置，2代表商家位置，-1代表不能经过的地区，0代表可以经过的地区，请返回方案数，保证一定存在合法路径。保证矩阵的长宽都小于等于10。
测试样例：
[[0,1,0],[2,0,0]],2,3
返回：2
*/

public class Visit {
	public static void main(String[] args) {
		
	}
	
	public int countPath(int[][] map, int n, int m) {
		int manRow = 0;
		int manClo = 0;
		int storeRow = 0;
		int storeClo = 0;
		
		boolean left = false;
		boolean up = false;
		boolean right = false;
		boolean down = false;
		
		int[][] cc = new int[map.length][map[0].length];
		
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				if (map[i][j] == 1) {
					manRow = i;
					manClo = j;
				}
				if (map[i][j] == 2) {
					storeRow = i;
					storeClo = j;
				}
			}
			
			
			if (manRow < storeRow) 
				down = true;
			if (manRow > storeRow)
				up = true;
			if (manClo < storeClo)
				right = true;
			if (manClo > storeClo)
				left = true;
			
			for (int i = 0; i < storeRow - manRow + 1; i++) {
				for (int j = 0; j < storeClo - manRow + 1; j++) {
					
				}
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*if ((manRow == storeRow) && (manClo > storeClo )) {
				left = true;
			}
			if ((manRow == storeRow) && (manClo < storeClo )) {
				right = true;
			}
			if ((manRow > storeRow) && (manClo == storeClo )) {
				up = true;
			}
			if ((manRow < storeRow) && (manClo < storeClo )) {
				 down = true;
			}
			if ((manRow == storeRow) && (manClo > storeClo )) {
				left = true;
			}
			if ((manRow == storeRow) && (manClo < storeClo )) {
				right = true;
			}
			if ((manRow > storeRow) && (manClo == storeClo )) {
				up = true;
			}
			if ((manRow < storeRow) && (manClo == storeClo )) {
				 down = true;
			}*/
			
		}
		
		public int path(int[][] a, int row, int clo) {
			if (row -1 == storeRow && clo == storeClo) return 1;
			if (row == storeRow && clo + 1 == storeClo) return 1;
			
		}
    }
}
