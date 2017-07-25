package algorithm4.other;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;
import edu.princeton.cs.algs4.StdOut;

public class Cat {
	public static void main(String[] args) {
		/*Out out = new Out(args[args.length - 1]);
		
		for (int i=0; i<args.length; i++) {
			In in = new In(args[i]);
			String s = in.readAll();
			out.println(s);
			in.close();
		}*/
		
		In in = new In("tinyW.txt");
		String s = in.readAll();
		StdOut.println(s);
		System.out.println("end");
	}
}
