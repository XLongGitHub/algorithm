package algorithm4.chpaterFourAfter;

public class DepthFirstSearch {
    private boolean[] marked;
    private int count;

    public DepthFirstSearch(Graph G, int s) {
        marked = new boolean[G.V()];
        dfs(G, s);
    }

    /**
     * 深度优先遍历
     * @param graph
     * @param v
     */
    public void dfs(Graph graph, int v) {
        marked[v] = true;
        count++;
        for (int w : graph.adj(v)) {
            if (!marked[w]) dfs(graph, w);
        }
    }

    public boolean marked(int w) {
        return marked[w];
    }

    public int count() {
        return count;
    }

}
