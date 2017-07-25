//package algorithm4.chpaterThree;
//
//import edu.princeton.cs.algs4.Queue;
//
//public class BST <Key extends Comparable<Key>, Value>{
//	public Node root;
//
//	private class Node{
//		@Override
//		public String toString() {
//			return "key : " + key + "  value:  " + val;
//		}
//
//		private Key key;
//		private Value val;
//		private Node left, right;
//		public int N;
//
//		public Node(Key key, Value val, int  N) {
//			this.key = key;
//			this.val = val;
//			this.N = N;
//		}
//	}
//	/**
//	 * 返回当前二叉查找树的大小
//	 * @return
//	 */
//	public int size() {
//		return size(root);
//	}
//
//	private int size(Node x) {
////		return x.left.N + x.right.N + 1;
//		if (x == null) return 0;
//		return x.N;
//	}
//
//	public Value get(Key key) {
//		return get(root, key);
//	}
//
//	private Value get(Node x, Key key) {
//		if (x == null) return null;
//		int cmp = key.compareTo(x.key);
//		if (cmp < 0) return get(x.left, key);
//		if (cmp > 0) return get(x.right, key);
//		return x.val;
//	}
//
//	public void put(Key key, Value val) {
//		root = put(root, key, val);
//	}
//
//	private BST<Key, Value>.Node put(Node x, Key key, Value val) {
//		if (x == null) return new Node(key, val, 1);
//		int cmp = key.compareTo(x.key);
//		if (cmp < 0) x.left = put(x.left, key, val); //保证连接点不断掉
//		else if (cmp > 0) x.right = put(x.right, key, val);
//		else x.val = val;                //已经存在这个键时，更新对应的值
//		x.N = size(x.left) + size(x.right) + 1;
//		return x;
//	}
//	/**
//	 * 连接断掉了
//	 * @param args
//	 */
////	public void put(Key key, Value val) {
////		put(root, key, val);
////	}
////
////	private void put(BST<Key, Value>.Node x, Key key, Value val) {
////		if (x == null) x =  new Node(key, val, 0);
////		int cmp = key.compareTo(x.key);
////		if (cmp < 0) put(x.left, key, val);
////		if (cmp > 0) put(x.right, key, val);
////	}
//
//	public Key min() {
//		return min(root).key;
//	}
//
//	private Node min(Node x) {
//		if (x.left == null) return x;
//		return min(x.left);
//	}
//
//	public Key max() {
//		return max(root).key;
//	}
//	public Node max(Node x) {
//		if (x.right == null) return x;
//		return max(x.right);
//	}
//
//	public Key floor(Key key) {
//		Node x = floor(root, key);
//		if (x == null) return null;
//		return x.key;
//	}
//
//	private Node floor(Node x, Key key) {
//		if (x == null) return null;
//		int cmp = key.compareTo(x.key);
//		if (cmp == 0) return x;
//		if (cmp < 0) return floor(x.left, key);
//		Node t = floor(x.right, key);
//		if (t != null) return t;
//		else return x;
//	}
//
//	public Key ceiling(Key key) {
//		Node x = ceiling(root, key);
//		if (x == null) return null;
//		return x.key;
//	}
//	private Node ceiling(Node x, Key key) {
//		if (x == null) return null;
//		int cmp = key.compareTo(x.key);
//		if (cmp == 0) return x;
//		if (cmp > 0) return ceiling(x.right, key);
//		Node t = ceiling(x.left, key);
//		if (t != null) return t;
//		else return x;
//	}
//
//	public Key select(int k) {
//		return select(root, k).key;
//	}
//
//	private Node select(Node x, int k) {
//		if (x == null) return null;
//
//		int t = size(x.left);
//		if      (t > k ) return select(x.left, k);
//		else if (t < k ) return select(x.right, k - t - 1);
//		else return x;
//	}
//
//	public int rank(Key key) {
//		return rank(root, key);
//	}
//
//	private int rank(Node x, Key key) {
//		if (x == null) return 0;
//		int cmp = key.compareTo(x.key);
//		if (cmp < 0) return rank(x.left, key);
//		else if (cmp > 0) return 1 + rank(x.right, key) + rank(x.left, key);
//		else return size(x.left);
//
//	}
//
//	public void deleteMin() {
//		root = deleteMin(root);
//	}
//
//	private Node deleteMin(Node x) {
//		if (x.left == null) return x.right;  //若右子节点存在，则将该右节点作为左节点，替代之前的左子节点，否则将该节点置为空，删除该节点
//		x.left = deleteMin(x.left);
//		x.N = size(x.left) + size(x.right) + 1;
//		return x;
//	}
//
//	public void delete(Key key) {
//		root = delete(root, key);
//	}
//	private Node delete( Node x, Key key) {
//		if (x == null) return null;
//		int cmp = key.compareTo(x.key);
//		if (cmp < 0) x.left =  delete(x.left, key);
//		else if (cmp > 0) x.right =  delete(x.right, key);
//		else {
//			if (x.right == null) return x.left;
//			if (x.left == null) return x.right;
//			Node t = x;
//			x = min(x.right);
//			x.right = deleteMin(t.right);
//			x.left = t.left;
//		}
//		x.N = size(x.left) + size(x.right) + 1;
//		return x;
//	}
//	public void print() {
//		print(root);
//	}
//
//	public void print(Node x) {
//		if (x == null) return;
//		print(x.left);
//		System.out.println(x.key+ " "+x.val);
//		print(x.right);
//	}
//
//	public Iterable<Key> keys () {
//		return keys(min(), max());
//	}
//
//
//	public  Iterable<Key> keys(Key lo, Key hi) {
//		Queue<Key> queue = new Queue<Key>();
//		keys(root, queue, lo, hi);
//		return queue;
//	}
//
//	private void keys(Node x, Queue<Key> queue, Key lo, Key hi) {
//		if (x == null) return;
//		int cmplo = lo.compareTo(x.key);
//		int cmphi = hi.compareTo(x.key);
//		if (cmplo < 0) keys(x.left, queue, lo, hi); //确保取完左子节点
//		if (cmplo <= 0 && cmphi >= 0) queue.enqueue(x.key);
//		if (cmphi > 0) keys(x.right, queue, lo, hi); //确保取完右子节点
//	}
//	/**
//	 *
//	 * @param key
//	 * @return
//	 */
//	public Value select2(Key key) {
//		return select2(root, key);
//	}
//	private Value select2(Node x, Key key) {
//		if (x == null) return null;
//		int cmp = key.compareTo(x.key);
//		if (cmp < 0) return select2(x.left, key);
//		else if (cmp > 0) return select2(x.right, key);
//		return x.val;
//	}
//	/**
//	 * 非递归实现
//	 * @param key
//	 * @return
//	 */
//	public Value get2(Key key) {
//		Node x = root;
//		while (x != null) {
//			int cmp = key.compareTo(x.key);
//			if (cmp < 0) x = x.left;
//			else if (cmp > 0) x = x.right;
//			else return x.val;
//		}
//		return null;
//	}
//	/**
//	 * 非递归插入数据
//	 * @param key
//	 * @param val
//	 */
//	public void put2(Key key, Value val) {
//		Node x = root;
//		Node p = x;
//		if (x == null) root = new Node(key, val, 1);
//
//		while(true) {
//			if (p == null) {
//				p = new Node(key, val, 1);
//			}
//			int cmp = key.compareTo(p.key);
//			if (cmp < 0)  p = p.left;
//			if (cmp > 0)  p = p.right;
//			if (cmp == 0) p.val = val;
//		}
//	}
//
//	public static void main(String[] args) {
//		BST<String, Integer> bst = new BST<String, Integer>();
//		bst.put("e", 1);
//		bst.put("a", 2);
//		bst.put("s", 3);
//		bst.put("y", 4);
//		bst.put("q", 5);
//		bst.put("u", 6);
//		bst.put("e", 7);
//		bst.put("s", 8);
//		bst.put("t", 9);
//		bst.put("i", 10);
//		bst.put("o", 11);
//		bst.put("n", 12);
//		System.out.println(bst.get("a"));
//
////		System.out.println(bst.size());
////		System.out.println(bst.max());
////		System.out.println(bst.min());
////		System.out.println("floor   " + bst.floor("w"));
////		System.out.println("ceiling " + bst.ceiling("f"));
//		for (int i = 0; i < bst.size(); i++) {
//			System.out.print(" " +  bst.select(i));
//		}
//		System.out.println();
////		System.out.println(bst.rank("a"));
////		bst.deleteMin();
//		bst.delete("o");
//		for (int i = 0; i < bst.size(); i++) {
//			System.out.print(" " +  bst.select(i));
//		}
//		Queue q = (Queue) bst.keys("a", "z");
////		for (Object n : q)
////			System.out.println(n);
////		for (I item = q.iterator(); item.hasNext();) {
////			item = item.next();
////			System.out.println(item);
////		}
//		//bst.print();
////		StdOut.println(bst.select2("s"));
////		System.out.println(bst.get2("s"));
//		bst.put2( "e", 3);
//		for (int i = 0; i < bst.size(); i++) {
//			System.out.print(" " +  bst.select(i));
//		}
//	}
//
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
