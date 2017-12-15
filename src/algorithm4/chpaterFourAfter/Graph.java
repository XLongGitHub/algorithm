package algorithm4.chpaterFourAfter;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.In;

/**
 * 用邻接表数组来表示图
 */
public class Graph {
    private final int V;   //顶点数目
    private int E;          //边数
    private Bag<Integer>[] adj;     //邻接表

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        adj = new Bag[V];      //创建邻接表
        for (int v = 0;v < V; v++) {
            adj[v] = new Bag<Integer>();   //将所有链表初始化为空
        }
    }

    public Graph(In in) {
        this(in.readInt());
        int E = in.readInt();
        for (int i = 0; i < E; i++){
            int v = in.readInt();
            int w = in.readInt();
            addEdge(v, w);
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public Iterable<Integer> adj(int v) {
        return adj[v];
    }
}
