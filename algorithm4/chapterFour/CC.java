package algorithm4.chapterFour;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class CC {
	private boolean[] marked;
	private int[] id;  		// 每组分量的ID
	private int count;     //连通分量数
	
	public CC(Graph G) {
		marked = new boolean[G.V()];
		id  = new int[G.V()];
		for (int s = 0; s < G.V(); s++)
			if (!marked[s]) {
				dfs(G, s);
				count++;       
			}
	}
	/**
	 * 同一组连通分量，id相同
	 * @param G
	 * @param v
	 */
	private void dfs(Graph G, int v) {
		marked[v] = true;
		id[v] = count;
		for (int w : G.adj(v))
			if (!marked[w])
				dfs(G, w);
	}
	
	public boolean connected(int v, int w) {
		return id[v] == id[w];
	}
	
	public int id(int v) {
		return id[v];
	}
	
	public int count() {
		return count;
	}
	
	
	public static void main(String[] args) {
		Graph G = new Graph(new In("tinyG.txt"));
		CC cc = new CC(G);
		
		int M = cc.count;
		StdOut.println(M + " Components");
		
		Bag<Integer> []components;
		components = (Bag<Integer>[])new Bag[M];
		for (int i = 0; i < M; i++ )
			components[i] = new Bag<Integer>();
		//分组
		for (int v = 0; v < G.V(); v++)
			components[cc.id(v)].add(v);
		//遍历输出
		for (int i = 0; i < M; i++) {
			for (int v : components[i])
				StdOut.print(v + " ");
			StdOut.println();
		}
	}
}
