import edu.princeton.cs.algs4.StdOut;

public class Neww {
	public static void main(String[] args) {
		int x = 0, n = 0 , k = 0, l = 0;

		for (; x<10; x++) {
			for (n=0;n<10; n++) {
				for (k=0; k<10; k++) {
					for(l=0; l<10; l++) 
						if (2001 == (l + k*11 +n*111 + x * 1111))
						{
							StdOut.println("新= "+x+" 年= "+n+" 快= "+k+" 乐= "+l);
							System.exit(0);
						}
				}
			}
		}
	}
	
	/*public static boolean su(int a, int b, int 
	 * +-c, int d) {
		int sum = 0;
		while (true) {
			sum = a + b + c + d + (a+b+c) * 10 +(a+b)*100 + a * 1000;
			if (sum == 2001)
			
		}
		return false;
	}*/
}
