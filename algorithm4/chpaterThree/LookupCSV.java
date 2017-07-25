package algorithm4.chpaterThree;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.ST;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class LookupCSV {
	public static void main(String[] args) {
		In in = new In(args[0]);
		int keyFields = Integer.parseInt(args[1]);
		int valFields = Integer.parseInt(args[2]);
		
		ST<String, String> st = new ST<String, String>();
		while(in.hasNextLine()) {
			String line = in.readLine();
			String[] tokens = line.split(",");
			String key = tokens[keyFields];
			String val = tokens[keyFields];
			st.put(key, val);
		}
		
		while (!StdIn.isEmpty()) {
			String query = StdIn.readString();
			if (st.contains(query))
				StdOut.println(st.get(query));
		}
		
	}
}
