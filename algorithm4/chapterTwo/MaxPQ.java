package algorithm4.chapterTwo;

import edu.princeton.cs.algs4.StdOut;
/**
 * 堆排序
 * @author Xulong
 *
 * @param <Key>
 */
public class MaxPQ <Key extends Comparable<Key>> {
	
	private Key[] pq;
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
		pq[++N] = v;
		swim(N);
	}
	
	public Key delMax() {
		Key max = pq[1];
		/*exch(1, N--);    //先传N，再自减
		pq[N+1] = null;*/
		exch(1, N);
		pq[N] = null;
		N--;
		sink(1);
		return max;
	}
	
	public boolean less(int i, int j) {
		return pq[i].compareTo(pq[j]) < 0;
	}
	
	public void exch(int i, int j) {
		Key t = pq[i];
		pq[i] = pq[j];
		pq[j] = t;
	}
	
	public void swim(int k) {
		while ( k > 1 && less(k/2, k)) {
			exch(k/2, k);
			k = k/2;
		}
	}
	
	public void sink(int k) {
	//	StdOut.println("\nsink");
		while (2*k <= N) {     //有子节点
			int j = 2 * k;    //得到第一个子节点的位置
			if (j<N && less(j, j+1)) j++;  //与子节点中较大的那一个点进行交换，只有一个子节点时不交换
			if (!less(k, j)) break;
			exch(k, j);
			k = j;
		}
		//StdOut.println("ma = " + pq[1]);
	}
	
	public void show() {
		int floor = 2;
		for (int i=1; i<pq.length; i++) {
			StdOut.print(pq[i] + " ");
			if ((i+1) % floor == 0) {
				StdOut.println();
				floor = 2 * floor;
			} 
		}
		StdOut.println();
	}
	
	public static void main(String[] args) {
		MaxPQ  pp = new MaxPQ(10);
		for (int i = 10; i<20; i++) {
			pp.insert(i);
		}
//		for (int i=0; i<10; i++) {
//			StdOut.println(pp.delMax());
//		}
		
		pp.show();
	}

}
