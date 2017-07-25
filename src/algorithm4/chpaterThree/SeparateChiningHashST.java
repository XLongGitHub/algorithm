package chpaterThree;

import edu.princeton.cs.algs4.SeparateChainingHashST;

public class SeparateChiningHashST<Key, Value> {
	private int N; //键值的对总数
	private int M; // 散列表的大小
	private SequentialSearchST<Key, Value>[] st;//存放链表对象的数组
	
/*	public SeparateChainingHashST<Key, Value>*/
	public SeparateChiningHashST() {
		this(997);
	}
	
	public SeparateChiningHashST(int M) {
		this.M = M;
		st = (SequentialSearchST<Key, Value>[])new SequentialSearchST[M];
		for (int i=0; i<M; i++) 
			st[i] = new SequentialSearchST();
	}
	
	private int hash(Key key) {
		return (key.hashCode() & 0x7fffffff) % M;
	}
	
	public Value get(Key key) {
		return (Value) st[hash(key)].get(key);
	}
	
	public void put(Key key, Value val) {
		st[hash(key)].put(key, val);
	}
	
}
