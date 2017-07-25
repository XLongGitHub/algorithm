import java.util.Iterator;

public class TestList<Item> implements Iterable{
	private Node first;
	
	private class Node {
		Item item;
		Node next;
	}
	
	public Node create_list() {
		Node  head = new Node();
		head.next = null;
		return head;
	}
	
	public void delete_list(Node head) {
		if (head == null) return;
		
		
	}
	
	public void insert_list(Node node) {
		
	}
	
	public void traverse_list(Node node) {
		
	}
	
	public static void main(String[] args) {
		
	}

	@Override
	public Iterator iterator() {
		return new ListIterator();
	}
	
	private class ListIterator implements Iterator {
		private Node  current = first;
		
		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public Object next() {
			Item item = current.item;
			current = current.next;
			return item;
		}
		
	}
}
