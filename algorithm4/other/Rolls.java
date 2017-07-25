package algorithm4.other;
import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class Rolls {
	public static void main(String[] args) {
		int T = 100;
		int SIDES = 6;
		Counter[] rolls = new Counter[SIDES+1];
		for (int i=0; i<= SIDES; i++)
			rolls[i] = new Counter(i+"'s");
		for (int j=0; j<T; j++) {
			int result = StdRandom.uniform(1, SIDES+1);
			rolls[result].increment();
		}
		for (int i=1; i<=SIDES; i++)
			StdOut.println(rolls[i]);
		
	}
}
