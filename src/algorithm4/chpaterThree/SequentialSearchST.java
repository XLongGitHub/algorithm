package chpaterThree;

public class SequentialSearchST<Key, Value> {
	private Node first;
	
	private class Node {
		Key key;
		Value value;
		Node next;
		
		public Node (Key key, Value value, Node next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}
	
	public Value get(Key key) {
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key))
				return x.value;
		}
		return null;
	}
	
	
	public void put(Key key, Value value) {
		for (Node x = first; x != null; x = x.next) {
			if (key.equals(x.key)) {
				x.value = value;
				return;
			}
		}
		first = new Node(key, value, first);
	}
	
	public int size() {
		int size = 0;
		Node x = first;
		while (x != null) {
			size++;
			x = x.next;
		}
		return size;
	}
	
	public void  delete(Key key) {
		Node p = first;
		if (p.key.equals(key)) first = null;
		
		while (p.next != null && !p.next.key.equals(key)) {
			p = p.next;
		}
		if (p.next.key.equals(key)) {
			p = p.next.next;
		}
	}
	
	/*public Key[] keys() {
		int len = 0;
		int count = 0;
		len = size();
		Key[] keys = new Key[len];
		for (Node x = first; x != null; x = x.next) {
			keys[count++] = x.key;
		}
		Arrays.sort(keys);
		return keys;
	}
	*/
}
