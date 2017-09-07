package algorithm4.chpterOne;

public class WeightedQuickUnionUF {
    private int[] id; //点数
    private int[] sz;//用来保存数的大小
    private int count;

    public WeightedQuickUnionUF(int N) {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++) id[i] = i;
        sz = new int[N];
        for (int i = 0; i < N; i++) sz[i] = 1;
    }

    public int count() {
        return count;
    }

    public boolean connected(int p, int q) {
        return find(p) == find(q);
    }

    public int find(int p) {
        while (p != id[p]) p = id[p];
        return p;
    }

    public void union(int p, int q) {
        int pId = find(p);
        int qId = find(q);
        if (pId == qId) return;
        if (sz[pId] > sz[qId]) {
            id[qId] = id[pId];
            sz[pId] += sz[qId];
        } else {
            id[pId] = id[qId];
            sz[qId] += sz[pId];
        }
        count--;
    }

}
