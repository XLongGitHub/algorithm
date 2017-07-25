import java.io.FileWriter;
import java.io.IOException;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq {
	public static void main(String[] args) {
		FileWriter fw = null;
		
		int N = Integer.parseInt(args[0]);
		double lo = Double.parseDouble(args[1]);
		double hi = Double.parseDouble(args[2]);
		
		/*for (int i=0; i<N; i++) {
			double x = StdRandom.uniform(lo, hi);
			StdOut.printf("%2f\n", x);
		}*/
		
		try {
			fw = new FileWriter("d:/share/java/data.txt");
			for (int i=0; i<N; i++) {
				double x = StdRandom.uniform(lo, hi);
			//	StdOut.printf("%2f\n", x);
				fw.write("\n"+x);
			}
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}

        