package algorithm4.chpterOneAfter;

/**
 * Created by Xulong on 2016/11/19.
 */
public class Cal1_1_12 {
	public static void main(String args[]) {
		int[] a = new int[10];

		for (int i=0; i<10; i++) {
			a[i] = 9 - i;
		}

		for (int i=0; i<10; i++) {
			a[i] = a[a[i]];   //原数组中，部分数据被新生成的数据覆盖
		}

		for (int i=0; i<10; i++) {
			System.out.println(a[i]);
		}
	}
}
