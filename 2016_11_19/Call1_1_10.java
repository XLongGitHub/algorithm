/**
 * Created by Xulong on 2016/11/19.
 */
public class Call1_1_10 {
	public static final int Len = 10;
	public static void main(String args[]) {
		int [] a = new int[Len];
		for (int i=0; i<10; i++) {
			a[i] = i * i;
			System.out.println(a[i]);
		}
	}
}
