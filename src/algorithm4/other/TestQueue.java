import java.util.Iterator;

public class TestQueue<Item> implements Iterable {
	private Node first;
	private Node last;
	private int N;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public boolean isEmpty() {
		return 0 == N;
	}
	
	public int size() {
		return N;
	}
	
	public void enqueue(Item item) {
		Node oldLast = last;
		last = new Node();
		last.item = item;
		last.next = null;
		if (isEmpty()) first = last;
		else oldLast.next = last;
		N++;
	}
	
	public Item dequeue() {
		Node oldFirst = first;
		first = first.next;
		if (isEmpty()) first = null;
		else N--;
		return oldFirst.item;
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public Iterator iterator() {
		return null;
	}
	
	private class ListItrator implements Iterator {
		private Node current = first;
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Item next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}

}
