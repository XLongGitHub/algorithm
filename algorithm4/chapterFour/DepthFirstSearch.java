package algorithm4.chapterFour;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;
/**
 * 将图每个路口存在的路径进行遍历，深度优先
 * @author Xulong
 *
 */
public class DepthFirstSearch {
	private boolean[] marked;
	private int count;
	
	public DepthFirstSearch(Graph G, int s) {
		marked = new boolean[G.V()];
		dfs(G, s);
	}
	
	private void dfs(Graph G, int v) {
		marked[v] = true;
		count++;
StdOut.print(v+"-->");
		for (int w : G.adj(v))
			if (!marked[w]) dfs(G,w);
	}
	
	public boolean marked(int w) {
		return marked[w];
	}
	
	public int count() {
		return count;
	}
	
	public static void main(String[] args) {
		Graph G = new Graph(new In("tinyG.txt"));
		DepthFirstSearch D = new DepthFirstSearch(G, 0);
	}
}
