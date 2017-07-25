package chapterFour;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

public class Graph {
	private final int V;     //顶点数目
	private int E;			//	边的数目
	private Bag<Integer>[] adj; //邻接表
	
	public Graph(int V) {
		this.V = V;
		setAdj((Bag<Integer>[]) new Bag[V]); //创建邻接表 
		for (int v = 0; v < V; v++)    //将所有邻接表初始化为空
			getAdj()[v] = new Bag<Integer>();
	}
	
	public Graph(In in) {
		this(in.readInt());              //读取v将图初始化
		int E = in.readInt();            //读取E
		for (int i = 0; i < E; i++) {
			//添加一条边
			int v = in.readInt();  //读取一个顶点        
			int w = in.readInt();  //读取另一个顶点
			addEdge(v, w);          //添加一个连接它们的边
		}
	}
	
	public int V() {
		return V;
	}
	
	public int E() {
		return E;
	}
	
	public void addEdge(int v, int w) {
		getAdj()[v].add(w);     //将w添加到v的链表中
		getAdj()[w].add(v);     //将v添加到w的链表中
		E++;
	}
	
	public Iterable<Integer> adj(int v) {
		return getAdj()[v];
	}
	
	public String toString() {
		String s = V + " vertices, " + E + " edges\n";
		for (int v = 0; v < V ; v++) {
			s += v + ": ";
			for (int w : this.adj(v))
				s += w + " ";
			s += "\n";
		}
		return s;
	}
	
	public static void main(String[] args) {
		In in = new In("tinyG.txt");
		Graph g = new Graph(in);
		StdOut.println(g.toString());
	}

	public Bag<Integer>[] getAdj() {
		return adj;
	}

	public void setAdj(Bag<Integer>[] adj) {
		this.adj = adj;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
