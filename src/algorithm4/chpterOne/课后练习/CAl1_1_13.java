package algorithm4.chpterOne.课后练习;

/**
 * Created by Xulong on 2016/11/19.
 */
public class CAl1_1_13 {
	public static final int ROW = 10;
	public static final int CLO = 10;

	public static void main(String args[]) {

	int arr[][] = {{54,6,47,3,4,1,6,46,0,0},
				{146,8,7,3,8,643,24,0,1,54646},
				{146,8,7,3,643,24,6,8,4,6},
				{146,7,3,8,643,4,4,6,2,8},
				{1,7,363,24,6,8,46,32,323,434},
				{46,87,3,24,6,8,4,6,54,65},
				{146,871643,24,6,8,43,434,54,65,56},
				{146,8,7,31,863,24,684,6,65,65},
				{146,8,7,31,48,63,24,6,8,75},
				{14,6,87,31,48,6,43,24,68,46} };

		int tem_arr[][] = new int[ROW][CLO];

		for (int i=0; i<ROW; i++) {
			for (int j=0; j<CLO; j++) {
				tem_arr[j][i] = arr[i][j];
			}
		}
		arr = tem_arr;

		for (int i=0; i<ROW; i++) {
			for (int j=0; j<CLO; j++) {
				System.out.print("  "+arr[i][j]);
			}
			System.out.print('\n');
		}
	}
}
