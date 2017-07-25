package algorithm4.chapterTwoAfter;

import edu.princeton.cs.algs4.StdOut;

public class MaxPQ<Key extends Comparable<Key>> {
	private  Key[] pq;
	private int N = 0;
	
	public MaxPQ(int maxN) {
		pq = (Key[]) new Comparable[maxN+1];
	}
	
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void insert(Key v) {
		//不从0开始
		pq[++N] = v;
		swim(N);
	}
	
	public Key deMax() {
		Key max = pq[1];
		exch(1, N--);
		pq[N+1] = null;
		sink(1);
		return max;
	}
	
	private void swim(int k) {
		while (k > 1 && less(k/2, k)) {
			exch(k/2, k);
			k = k / 2;
		}
	}
	
	public void sink(int k) {
		while (k*2 <= N) { //还有下一层
			int j = 2 * k;
			if (j<N && less(j, j+1)) j++;
			if (!less(k, j)) break;
			exch(k, j);
			k = j;
		}
	}
	
	private void exch(int i, int k) {
		Key t = pq[i];
		pq[i] = pq[k];
		pq[k] = t;
	}

	private boolean less(int i, int k) {
		return pq[i].compareTo(pq[k]) < 0;
	}
	
	public static void main(String[] args) {
		MaxPQ<String> pqs = new MaxPQ<String>(10);
		pqs.insert("P");
		pqs.insert("R");
		pqs.insert("I");
		pqs.insert("O");
		StdOut.println(pqs.deMax());
		pqs.insert("R");
		StdOut.println(pqs.deMax());
		StdOut.println(pqs.deMax());
		pqs.insert("I");
		StdOut.println(pqs.deMax());
		pqs.insert("T");
		StdOut.println(pqs.deMax());
		pqs.insert("Y");
		StdOut.println(pqs.deMax());StdOut.println(pqs.deMax());StdOut.println(pqs.deMax());
		pqs.insert("Q");
		pqs.insert("U");
		pqs.insert("E");
		StdOut.println(pqs.deMax());StdOut.println(pqs.deMax());StdOut.println(pqs.deMax());
		pqs.insert("U");
		StdOut.println(pqs.deMax());
		pqs.insert("E");
		
	}
}
