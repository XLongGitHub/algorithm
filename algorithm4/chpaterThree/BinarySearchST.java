package chpaterThree;

import java.security.Key;

import edu.princeton.cs.algs4.Queue;

public class BinarySearchST<Key extends Comparable<Key>, Value> {
	private Key[] keys;
	private Value[] vals;
	private int N;
	
	public BinarySearchST(int capacity) {
		keys = (Key[]) new Comparable[capacity];
		vals = (Value[]) new Object[capacity];
	}
	
	public int size() {
		return N;
	}
	
	public Value get(Key key) {
		if (isEmpty()) return null;
		int i = rank(key);
		if (i<N && keys[i].compareTo(key) == 0) return vals[i];
		else return null;
	}
	/**
	 * 二分查找，迭代
	 * @param key
	 * @return
	 */
	private int rank(Key key) {
		int lo = 0; 
		int hi = N - 1;
		while (lo <= hi) {
			int mid = (lo + hi) / 2;
			int cmp = key.compareTo(keys[mid]);
			if (cmp < 0) hi = mid -1;
			if (cmp > 0) lo = mid + 1;
			else return mid;
		}
		return lo;
	}

	private boolean isEmpty() {
		return N == 0;
	}
	
	public void put(Key key, Value val) {
		int i =rank(key);
		if (i < N && keys[i].compareTo(key) == 0) {
			vals[i] = val;
		}
		//后移，创建新的元素
		for (int j=N; j>i; j--) {
			keys[j] = keys[j-1];
			vals[j] = vals[j-1];
		}
		keys[i] = key;
		vals[i] = val;
		N++;
	}
	
	 public Key min() {
		 return keys[0];
	}
	 
	 public Key max() {
		 return keys[N-1];
	 }
	 
	 public Key select(int k) {
		 return keys[k];
	 }
	 
	 public Key celling(Key key) {
		 int i = rank(key);
		 return keys[i];
	 }
	 
	/* public Key floor(Key key) {
		 
	 }
	 */
/*	 
	 public Iterable<Key> keys(Key lo, Key hi) {
		 Queue<Key> q = new Queue<Key>();w
		 for (int i=rank(lo); i <rank(hi); i++)
			 q.enqueue(keys[i]);
		 if (q.contains(hi)) {
			 q.enqueue(keys[rank(hi)]);
		 }
		 return q;
	 }*/
	 
 }
