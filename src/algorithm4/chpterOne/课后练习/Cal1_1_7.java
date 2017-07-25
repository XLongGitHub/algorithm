/**
 * Created by Xulong on 2016/11/19.
 */
public class Cal1_1_7 {

	public 	static void print(Object o) {
			System.out.println(o);
	}

	public static void main(String args[]) {
		double t = 9.0;

		while (Math.abs(t - 9.0 / t) > .001) {
			t = (9.0 / t + t) / 2.0;
		}
		//print("%.5f", t);
//        System.out.print("%.5", t);
		System.out.println(t);

		/**
		 * b
		 */
		int sum = 0;

		for (int i = 1; i < 1000; i++) {
			for (int j = 0; j < i; j++)
				sum++;
		}
		print(sum);
		/**
		 * c
 		 */
		sum = 0;
		for (int i = 1; i<1000; i++)
			for(int j=0; j<1000; j++)
				sum++;
		print(sum);
	}
}
