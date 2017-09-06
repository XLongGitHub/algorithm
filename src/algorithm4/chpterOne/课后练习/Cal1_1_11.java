package algorithm4.chpterOne.课后练习;

/**
 * Created by Xulong on 2016/11/19.
 */
public class Cal1_1_11 {
	public static void main(String args[]) {
		int arr[][] = {{2,3,2,3},
						{2,3},
						{6,5,4,6},
						{1,2,4,5,4,68},
						{4,6,9,7,9,8,3,4,                                                                  7,9}};
//        System.out.print(arr.length);
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
     			System.out.print("  " + compare(arr[i][j]));
            }
            System.out.println('\n');

		}
	}

	public static char compare(int arr) {
		if (arr == ' ')
			return  ' ';
		return '*';
	}
}
