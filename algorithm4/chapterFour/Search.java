package algorithm4.chapterFour;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Search {
	private int [] v;
	private Graph graph;
	private int source;
	public Search(Graph graph, int s) {
		this.source = s;
		this.graph = graph;
		v = new int[count()];
		int i = 0;
		for (int w : graph.getAdj()[s]) {
			v[i++] = w;
			if (i == count())
				break;
		}
	}
	
	public boolean marked(int v) {
		for (int w : graph.getAdj()[source])
			if (w == v) return true;
			//StdOut.println("w " + w);
		return false;
	}
	
	public int count() {
		return graph.getAdj()[source].size();
	}
	
	
	
	public static void main(String[] args) {
		Graph G = new Graph(new In("tinyG.txt"));
		int s =0; //Integer.parseInt("1");
		Search search = new Search(G, s);
		StdOut.println(search.count());
		
		for (int v = 0; v<G.V(); v++) 
			if (search.marked(v))
				StdOut.print(v + " ");
		StdOut.println();
		
		if (search.count() != G.V())
			StdOut.print("NOT");
		StdOut.print("connected");
		
	}
}
