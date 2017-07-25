import java.util.Iterator;
import java.util.List;

public class TestStack<Item> implements Iterable{
	private Node first;
	private int N;
	List list = null;
	public boolean isEmpty() {
		return N == 0;
	}
	
	public int size() {
		return N;
	}
	
	public void push(Item item) {
		
		Node oldFirst  = first;
		first = new Node();
		first.item = item;
		first.next = oldFirst;
		N++;
	}
	
	public Item pop() {
		Item item = first.item;
		first = first.next;
		N--;
		return item;
	}
	
	

	
	public static void main(String[] args) {
		
	}
	private class Node {
		Item item;
		Node next;
	}
	@Override
	public Iterator iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator {
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
