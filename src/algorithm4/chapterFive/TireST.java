package chapterFive;

import edu.princeton.cs.algs4.Queue;
import newke.Nu;

public class TireST<Value> {
	private static int R = 256;		//基数
	private Node root;				//单词查找树的根节点
	
	private static class Node {
		private Object val;
		private Node[] next = new Node[R];
	}
	
	//即时实现：单独用一个实例变量N进行保存
	//延时递归实现：利用如下方法，遍历单词查找树的所有节点，并记录非空节点的总数
	
	public int size() {
		return size(root);
	}
	
	private int size(Node x) {
		if (x == null) return 0;
		
		int cnt = 0;
		if (x.val != null) cnt ++;
		for (char c = 0; c < R; c++)
			cnt += size(x.next[c]);
		return cnt;
	}
	
	public Value get(String key) {
		Node x = get(root, key, 0);
		if (x == null) return null;
		return (Value) x.val;		//Java不支持泛型数组。所以Node中的值类型必须是Object
	}
	//沿着树的某一个分支，不断向下查找
	private Node get(Node x, String key, int d) {
		//返回以x作为根节点的子单词查找树中与key想关联的值
		if (x == null) return null;
		if (d == key.length()) return x;
		char c = key.charAt(d);		//找到第d个字符所对应的子单词查找树
		return get(x.next[c], key, d + 1);
	}
	
	public void put(String key, Value val) {
		root = put(root, key, val, 0);
	}
	
	private Node put(Node x, String key, Value val, int d) {
		//如果key存在以x为根节点的子单词，查找树中则更新与它相关联的值
		if (x == null) x = new Node();
		if (d == key.length()) {
			x.val = val; return x;
		}
		char c = key.charAt(d);			//找到第d个字符所对应的子单词查找树
		x.next[c] = put(x.next[c], key, val, d + 1);
		return x;
	}
	
	//查找所有的键
	public Iterable<String> keys() {
		return keysWithPrefix("");
	}
	
	public Iterable<String> keysWithPrefix(String pre) {
		Queue<String> q = new Queue<String>();
		collect(get(root, pre, 0), pre, q);
		return q;
	}

	private void collect(Node x, String pre, Queue<String> q) {
		if (x == null) return;
		if (x.val != null) q.enqueue(pre);
		for (char c = 0; c < R; c++) 
			collect(x.next[c], pre + c, q);
	}
	
	//通配符匹配
	public Iterable<String> keysThatMatch(String pat) {
		Queue<String> q = new Queue<String>(); 
		collect(root, "", pat, q);
		return q;
	}

	private void collect(Node x, String pre, String pat, Queue<String> q) {
		int d = pre.length();
		if (x == null) return;
		if (d == pat.length() && x.val != null) q.enqueue(pre);
		if (d == pat.length()) return;
		
		char next = pat.charAt(d);
		for (char c = 0; c < R; c++)
			if (next == '.' || next == c)
				collect(x.next[c], pre + c, pat, q);
	}
	//最长前缀
	public String longestPrefixOf(String s) {
		int length = search(root, s, 0, 0);
		return s.substring(0, length);
	}
	
	private int search(Node x, String s, int d, int length) {
		if (x == null) return length;
		if (x.val != null) length = d;
		if (d == s.length()) return length;
		char c = s.charAt(d);
		return search(x.next[c], s, d+1, length);
	}
	
	public void delete(String key) {
		root = delete(root, key, 0);
	}
	
	private Node delete(Node x, String key, int d) {
		if (x == null) return null;
		if (d == key.length()) x.val = null;
		else {
			char c = key.charAt(d);
			x.next[c] = delete(x.next[c], key, d+1);
		}
		if (x.val != null) return x;
		
		for (char c = 0; c < R; c++) 
			if (x.next[c] != null) return x;
		return null;
	}
	
}
