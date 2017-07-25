package algorithm4.other;
import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Flips {
	public static void main(String[] args) {
		//int T = Integer.parseInt(args[0]);
		int T = StdIn.readInt();
		Counter heads = new Counter("heads");
		Counter tails = new Counter("tails");
		
		for (int t=0; t<T; t++) {
			if (StdRandom.bernoulli(0.5))
				heads.increment();
			else tails.increment();
		}
		
		StdOut.println(heads);
		StdOut.println(tails);
		System.out.println(heads.tally());
		System.out.println(tails.tally());
		int a = heads.tally();
		int b = tails.tally();
		//int d = heads.tally() - heads.tally();
		int d = a - b;
		System.out.println(""+a + b);
		StdOut.println("delta: " + d);
	}
}
