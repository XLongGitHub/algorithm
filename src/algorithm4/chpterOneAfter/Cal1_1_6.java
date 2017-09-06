package algorithm4.chpterOneAfter;

/**
 * Created by Xulong on 2016/11/19.
 */
public class Cal1_1_6 {
    public static void main(String args[]) {
        int f = 0;
        int g = 1;
        for (int i=0; i<=15; i++) {
		print(f);
		f = f + g;
		g = f - g;
        }
    }

    static void print(Object o) {
	    System.out.println(o);
    }
}



