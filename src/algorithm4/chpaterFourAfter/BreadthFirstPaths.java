package algorithm4.chpaterFourAfter;


import edu.princeton.cs.algs4.Queue;
import edu.princeton.cs.algs4.Stack;

import java.util.LinkedList;
import java.util.List;

public class BreadthFirstPaths {
    private boolean[] marked;
    private int[] edgeTo;
    private final int s;

    public BreadthFirstPaths(Graph graph, int s) {
        marked = new boolean[graph.V()];
        edgeTo = new int[graph.V()];
        this.s = s;
        bfs(graph, s);
    }

    private void bfs(Graph graph, int s) {
        Queue<Integer> queue = new Queue<>();
        marked[s] = true;
        queue.enqueue(s);
        while (!queue.isEmpty()) {
            int v = queue.dequeue();
            for (int w : graph.adj(v)) {
                edgeTo[w] = v;
                marked[w] = true;
                queue.enqueue(w);
            }
        }
    }

    public boolean hasPathTo(int v) {
        return marked[v];
    }

    public Iterable pathTo(int v) {
//        List list = new LinkedList();
        if (!hasPathTo(v)) return null;
        Stack<Integer>  path = new Stack();
        for (int w = v; w != s; w = edgeTo[w]) {
            path.push(w);
        }
        path.push(s);
        return path;
    }
}
