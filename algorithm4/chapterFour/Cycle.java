package algorithm4.chapterFour;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

/**
 * G是无环图嘛？(假设不存在自环和平行边)
 * @author Xulong
 *
 */
public class Cycle {
	private boolean[] marked;
	private boolean hasCycle;
	
	public Cycle(Graph G) {
		marked = new boolean[G.V()];
		
		for (int s = 0; s < G.V(); s++) {
			if (!marked[s])
				dfs(G, s, s);
		}
	}
	
	private void dfs(Graph G, int v, int u) {
		marked[v] = true;
		for (int w : G.adj(v))
			if (!marked[w])
				dfs(G, w, v);
			else if (w != u) hasCycle = true;      //邻接点被标记，有圈
	}
	
	public boolean hasCycle() {
		return hasCycle;
	}
	
	
	public static void main(String[] args) {
		Graph G = new Graph(new In("tinyG.txt"));
		Cycle cycle = new Cycle(G);
		StdOut.println(cycle.hasCycle);
		
	}
	
}
