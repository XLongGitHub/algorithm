package chapterFour;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdOut;

public class DepthFirstPaths {
	private boolean[] marked;   //这个顶点调用dfs()了吗？
	private int[] edgeTo;        //从起点到一个顶点的一直路径上的最后·一个顶点
	private final int s;         //起点
	
	public DepthFirstPaths(Graph G, int s) {
		marked = new boolean[G.V()];
		edgeTo = new int[G.V()];
		this.s = s;
		dfs(G, s);
	}
	//单向图
	private void dfs(Graph G, int v) {
		marked[v] = true;
		for (int w : G.adj(v))
			if (!marked[w]) {
				edgeTo[w] = v;
				dfs(G, w);
			}
	}
	
	public boolean hasPathTo(int v) {
		return marked[v];
	}
	
	public Iterable <Integer> pathTo(int v) {
		if (!hasPathTo(v)) return null;
		Stack<Integer> path = new Stack<Integer>();
		//从终点不断退向起点
		for (int x = v; x != s; x = edgeTo[x])
			path.push(x);
		path.push(s);
		return path;
	}
	
	public static void main(String[] args) {
		Graph G = new Graph(new In("tinyGG.txt"));
		int s = 0;
		
		DepthFirstPaths dfp = new DepthFirstPaths(G, s);
		//起点到图中其他点的所有路径
		for(int v = 0; v < G.V(); v++) {
			StdOut.print(s + " to " + v +": ");
			if (dfp.hasPathTo(v)) {
				for (int x : dfp.pathTo(v))
					if (x == s) StdOut.print(x);
					else StdOut.print("-"+x);
				StdOut.println();
			}
		}
	}
}
